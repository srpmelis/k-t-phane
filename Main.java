public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("Sefiller", "Victor Hugo", "9789750719387");
        KitapKopyasi kopya1 = new KitapKopyasi(1, kitap1);

        Kullanici kullanici1 = new Kullanici(101, "Melis Yilmaz");

        System.out.println("Kopya musait mi? " + kopya1.isMusait());

        OduncKaydi kayit1 = new OduncKaydi(kullanici1, kopya1);
        System.out.println("\n--- Odunc Verildi ---");
        System.out.println("Kopya musait mi? " + kopya1.isMusait());
        kayit1.bilgileriGoster();

        kayit1.iadeEt();
        System.out.println("\n--- Iade Edildi ---");
        System.out.println("Kopya musait mi? " + kopya1.isMusait());
        kayit1.bilgileriGoster();
    }
}
