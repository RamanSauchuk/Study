import java.util.Scanner;

public class Days_to_English {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        switch (word){
            case "Понедельник":
            case "понедельник":
                System.out.println("Monday");
                break;
            case "Вторник":
            case "вторник":
                System.out.println("Tuesday");
                break;
            case "Среда":
            case "среда":
                System.out.println("Wednesday");
                break;
            case "Четверг":
            case "четверг":
                System.out.println("Thursday");
                break;
            case "Пятница":
            case "пятница":
                System.out.println("Friday");
                break;
            case "Суббота":
            case "суббота":
                System.out.println("Saturday");
                break;
            case "Воскресенье":
            case "воскресенье":
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("ERROR");
        }
    }

}
