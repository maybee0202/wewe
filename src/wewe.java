import java.util.Scanner;

public class wewe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print your sum");
        double rusVall = scan.nextInt();
        double eUR = 62.47;
        double USD = 63.06;
        double GBR = 70.86;
        int Bit0K = 250000;
        System.out.println("cHOISE yoUR Vallute");
        System.out.println("1- $dollar");
        System.out.println("2- Eur000");
        System.out.println("3-FUUUUUNt");
        System.out.println("Bitk0IN");

        int choise = scan.nextInt();
        if (choise ==1) System.out.println(rusVall/USD);
        else if (choise ==2) System.out.println(rusVall/eUR);
        else if ( choise==3) System.out.println(rusVall/GBR);
        else if ( choise ==4) System.out.println(rusVall/Bit0K);

    }


}
