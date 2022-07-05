import java.util.Scanner;

public class SumKindOfProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();

        for (int i=1;i<=iterations;i++){
            int index = sc.nextInt();
            int input = sc.nextInt();
            System.out.println(index+" "+Sum(input)+" "+Odds(input)+" "+Evens(input));
        }

    }

    // This is the method to find the sum of the first N numbers
    public static int Sum(int number){
        int total =0;
        for (int i=1;i<=number;i++){
            total+=i;
        }
        return total;
    }

    // This is the method to find the sum of the first N odd numbers
    public static int Odds(int number){
        int oddCount =0;
        for (int i=1;i<=number;i++){
            oddCount+=(2*i-1);
        }
        return oddCount;

    }
    // This is the method to find the sum of the first N even numbers
    public static int Evens(int number){
        int evenCount = 0;
        for (int i=1;i<=number;i++){
            evenCount+=(2*i);
        }
        return evenCount;
    }
}
