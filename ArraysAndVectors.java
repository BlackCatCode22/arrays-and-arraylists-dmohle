// ArraysAndVectors.java
// Dennis Mohle
// 8/24/23

public class ArraysAndVectors {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Array Program!\n");

        // Create an int array
        int[] myNumbers = new int[8];

        // Fill the array with ints
        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;

        // output the array
        System.out.println("myNumbers[3] = " + myNumbers[3]);

        System.out.println("\n\n");

        for (int i = 0; i < 8; i++ ) {
            // print the elements of the array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        // fill the array with 5, 10 , 15, etc.
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++) {
            // fill the elements of the array
            myNumbers[i] = myFiveContainer += 5;
        }

        System.out.println("\n\n this array should be the fives: ");
        for (int i = 0; i < 8; i++ ) {
            // print the elements of the array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        // Create a 3D array
        int[][][] myNumberGrid = new int[100][4][3];

        // fill the array with a for() loop!
        myFiveContainer = 0;
        for (int h = 0; h < myNumberGrid.length; h++){
            for (int i = 0; i < myNumberGrid[h].length; i++) {
                for (int j = 0; j < myNumberGrid[h][i].length; j++) {
                    myNumberGrid[h][i][j] = myFiveContainer += 5;
                }
            }
        }

        // output the array with a for() loop!
        System.out.println("\n\n");
        for (int h=0; h<100; h++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(myNumberGrid[h][i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }
}