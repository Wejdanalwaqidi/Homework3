import java.util.Scanner;
public class H3 {
        public static void main(String[] args) {
            int X;
            Scanner input=new Scanner(System.in);
            System.out.println("enter number: ");
            X=input.nextInt();
            if (X>0)
                System.out.println("positive");
            else if (X<0)
                System.out.println("negative");
            else System.out.println("zero");
        }
    }
