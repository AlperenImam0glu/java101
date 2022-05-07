import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {

    public static void main(String[] args) {
        int mat, fizik, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notun : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notun     : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notun    : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notun     : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notun     : ");
        muzik = inp.nextInt();

        double ortalama = (mat + fizik + turkce + tarih + muzik) / 5;
        System.out.println("======================");
        System.out.println("Not ortalamanız : "+ortalama);
        String durum = ortalama>=60? "Gectiniz":"Kaldınız";
        System.out.println(durum);
        System.out.println("======================");
    }
}
