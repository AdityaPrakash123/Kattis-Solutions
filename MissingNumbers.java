import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        List<Integer> array1 = new ArrayList<Integer>();
        for (int i=0;i<iterations;i++){
            int input = sc.nextInt();
            array1.add(input);
        }
        int lastNumber =  array1.get(array1.size()-1);
        List<Integer> array2 = new ArrayList<>();

        for (int i=1;i<=lastNumber;i++){
            array2.add(i);
        }
        array2.removeAll(array1);

        if (array2.isEmpty()){
            System.out.println("good job");
        }
        else {
            for (int i=0;i<array2.size();i++){
                System.out.println(array2.get(i)+" ");
            }
        }
    }
}
