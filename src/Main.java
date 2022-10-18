import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        double[] Ai = {1.57, 7.654, 9.986};
        int[] meow = {11, 12, 147, 254};

        //Задание 2
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i!= weights.length){
                System.out.print(", ");}
        }
        System.out.println();
        for (int i = 0; i < Ai.length; i++) {
            System.out.print(Ai[i]);
            if (i!= Ai.length){
                System.out.print(", ");}
        }
        System.out.println();
        for (int i = 0; i < meow.length; i++) {
            System.out.print(meow[i]);
            if (i!= meow.length){
                System.out.print(", ");}
        }
        System.out.println();
        //Задание 2
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i!=0) {
                System.out.print(", ");}
        }
        System.out.println();
        for (int i = Ai.length - 1; i >= 0; i--) {
            System.out.print(Ai[i]);
            if (i!=0) {
                System.out.print(", ");}
        }
        System.out.println();
        for (int i = meow.length - 1; i >= 0; i--) {
            System.out.print(meow[i]);
            if (i!=0) {
                System.out.print(", ");}
        }
        System.out.println();
        //Задание 4
        for (int i = 0; i < weights.length; i++) {
          if (weights[i] % 2 != 0) {
              weights[i] += 1;
          }
            System.out.println(Arrays.toString(weights));

        }
    }
}