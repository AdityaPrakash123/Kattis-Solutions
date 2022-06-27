import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();


        for (int i=0;i<iterations;i++){
            int itt= sc.nextInt();
            int[] array = new int[itt];
            for (int j=0;j<itt;j++){
                array[j] = sc.nextInt();
            }

            int distinctValue = array[0];

            for (int k=1;k<array.length;k++){
                distinctValue = distinctValue^array[k];
            }
            System.out.println("Case #"+(i+1)+": "+ distinctValue);


        }


    }
}
