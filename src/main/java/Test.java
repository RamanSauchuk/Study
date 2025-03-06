import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        if (a < 0 || b < 0) {
            System.out.println("ERROR");
        }
        else {
            if (a <= 20) {
                double c = a * b;
                System.out.printf("%.2f",c);
            }
            if (20 < a && a < 41) {
                double d =(20*b)+ ((a-20) * (b * 1.5));
                System.out.printf("%.2f",d);
            }
            if (a > 40) {
                double e = (20*b)+(20 * (b * 1.5))+((a-40)*(b*2));
                System.out.printf("%.2f",e);
            }
        }

    }
}
