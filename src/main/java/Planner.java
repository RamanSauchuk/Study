import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int weight = in.nextInt();
double distance = a + b;
double rashod;
double dozapravka;
if (0 < weight && weight <= 500) {
    rashod = distance;
if (a > 300 || b > 300) {
    System.out.println("ERROR");

}
if
(a < 300 && b < 300) {
    dozapravka = rashod - 300;
    if (dozapravka > 0) {
        System.out.printf("%.2f",dozapravka);
    }
    if (dozapravka < 0){
        System.out.println("0.00");
    }
}



}
        if (500 < weight && weight <=1000) {
            rashod = distance * 4;

            if ((a*4) > 300) {
                System.out.println("ERROR");
            }
            if (b > 300 || a*4 < 300 ) {
                dozapravka = rashod - 300;
                System.out.printf("%.2f",dozapravka);
            }

}
        if (1000 < weight && weight <=1500) {
            rashod = distance * 7;
            System.out.printf("%.2f",rashod);
        }
        if (1500 < weight && weight <=2000) {
           rashod = distance *9;
        }
        if (2000 < weight ) {
            System.out.println("ERROR");
        }



    }
}


