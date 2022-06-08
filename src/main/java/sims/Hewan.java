package sims;

public class Hewan extends MakhlukHidup implements AktivitasBersama{
    private String nama;
    private int kebersihan;

    public Hewan(String nama){
        this.nama = nama;
        this.kebersihan = 100;
    }

    @Override
    public void bermain(MakhlukHidup M1) {
        if (M1 instanceof Manusia){
            this.ikatanManusia += 15;
            M1.ikatanHewan += 15;
            System.out.println(this.nama + " bermain dengan " + ((Manusia) M1).getNama());
        } else {
            this.ikatanHewan += 10;
            M1.ikatanHewan += 10;
            System.out.println(this.nama + " bermain dengan " + ((Hewan) M1).getNama());
        }
        this.energi -= 20;
        M1.energi -= 20;
    }

    @Override
    public void memarahi(MakhlukHidup M1) {
        if (M1 instanceof Manusia){
            this.ikatanManusia -= 10;
            M1.ikatanHewan -= 10;
            System.out.println(this.nama + " memarahi " + ((Manusia) M1).getNama());
        } else {
            this.ikatanHewan -= 20;
            M1.ikatanHewan -= 20;
            System.out.println(this.nama + " memarahi " + ((Hewan) M1).getNama());
        }
        this.energi -= 25;
        M1.energi -= 25;
    }

    @Override
    public void berkomunikasi(MakhlukHidup M1) {
        if (M1 instanceof Manusia){
            this.ikatanManusia += 10;
            M1.ikatanManusia += 10;
            System.out.println(this.nama + " memarahi " + ((Manusia) M1).getNama());
        } else {
            this.ikatanHewan += 5;
            M1.ikatanManusia += 5;
            System.out.println(this.nama + " memarahi " + ((Hewan) M1).getNama());
        }
        this.energi -= 5;
        M1.energi -= 5;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void makan(){
        this.energi += 25;
    }

    public void tidur(){
        this.energi += 15;
    }

    public void tidur(int jam){
        this.energi += (jam * 15);
    }

    public void mandi(){
        this.kebersihan = 100;
    }
}
