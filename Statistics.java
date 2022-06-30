// This is to use End of File

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int lineNumber = 0;

        while(s.hasNext()){
            int iterations = s.nextInt();
            int[] array = new int[iterations];

            for (int i=0;i<iterations;i++){
                array[i] = s.nextInt();
            }

            // initial minimum value
            int minimumValue = array[0];

            // initial maximum value
            int maximumValue = array[0];


            for (int i=0;i< array.length;i++){
                if (array[i]<minimumValue){
                    minimumValue = array[i];
                }
            }
            for (int i=0;i< array.length;i++){
                if (array[i]>maximumValue){
                    maximumValue = array[i];
                }
            }

            int difference = maximumValue-minimumValue;
            lineNumber++;
            System.out.println("Case "+lineNumber+": "+minimumValue+" "+maximumValue+" "+difference);

        }
        s.close();




    }
}
