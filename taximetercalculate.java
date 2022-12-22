import java.util.Scanner;
public class taximetercalculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz Mesafeyi KM Olarak Giriniz :");

        int km=input.nextInt();
        double perKm=2.20;
        int startPrice=10;
        int min=20;

        double total = (km*perKm)+startPrice;
        double still= total > 0 && total<=20 ? min : total;

        System.out.println("Ödeyeceğiniz tutar :" +still);


    }
}
