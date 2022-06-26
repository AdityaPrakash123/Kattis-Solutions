import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        int[] array = new int[iterations];
        for (int i=0;i<iterations;i++){
            array[i] = sc.nextInt();
        }
        for (int i=0,j= array.length-1;i<j;i++,j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
        for (int i=0;i<iterations;i++){
            System.out.println(array[i]);
        }
    }
}
