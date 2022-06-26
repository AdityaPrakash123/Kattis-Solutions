// This is to remove any consecutive duplicates

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder newString = new StringBuilder("");
        newString.append(input.charAt(0));

        String substring = input.substring(1,input.length()-1);

        int length = substring.length();

        for (int i=0;i<length*2;i++){
            newString.append('e');
        }
        newString.append('y');
        System.out.println(newString.toString());
    }
}
