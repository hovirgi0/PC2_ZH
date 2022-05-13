public class Matrix {
    public static void main(String[] args) {
        sumOfNumbersDivisibleByFive ();
        indexOfRowsWithZeros();
    }

    public static void sumOfNumbersDivisibleByFive () {
        int array[][] = {
                {1, 2, 5},
                {6, 10, 7}
        };

        int divisibles = array[0][0];
        int divisible=0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((array[row][col] % 5) == 0) {
                    divisibles = array[row][col];
                    divisible++;
                }
            }
        System.out.println("5-tel osztható számok: " + divisible);
        }
    }

    public static void indexOfRowsWithZeros() {
        int array[][] = {
                {1, 2, 3},
                {0, 0, 0}
        };

        int zerorow = array[0][0]; //nullás sorok
        int zeroindex = 0; //nullás sorokindexe
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
                if (array[row][col] == 0) {
                    zerorow = array[row][col];
                    zeroindex = row;
                }
        }
        System.out.println("A nullás sorok indexe: " + zeroindex);
    }
}