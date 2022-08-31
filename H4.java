import java.util.Scanner;
public class H4 {


        public static void main(String[] args) {
            int x,y;
            Scanner input=new Scanner(System.in);
            System.out.println("enter the number: ");
            x=input.nextInt();
            if (x<0)
                y=x*-1;
            else y=x;
            if (y<10&&y>=0)
                System.out.println("1");
            else if (y<100&&y>=10)
                System.out.println("2");
            else if (y<1000&&y>=100)
                System.out.println("3");
            else if (y<10000&&y>=1000)
                System.out.println("4");
            else if (y<100000&&y>=10000)
                System.out.println("5");
            else if (y<1000000&&y>=100000)
                System.out.println("6");
            else if (y<10000000&&y>=1000000)
                System.out.println("7");
            else if (y<100000000&&y>=10000000)
                System.out.println("8");
            else if (y<1000000000&&y>=100000000)
                System.out.println("9");



        }
    }

