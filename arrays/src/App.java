public class App {
    public static void main(String[] args) throws Exception {
        // Declaring array
        // int arr1[];

        // Allocating memory for array
        // arr1 = new int[5];
        // 5 in here is the size of array, i.e., how many elements it can store (integers in this case)

        // Initialising array
        // arr1[0] = 2;
        // arr1[1] = 3;
        // arr1[2] = 5;
        // arr1[3] = 7;
        // arr1[4] = 11;

        // a1_len = arr1.length;    // This returns the length of an array

        // for (int i=0; i<a1_len; i++){
        //     System.out.println(arr1[i]);
        // }

        // Simultaneously declaring, instantiating and initialising array
        // int arr2[] = {1,3,5,7,9};
        // System.out.println(arr2[2]);

        // Traversing an array using for-Each loop
        // String arr3[] = {
        //     "Harshit","Ansh","Payal","Priyanshu","Yoganshu","Sanchali","Shrinidhi"
        // };

        // for (String i : arr3) {
        //     // Here i is the traversing variable
        //     System.out.println(i);
        // }

        // Multidimentional array
        // These are array of arrays

        // nD arrays can be defined, but 3D,4D,... arrays are hard to visualize
        // Thus we'll restrict ourselves to 2D arrays only
        // 2D arrays can be thought of like matrices

        // double matrix1[][] = new double[2][2];  // That's a 2x2 matrix
        // double matrix2[][] = new double[3][2];  // That's a 3x2 matrix
        // double matrix3[][] = new double[2][3];  // That's a 2x3 matrix

        // matrix1[0][0] = 23.5;
        // matrix1[0][1] = 10;

        // matrix1[1][0] = 12.97;
        // matrix1[1][1] = 64.065;

        /*This will look like:
        23.5    10
        12.97   64.065
        */

        // BTW, that's a multiline comment in Java :)

        // System.out.println(matrix1.length);
        // It returns number of rows in the matrix

        // Printing a matrix
        // int row = matrix1.length;
        // int col = matrix1[0].length;

        // for (int i=0; i<row; i++){
        //     for (int j=0; j<col; j++){
        //         System.out.print(matrix1[i][j]+"\t");
        //         // Prints cell at ith row & jth column
        //     }
        //     System.out.println();
        // }

        // Creating a 3D array
        // int arr_3d[][][] = new int[2][3][4];
        
        // This can be visualized as a box, with length as 2, width as 3 and height as 4
        // In total 2*3*4 (24) elements can be stored in it
    }
}

// A bit theory

// Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
// Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.

// Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.