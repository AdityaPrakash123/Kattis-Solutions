import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()){
            long numberOne = sc.nextLong();
            long numberTwo = sc.nextLong();

            long answer = numberOne-numberTwo;

            System.out.println(Math.abs(answer));
        }
        sc.close();

    }
}
