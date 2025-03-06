import java.util.Scanner;

public class Salary    {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int key = console.nextInt();
        switch (key) {
            case 1:
                int sallary = console.nextInt();
                int lateness = console.nextInt();
                lateness = (lateness % 3)*20;
                sallary = (lateness + sallary)/50*100;
                System.out.println(sallary);
            case 2:
                int code = console.nextInt();
                int salary = console.nextInt();
                code = ((((code / 100)*50)-salary)/20*3)+2;
                if (salary)
                System.out.println(code);
            case 3:
                int code1 = console.nextInt();
                int salary1 = console.nextInt();
                code1= ((code1 / 100)*50)-((salary1 / 3)*20);
                System.out.println(code1);
            default:
                System.out.println("ERROR");


        }
    }

}
