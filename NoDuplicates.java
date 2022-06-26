import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        String[] array = input.split(" ");

        String newString = "";

        for (int i=0;i< array.length-1;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i].equals(array[j])){
                    newString=newString+array[i];
                }
            }
        }


        if (newString.isEmpty()){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
