package DSA;
import java.util.Scanner;
public class Java_Output_Formatting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0; i<3; i++){
            String s = input.next();
            int n = input.nextInt();
            System.out.printf("%-15s%03d\n",s,n);
        }
        System.out.println("================================");
    }
}
