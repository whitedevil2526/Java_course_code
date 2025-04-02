public class CW_array {
    public static void main(String[] args) {
        /*Classroom of 500 student-you have to store marks of these 500 students
        you have 2 options:
        1. create 500 variables
        2.use Arrays (recommended)
        use of array:-accessing element faster
        */
        //1st method to use array
        //int [] marks = new int[5]; -> declaration + memory allocation

        //2nd method to use array
        /*
        int [] marks; -> declaration
        marks = new int[5]; -> memory allocation
        marks[0] = 100;
        marks[1] = 75;
        marks[2] = 80;
        marks[3] = 65;
        marks[4] = 55;
        //marks[5] = 50; -> throw an error
        System.out.println(marks[4]);
        */

        //3rd method to use array
        /*
        int [] marks = {100,75,88,50,65}; -> declare + initialing
        System.out.println(marks[4]);
        */

        //int [] marks = {100,75,88,50,65};
        /*
        float [] marks = {100,67,78,99,50};
        System.out.println(marks[4]);
        System.out.println(marks.length);
        */

        //int [] marks = {100,75,88,50,65};
        //length function
        /*
        System.out.println(marks.length);
        System.out.println("printing the array in basic way");
        System.out.println(marks[1]);
        */

        /*
        String [] students = {"ram", "shubham","rohan","harry"};
        System.out.println(students.length);
        System.out.println(students[0]);
        */

        /*
        //displaying the array in for loop
        System.out.println("printing array using for-loop");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]); //--> Array traversal
        }
        //quick quiz
        System.out.println("printing array in reverse order using for-loop");
        for (int j=marks.length-1;  j>=0; j--){
            System.out.println(marks[j]);
        }
        */

        /*
        //for each loop
        for (int element : marks){
            System.out.println(element);
        }
        */

        //multidimensional array
        int [] [] flats;
        flats = new int [2] [3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        //displaying the 2-D array (for loop)
        System.out.println("printing a 2-D array using for loop");
        for (int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
