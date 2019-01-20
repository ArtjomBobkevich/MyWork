package _1_procedural;

import java.util.Arrays;

public class App_1_1_arrays {
    public static void main(String[] args) {
  //      System.out.println(new Object());
  //      System.out.println("x = " + new Object());

 //       char[] arrChars = {'a', 'b', 'c', 'd', 'e'};
 //       System.out.println(arrChars);
//        System.out.println(Arrays.toString(arrChars));

 //       arrChars[1] = 'f';

 //       int[] emptyArray = new int[0];
 //       int[] filledArray = new int[]{1, 2, 3};
//        int[] arrIncorrect;
//        arrIncorrect = {1, 2, 3};
        //incorrect
 //       System.out.println(emptyArray == filledArray);
 //       System.out.println(emptyArray.equals(filledArray));
 //       //correct
 //       System.out.println(Arrays.equals(emptyArray, filledArray));

        int[] array1D = {1, 2, 3};
        int [][] was9=new int[3][2];
        was9[0][0]=(1);
        was9[0][1]=(2);
        was9[1][0]=(3);
        was9[1][1]=(4);
        was9[2][0]=(5);
        was9[2][1]=(6);
        System.out.println(array1D);
       System.out.println(Arrays.toString(array1D));
        System.out.println(Arrays.toString(was9));
        System.out.println(Arrays.deepToString(was9));

        //idioms
        //Arrays.class, Collections.class, Executors.class
    }
}
