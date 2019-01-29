package lesson4;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        char[][] value = {
                {'1', '1', '1', '1', '1'},
                {'0', '1', '1', '1', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'}
        };
        char[][] second = value;
//        second[2][2] = 'p';

        replaceCharacters(value);

        for (int i = 0; i < value.length; i++) {
            System.out.println(Arrays.toString(value[i]));
        }
    }

    private static void replaceCharacters(char[][] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                char newSymbol = source[i][j] == '1' ? '*' : ' ';
                source[i][j] = newSymbol;
//                if (source[i][j] == '1') {
//                    source[i][j] = '*';
//                } else {
//                    source[i][j] = ' ';
//                }
            }
        }
    }
}
