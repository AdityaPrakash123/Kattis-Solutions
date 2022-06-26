import java.util.Scanner;

public class Egypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt(),b = sc.nextInt(),c= sc.nextInt();
            int temp;
            if (a==0&&b==0&c==0){
                break;
            }
            if (a>c&&a>b){
                temp = c;
                c = a;
                a = temp;
            }
            if (b>c&&b>a){
                temp = c;
                c = b;
                b = temp;
            }
            if (Math.sqrt(Math.pow(a,2)+Math.pow(b,2))==c){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
