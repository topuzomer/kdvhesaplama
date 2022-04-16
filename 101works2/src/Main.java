import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kdvliFiyat,kdvTutari,fiyat;
        System.out.println("Lütfen ürünün fiyatını giriniz : ");
        Scanner input = new Scanner(System.in);
        fiyat = input.nextInt();
        kdvTutari = fiyat*18/100;
        kdvliFiyat = fiyat + kdvTutari;
        System.out.println("Kdvsiz tutar  : " + fiyat);
        System.out.println("Kdv tutarı : " + kdvTutari);
        System.out.println("Kdvli fiyat : " + kdvliFiyat);

    }
}
