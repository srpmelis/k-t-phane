import java.time.LocalDate;

public class OduncKaydi {
    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;
    private LocalDate oduncTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = LocalDate.now();
        this.kitapKopyasi.setMusait(false);
    }

    public void iadeEt() {
        this.iadeTarihi = LocalDate.now();
        this.kitapKopyasi.setMusait(true);
    }

    public void bilgileriGoster() {
        System.out.println("Kullanici: " + kullanici.getAdSoyad());
        System.out.println("Kitap: " + kitapKopyasi.getKitap().getAd() + " (Kopya No: " + kitapKopyasi.getKopyaNo() + ")");
        System.out.println("Odunc Tarihi: " + oduncTarihi);
        System.out.println("Iade Tarihi: " + (iadeTarihi != null ? iadeTarihi : "Henuz iade edilmedi"));
    }
}
