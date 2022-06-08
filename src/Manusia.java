public class Manusia extends MahlukHidup implements AktivitasBersama{
    boolean status;
    public Manusia() {
        super();
        this.status = true;
    }

    void menikah(MahlukHidup M1){
        if(M1 instanceof Manusia){
            if(((Manusia) M1).status == false){
                System.out.println("Calon anda sudah taken/menikah");
            }else {
                if(M1.ikatanManusia < 80 && M1.ikatanManusia > 40){
                    ((Manusia) M1).status = false;
                    this.status = false;
                    System.out.println("Berhasil menikah");
                }else {
                    System.out.println("Ikatan masih belum cukup");
                }
            }
        }else {
            System.out.println("Hanya bisa menikah dengan sesama manusia saja");
        }
    }

    @Override
    public void bermain(MahlukHidup M1) {
        if(M1 instanceof Manusia){
            this.ikatanManusia += 10;
            M1.ikatanManusia += 10;
        }else {
            this.ikatanHewan += 15;
            M1.ikatanManusia += 15;
        }
        this.energi -= 20;
        M1.energi -= 20;
        this.print();
        M1.print();
    }

    @Override
    public void memarahi(MahlukHidup M1) {
        if(M1 instanceof Manusia){
            this.ikatanManusia -= 20;
            M1.ikatanManusia -= 20;
        }else {
            this.ikatanHewan -= 10;
            M1.ikatanManusia -= 10;
        }
        this.energi -= 25;
        M1.energi -= 25;
        this.print();
        M1.print();
    }

    @Override
    public void berkomunikasi(MahlukHidup M1) {
        if(M1 instanceof Manusia){
            this.ikatanManusia += 5;
            M1.ikatanManusia += 5;
        }else {
            this.ikatanHewan += 10;
            M1.ikatanManusia += 10;
        }
        this.energi -= 5;
        M1.energi -= 5;
        this.print();
        M1.print();
    }
}
