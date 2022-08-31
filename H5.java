import java.util.Scanner;
public class H5 {
        public static void main(String[] args) {
            int X,Y,Z;
            Scanner input=new Scanner(System.in);
            System.out.println("enter 3 number: ");
            X=input.nextInt();
            Y=input.nextInt();
            Z=input.nextInt();
            if (X==Y&&Y==Z)
                System.out.println("all the same");
            else if (X!=Y&&Y!=Z&&X!=Z)
                System.out.println("all different");
            else System.out.println("neither");
        }

}
