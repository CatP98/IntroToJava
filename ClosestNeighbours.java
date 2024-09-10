/* ClosestNeighbours.java */

class ClosestNeighbours{
    public static void main(String[] args){
        
        int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
        int[][] differenceArray = new int[myArray.length - 1][3];
        int [] smallestArray = new int [3];
        //Creating the differencesArrays
        for(int i = 1; i < myArray.length; i++){
            differenceArray[i-1][0] = myArray[i-1];
            differenceArray[i-1][1] = myArray[i];
            differenceArray[i-1][2] = Math.abs(myArray[i-1] - myArray[i]);
        }
        // Initializing the smallestArray with the first line of differenceArray
        smallestArray = differenceArray[0];

        for( int i = 1; i < differenceArray.length; i++){
            if (smallestArray[2] > differenceArray[i][2]){
                smallestArray = differenceArray[i];
            }
        }
        System.out.println("The two neighbouring numbers that we are looking for are " + smallestArray[0] +" and "+ smallestArray[1]);

    }
}