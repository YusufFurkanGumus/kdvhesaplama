import java.util.Scanner;

public class notHesaplama {
    public static void main(String[] args) {

        // değişken oluşturdum
        int matematik,fizik,turkce,kimya,biyoloji,müzik;

        //scanner sınıfımızı tanımlıyoruz
        Scanner inp = new Scanner(System.in);

        System.out.println("🎓 Not Ortalaması Hesaplama Sistemine Hoş Geldin!");
        System.out.println("Lütfen ders notlarını 0 ile 100 arasında gir.\n");

        // kullanıcıdan değerleri alıyoruz
        System.out.print("Mat notu kaç?");
        matematik = inp.nextInt();

        System.out.print("fizik notu kaç?");
        fizik = inp.nextInt();

        System.out.print("turkçe notu kaç?");
        turkce = inp.nextInt();

        System.out.print("Kimya notu kaç?");
        kimya = inp.nextInt();

        System.out.print("Biyoloji notu kaç?");
        biyoloji = inp.nextInt();

        System.out.print("müzik notu kaç");
        müzik = inp.nextInt();


        // her dersin ortalamaya farklı etkisi vardır
        int toplam = ((matematik * 5)+(fizik * 3)+(turkce * 5)+(kimya * 2)+(biyoloji * 3)+ müzik);
        double ortalaman = toplam / 19.0;
        System.out.println("Not ortalaman :\t");
        System.out.println(ortalaman);

        // Durumu değerlendir
        if (ortalaman >= 85) {
            System.out.println("🌟 Harika! Takdir belgesi almaya aday bir öğrencisin!");
        } else if (ortalaman >= 70) {
            System.out.println("✅ Tebrikler, başarıyla geçtin!");
        } else if (ortalaman >= 60) {
            System.out.println("⚠️ Geçtin ama biraz daha çaba gerek.");
        } else {
            System.out.println("❌ Maalesef kaldın. Ama pes etme, bir dahaki sefere daha iyi olacak!");
        }

        System.out.println("\n📚 Başarılar dileriz!");
        System.out.println("TEŞEKKÜRLER");


    }
}
