import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        int tutar;
        double kdv, kdvliFiyat;
        Scanner scan = new Scanner(System.in);

        System.out.print("Tutar: ");
        tutar= scan.nextInt();
        if (tutar >=1000 ) {
            kdv = 8;
        }
            else {
            kdv = 18;
        }
        kdvliFiyat = tutar + (tutar*(kdv/100));
        System.out.println("Kdv Oranı = % "+kdv);
        System.out.println("Kdv Dahil Fiyat = "+kdvliFiyat);


    }
}
