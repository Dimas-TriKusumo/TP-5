import java.util.Scanner;


public class AngkajadiBulanPrancis {

    public static void main(String[] datk) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Bilangan Bulat N(1<=N>=12) = ");
        String hari = input.nextLine();

        switch(hari) {
        case "1":
            System.out.println("Janvier");
        break;
        case "2":
            System.out.println("Février");
            break;
        case "3":
            System.out.println("Mars");
        break;
        case "4":
            System.out.println("Avril");
        break;
        case "5":
            System.out.println("Mai");
        break;
        case "6":
            System.out.println("Juin");
        break;
        case "7":
            System.out.println("Juillet");
        break;
        case "8":
            System.out.println("Août");
        break;
        case "9":
            System.out.println("Septembre");
        break;
        case "10":
            System.out.println("Octobre");
        break;
        case "11":
            System.out.println("Novembre");
         break;
         case "12":
            System.out.println("Décembre");
         break;
        }
}
}