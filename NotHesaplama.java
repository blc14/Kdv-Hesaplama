import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik not: ");
        matematik = scan.nextInt();

        System.out.print("Fizik not: ");
        fizik = scan.nextInt();

        System.out.print("Kimya not: ");
        kimya = scan.nextInt();

        System.out.print("Türkçe not: ");
        turkce = scan.nextInt();

        System.out.print("Tarih not: ");
        tarih = scan.nextInt();

        System.out.print("Müzik not: ");
        muzik = scan.nextInt();

        int toplam = matematik + fizik + kimya + tarih +turkce +muzik;
        float ortalama = toplam /6;

        System.out.println("Not ortalaması = "+ortalama);

        String str = ortalama > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);




    }
}