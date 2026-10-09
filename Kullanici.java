public class Kullanici {
    private int kullaniciNo;
    private String adSoyad;

    public Kullanici(int kullaniciNo, String adSoyad) {
        this.kullaniciNo = kullaniciNo;
        this.adSoyad = adSoyad;
    }

    public int getKullaniciNo() {
        return kullaniciNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }
}
