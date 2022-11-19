import java.util.Scanner;

public class Main {
    public  static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
        float tutar = scanner.nextFloat();
        float kdv = tutar*18/100;
        float kdvTwo = tutar*8/100;
        String indirim = (tutar) < 1000 ?
                "KDV'siz Fiyat: " + tutar + "\nKDV'li Fiyat: " + (tutar+kdv)+ "\nKDV tutarı: "+kdv
                :"KDV'siz Fiyat: " + tutar + "\nKDV'li Fiyat: " + (tutar+kdvTwo)+ "\nKDV tutarı: "+kdvTwo;
        System.out.println(indirim);
    }
}
