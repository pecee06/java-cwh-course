public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        // float arr1[] = {2.3f,5.86f,6f,74.25f,12.01f};
        // float sum = 0;
        // for (float element : arr1) {
        //     sum += element;
        // }
        // System.out.println(sum);

        // Question 2
        // int arr2[] = {1,2,3,4,5};
        // int num = 5;
        // boolean sorted = false;
        // for (int element : arr2) {
        //     if (num == element){
        //         sorted = true;
        //         break;
        //     }
        //     else{
        //         sorted = false;
        //     }
        // }
        // if (sorted == true){
        //     System.out.printf("%d is present in given array",num);
        // }
        // else{
        //     System.out.printf("%d is not present in given array",num);
        // }

        // Question 3
        // int marks[] = {76,68,91,80};
        // float total = 0f;

        // for (int element : marks) {
        //     total += element;
        // }

        // float avg = total/marks.length;
        // System.out.println("Average score in Physics is "+avg);

        // Question 4
        // int matrix1[][] = {
        //     {1,16,8},
        //     {0,-9,10}
        // };

        // int matrix2[][] = {
        //     {-1,-7,89},
        //     {24,64,1}
        // };

        // int matrix3[][] = new int[2][3];

        // int row = matrix3.length;
        // int col = matrix3[0].length;

        // for (int i=0; i<row; i++){
        //     for (int j=0; j<col; j++){
        //         matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
        //     }
        // }

        // for (int i=0; i<row; i++){
        //     for (int j=0; j<col; j++){
        //         System.out.print(matrix3[i][j]+"\t");
        //     }
        //     System.out.println();
        // }

        // Question 5
        // int arr3[] = {1,2,3,4,5,6,7,8};
        // int arr4[] = new int[arr3.length];
        // int u_index = arr3.length-1;
        // for (int i=0; i<=u_index; i++){
        //     arr4[i] = arr3[u_index-i];
        // }

        // arr3 = arr4;

        // for (int element : arr3) {
        //     System.out.print(element+"\t");
        // }

        // Question 6
        // int arr5[] = {-5,8,-10,-89,-150,30};

        // int min_int = Integer.MIN_VALUE;

        // for (int element : arr5) {
        //     if (element > min_int){
        //         min_int = element;
        //     }
        // }
        // int max = min_int;

        // System.out.println("Maximum value in array "+max);

        // int max_int = Integer.MAX_VALUE;

        // for (int element : arr5) {
        //     if (element < max_int){
        //         max_int = element;
        //     }
        // }
        // int min = max_int;

        // System.out.println("Minimum value in array "+min);

        // Question 7
        int arr6[] = {1,-5,8,20};

        boolean sorted = false;

        for (int i=0; i<arr6.length-1; i++){
            if (arr6[i] > arr6[i+1]){
                sorted = false;
                break;
            }
            else{
                sorted = true;
            }
        }

        if (sorted == true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
