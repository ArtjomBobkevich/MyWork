package lesson4;

public class Task6 {

    public static void main(String[] args) {
        int[][] firstArray = {{1, 2, 3}, {5, 8}, {99}};
        int[][] secondArray = {{1, 2, 3}, {5, 8}, {99}};
        System.out.println(equals(firstArray, secondArray));
    }

    public static boolean equals(int[][] firstArray, int[][] secondArray) {
        boolean result = true;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                if (firstArray[i][j] != secondArray[i][j]) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
