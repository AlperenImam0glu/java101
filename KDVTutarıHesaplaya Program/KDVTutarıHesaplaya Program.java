import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {

    public static void main(String[] args) {
        float para;
        Scanner inp = new Scanner(System.in);
        System.out.print("Para miktarini giriniz: ");
        para = inp.nextFloat();

        float kdv=para<1000? 18:8;

        System.out.println("======================");
        System.out.println("KDV'siz fiyat = "+para);
        System.out.println("KDV'li fiyat  = "+(para+(para*kdv)/100));
        System.out.println("KDV tutari    = "+(para*kdv)/100);
        System.out.println("======================");
    }
}
