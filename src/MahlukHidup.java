public class MahlukHidup {
    int ikatanManusia;
    int ikatanHewan;
    int energi;

    public MahlukHidup() {
        this.ikatanHewan = 0;
        this.ikatanManusia = 0;
        this.energi = 100;
    }

    void print(){
        System.out.println("Ikatan Manusia: " + this.ikatanManusia + ", " + "Ikatan Hewan: " + this.ikatanHewan);
    }
}
