import java.util.Scanner;
public class NPrint {
    public static void main(String[] args){
        int input;
        Scanner s = new Scanner(System.in);
        input = s.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }


        }
    }
}
