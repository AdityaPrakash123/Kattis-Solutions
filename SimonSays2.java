import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimonSays2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iterations = Integer.parseInt(br.readLine());
        String keyWord = "simon says ";
        boolean hasSimon = false;
        for (int i=0;i<iterations;i++){
            String input = br.readLine();
            if (input.startsWith(keyWord)){
                input = input.replace(keyWord,"");
                hasSimon = true;
            } else {
                hasSimon = false;
            }
            if (hasSimon){
                System.out.println(input);
            }else {
                System.out.println();
            }
        }
    }
}
