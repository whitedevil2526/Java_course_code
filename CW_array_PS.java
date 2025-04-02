public class CW_array_PS {
    public static void main(String[] args) {
        //System.out.println("practice set of array");
        //practice problem 1
        /*
        float [] marks ={45.7f,86.5f,55.5f,99.8f,77.6f};
        float sum = 0;
        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("the value of sum is :" + sum);
        */

        //practice problem 2
        /*
        float [] marks = {45.7f,86.5f,55.5f,99.8f,77.6f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element : marks){
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the value is present in the array");
        }
        else{
            System.out.println("the value is not present in the array");
        }
        */
        // practice problem 3
        /*
        float [] marks = {45.7f,86.5f,55.5f,99.8f,77.6f};
        float sum = 0;
        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("the value of average marks is :" + sum/marks.length);
         */
        // practice problem 4
        /*
        int [] [] mat1 = {{1,2,3} , {4,5,6}};
        int [] [] mat2 = {{2,6,1}, {3,7,8}};
        int [] [] result = {{0,0,0} , {0,0,0}};

        for (int i=0; i<mat1.length; i++){ // row number of times
            for (int j=0; j<mat1[i].length;j++){ //column number of time
                //System.out.format("setting value for i=%d and j=%d\n",i,j);
                System.out.println(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
        */
        // practice problem 5
        /*
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(3,2);
        int temp;
        for (int i=0; i<n; i++){
            //swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element : arr){
            System.out.print(element + " ");
        }
        */

        //practice problem 6
        /*
        int [] arr = {1,21,3,455,5,34,67};
        int max = 0;
        for (int e : arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is :"+ max);
        */

        //practice problem 8
        /*
        boolean isSorted = true;
        int [] arr = {1,210,3,455,5,34,67};
        for (int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }
        else {
            System.out.println("the array is not sorted");
        }
        */
    }
}
