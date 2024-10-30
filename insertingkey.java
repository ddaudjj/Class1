class main {
    static int insertEnd(int[] arr, int n, int key, int capacity) {
        if (n >= capacity)
            return n;
        arr[n] = key;
        return (n + 1);
    }

    public static void main(String args[]) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 50;
        arr[4] = 70;
        int capacity = 20;
        int n = 5;
        int i, key = 26;
        
        System.out.print("\n Before Insertion:");
        for (i = 0; i < n; i++)
        System.out.print(arr[i] + "");
        
        //Inserting Key    
        n = insertEnd(arr, n, key, capacity);

        System.out.print("\n After Insertion:");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + "");
    }
}