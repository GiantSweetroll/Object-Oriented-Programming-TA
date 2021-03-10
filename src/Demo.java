public class Demo 
{
    public static void main (String args[])
    {
        /**
         * Array declaration.
         * 
         * Syntax:
         * dataType[] varName;
         * dataType varName[];
         */
        int[] myArray;
        int myArray2[];

        /**
         * Initializing an array
         * 
         * Syntax:
         * dataType[] varName = {item1, item2, item3};
         * dataType varName[] = new dataType[size];
         */
        int[] anotherArray = {3, 4, 5};
        int anotherArray2[] = new int[3];

        /** 
         * Access array
         */
        System.out.println("Accessing an array: ");
        int[] items = {4, 12, 32};
        int n = items[1];       //Get item at index 1
        System.out.println(n);  //Will print 12
        System.out.println();

        /**
         * Modifying the content of an array
         */
        System.out.println("Editing an array's content: ");
        items[1] = 19;          //Will update value at index 1
        n = items[1];
        System.out.println(n);
        System.out.println();

        /**
         * Length of array
         */
        System.out.println("Size of array: ");
        int arrLength = items.length;
        System.out.println(arrLength);
        System.out.println();

        /**
         * Looping through array
         */
        System.out.println("Loop through array: ");
        
        //First Way (using standard for loop)
        System.out.println("Using standard for loop");
        for (int i = 0; i < items.length; i++)
        {
            int item = items[i];
            System.out.println(item);
        }

        //Second Way (using advanced for loop)
        System.out.println("Using advanced for loop");
        for (int item : items)
        {
            System.out.println(item);
        }

        // System.out.println();

        /**
         * Multidimensional array
         */
        System.out.println("Multidimensional array: ");
        //2D array
        System.out.println("2D Array");
        int multiArray [][] = { {1, 2, 3, 4}, 
                                {5, 6, 7} };
        int x = multiArray[1][2];       //x will be 7
        System.out.println(x);

        System.out.println("Looping through 2D array");
        for (int row = 0; row < multiArray.length; row++)
        {
            for (int col = 0; col < multiArray[row].length; col++)
            {
                int item = multiArray[row][col];
                System.out.print(item + ", ");
            }
            System.out.println();
        }

        //3D Array
        System.out.println("3D array");
        int my3DArray [][][] = {
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
            },
            {
                {6, 23, 3, -3},
                {-43, 59, 2, 3},
            },
        };

        System.out.println("Looping through 3D array");
        for (int i = 0; i < my3DArray.length; i++)
        {
            for (int j = 0; j < my3DArray[i].length; j++)
            {
                for (int k = 0; k < my3DArray[i][j].length; k++)
                {
                    int item = my3DArray[i][j][k];
                    System.out.print(item + ", ");
                }
            }
            System.out.println();
        }

        //Max amount of array dimensions
        int weirdArray [][][][][][][][][][][][][][];
    }
}