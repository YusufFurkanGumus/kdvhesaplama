import java.util.Scanner;


public class kdvhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar,kdvOrani,kdvTutar,toplamTutar;

        // KDV tutarı %18 alınacak , ürün 1000 tl altı ise %18 eğer 1000tl üzeri ise %8 KDV alınacak

        System.out.print("Ücret Tutarı Girin");
        tutar = input.nextDouble();

        if (tutar <= 1000) {
            kdvOrani = 0.18;
            System.out.println("KDV %18 olarak hesaplanıyor!");
        }else
            kdvOrani = 0.08;
                System.out.println("KDV %8 olarak hesaplanıyor");

                // kdv toplam tutar hesapla
        kdvTutar = tutar*kdvOrani;
        toplamTutar = tutar+kdvTutar;

        // sonuçları yazdır
        System.out.println("KDV Tutarı:" + kdvTutar);
        System.out.println("Toplam Tutar (KDV dahil)" + toplamTutar);


    }
}
