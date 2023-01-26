import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        double a=abc.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double b=abc.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double c=abc.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double d=abc.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double e=abc.nextDouble();
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;


        double Toplam = (a * armut) + (b * elma) + (c * domates) + (d * muz) + (e * patlican);

        System.out.println("Toplam Tutar : " + Toplam);
        

    }
}