import java.util.Scanner;
public class H7 {

        public static void main(String[] args) {
            int X,Y,Z;
            Scanner input=new Scanner(System.in);
            System.out.println("enter the 3 number: ");
            X=input.nextInt();
            Y=input.nextInt();
            Z=input.nextInt();
            if (X<=Y&&Y<=Z)
                System.out.println("in order");
            else if (X>=Y&&Y>=Z)
                System.out.println("in order");
            else System.out.println("not in order");
        }
    }


