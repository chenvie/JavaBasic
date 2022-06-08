package sims;

public class Manusia extends MakhlukHidup implements AktivitasBersama{
    private boolean status;
    private String nama;
    private String gender;

    public Manusia(String nama, String gender){
        this.status = false;
        this.nama = nama;
        this.gender = gender;
    }

    public void menikah(MakhlukHidup M1) throws Exception {
        if (M1 instanceof Manusia){
            if (!((Manusia) M1).status && !this.status){
                if (M1.ikatanManusia >= 80 && this.ikatanManusia >= 80){
                    System.out.println(this.nama + " menikah dengan " + ((Manusia) M1).nama);
                } else {
                    M1.ikatanManusia -= 40;
                    this.ikatanManusia -= 40;
                }
            } else {
                System.out.println(this.nama + " tidak bisa menikah dengan " + ((Manusia) M1).nama);
            }
        } else {
            System.out.println(this.nama + " tidak bisa menikah dengan hewan");
            throw new Exception("tidak bisa menikah dengan hewan");
        }
    }

    @Override
    public void bermain(MakhlukHidup M1) {
        if (M1 instanceof Manusia){
            this.ikatanManusia += 10;
            M1.ikatanManusia += 10;
            System.out.println(this.nama + " bermain dengan " + ((Manusia) M1).nama);
        } else {
            this.ikatanHewan += 15;
            M1.ikatanManusia += 15;
            System.out.println(this.nama + " bermain dengan " + ((Hewan) M1).getNama());
        }
        this.energi -= 20;
        M1.energi -= 20;
    }

    @Override
    public void memarahi(MakhlukHidup M1) {
        if (M1 instanceof Manusia){
            this.ikatanManusia -= 20;
            M1.ikatanManusia -= 20;
            System.out.println(this.nama + " memarahi " + ((Manusia) M1).nama);
        } else {
            this.ikatanHewan -= 10;
            M1.ikatanManusia -= 10;
            System.out.println(this.nama + " memarahi " + ((Hewan) M1).getNama());
        }
        this.energi -= 25;
        M1.energi -= 25;
    }

    @Override
    public void berkomunikasi(MakhlukHidup M1) {
        if (M1 instanceof Manusia){
            this.ikatanManusia += 5;
            M1.ikatanManusia += 5;
            System.out.println(this.nama + " memarahi " + ((Manusia) M1).nama);
        } else {
            this.ikatanHewan += 10;
            M1.ikatanManusia += 10;
            System.out.println(this.nama + " memarahi " + ((Hewan) M1).getNama());
        }
        this.energi -= 5;
        M1.energi -= 5;
    }

    public void gym(){
        this.energi -= 25;
        System.out.println(this.nama + " melakukan gym");
    }

    public void kerja(){
        this.energi -= 15;
        System.out.println(this.nama + " melakukan kerja");
    }

    public void jogging(){
        this.energi -= 15;
        System.out.println(this.nama + " melakukan jogging");
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
