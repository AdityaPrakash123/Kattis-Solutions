import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();

        for (int i=0;i<iterations;i++){
            int arrayLength = sc.nextInt();
            int[] array = new int[arrayLength];

            int total = 0;
            int count = 0;

            for (int j=0;j<arrayLength;j++){
                array[j] = sc.nextInt();
                total+=array[j];
            }
            int average=total/arrayLength;

            for (int j=0;j<arrayLength;j++){
                if (array[j]>average){
                    count++;
                }
            }

            double answer = (double) count/arrayLength;
            System.out.println(String.format("%.3f",answer*100) + "%");

        }
    }
}

