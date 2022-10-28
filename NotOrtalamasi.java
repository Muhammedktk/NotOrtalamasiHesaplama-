import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b , c , d , e , f ;

        System.out.print(" Matematik Notunu Giriniz :   ");
        a = input.nextInt();

        System.out.print(" Fizik Notunu Giriniz :   ");
        b = input.nextInt();

        System.out.print(" Kimmya Notunu Giriniz :  ");
        c = input.nextInt();

        System.out.print(" Türkçe Notunu Giriniz :  ");
        d = input.nextInt();

        System.out.print(" Tarih Notunu Giriniz :   ");
        e = input.nextInt();

        System.out.print(" Müzik Notunu Giriniz :   ");
        f = input.nextInt();

        int Toplam = a+b+c+d+e+f ;
        double Ortalama = Toplam/6.0;

        System.out.print(" Not Ortalaması :    ");
        System.out.println( Ortalama );

        boolean Kosul1 = Ortalama >= 60 ;

        String str= Kosul1 ? "GEÇTİ" : "KALDI" ;
        System.out.println( str );
    }
}