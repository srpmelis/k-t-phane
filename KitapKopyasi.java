public class KitapKopyasi {
    private int kopyaNo;
    private Kitap kitap;
    private boolean musait;

    public KitapKopyasi(int kopyaNo, Kitap kitap) {
        this.kopyaNo = kopyaNo;
        this.kitap = kitap;
        this.musait = true;
    }

    public int getKopyaNo() {
        return kopyaNo;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public boolean isMusait() {
        return musait;
    }

    public void setMusait(boolean musait) {
        this.musait = musait;
    }
}
