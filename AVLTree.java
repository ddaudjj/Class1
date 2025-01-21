class AVLNode {
    int key;
    AVLNode left, right;
    int height;

    AVLNode(int d) {
        key = d;
        height = 1; // New node is initially added at leaf
    }
}

class AVLTree {
    AVLNode root;

    int height(AVLNode N) {
        if (N == null)
            return 0;
        return N.height;
    }

    
    int getBalance(AVLNode N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

        AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        
        x.right = y;
        y.left = T2;

        
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        
        return x;
    }

    
    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        
        y.left = x;
        x.right = T2;

        
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        
        return y;
    }

    
    AVLNode insert(AVLNode node, int key) {
        // Perform the normal BST insert
        if (node == null)
            return (new AVLNode(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys are not allowed
            return node;

        
        node.height = 1 + Math.max(height(node.left), height(node.right));

   
        int balance = getBalance(node);

       
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }


        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        
        return node;
    }

    
    AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    
    AVLNode deleteNode(AVLNode root, int key) {
        
        if (root == null)
            return root;

       
        if (key < root.key)
            root.left = deleteNode(root.left, key);

       
        else if (key > root.key)
            root.right = deleteNode(root.right, key);


        else {
            
            if ((root.left == null) || (root.right == null)) {
                AVLNode temp = root.left != null ? root.left : root.right;
                if (temp == null) {
                    return null;
                } else { // One child case
                    return temp;
                }
            }


            AVLNode temp = minValueNode(root.right);

  
            root.key = temp.key;
            root.right = deleteNode(root.right, temp.key);
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        // this node became unbalanced)
        int balance = getBalance(root);

        // If this node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // A utility function to print the preorder traversal of the tree
    void preOrder(AVLNode node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Constructing the AVL tree
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        // Print the preorder traversal of the AVL tree
        System.out.println("Preorder traversal of the constructed AVL tree is:");
        tree.preOrder(tree.root);

        // Deleting a node
        System.out.println("\nDeleting 10:");
        tree.root = tree.deleteNode(tree.root, 10);
        System.out.println("Preorder traversal after deletion:");
        tree.preOrder(tree.root);
    }
}