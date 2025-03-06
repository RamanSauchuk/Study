import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int rast = (a+b);
        double w = (rast-c);
        double v = (rast*4)-c;
        if (c <= 500) {

            if (w >= c) {

                System.out.printf("%.2f", w);
            }

        }
     if (c <= 1000 || c > 500) {


            if (v >=c )
            {
                System.out.printf("%.2f", v);
            }
        }
    }
}