import java.util.Scanner;

public class Planer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gruz = in.nextInt();
        int fuel = 300;
        int put = a+b;
        double rasxod;
        int rash500 = 1;
         int rash1000 = 4;
         int rash1500 = 7;
         int rash2000 = 9;
         int bak=300;
         String rash2001 = "Error";
         if (gruz<500 && gruz>0) {
             rasxod = a + b;
             if (rasxod > 300) {
                 rasxod = (a + b) - 300;
                 System.out.printf("%.2f",rasxod);

             }
         }
             if (gruz<1000 && gruz>500){
                 rasxod =(a+b)*rash1000;
                 if (rasxod>300) {
                     rasxod = rasxod-300;
                     System.out.printf("%.2f",rasxod);
                 }

             }
             if (gruz<1500 && gruz>1000){
                 rasxod = (a+b)*rash1500;
                 if (rasxod>300) {
                     rasxod = (a+b)-300;
                     System.out.printf("%.2f",rasxod);
                 }
             }
             if (gruz<2000 && gruz>1500){
                 rasxod = (a+b)*rash2000;
                 if (rasxod>300) {
                     rasxod = (a+b)-300;
                     System.out.printf("%.2f",rasxod);
                 }
             }

        if (gruz<2500){
            System.out.println("ERROR");
        }
    }


    }


