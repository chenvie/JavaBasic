public class Manusia extends MakhlukHidup implements AktivitasBersama{
    boolean status;
    String nama;
    String jenkel;

    public Manusia(String nama, String jenkel){
        this.nama = nama;
        this.jenkel = jenkel;
    }

    public void Menikah(MakhlukHidup M1){
        if(M1 instanceof Manusia){
            if(M1.ikatanManusia > 80 && this.ikatanManusia > 80){
                System.out.println("Dapat menikah");
            }else{
                System.out.println("Belum dapat menikah");
            }
        }else{
            System.out.println("Tidak boleh menikah dengan hewan");
        }

    }
    @Override
    public void Bermain(MakhlukHidup M1) {
        if(M1 instanceof Manusia){
            this.ikatanManusia += 10;
            M1.ikatanManusia += 10;
        }else{
            this.ikatanHewan += 15;
            M1.ikatanManusia += 15;
        }
        System.out.println(M1.ikatanHewan);
        System.out.println(this.ikatanManusia);
        System.out.println("------");
        System.out.println(M1.ikatanManusia);
        System.out.println(this.ikatanHewan);;
    }

    @Override
    public void Memarahi(MakhlukHidup M1) {
        if(M1 instanceof Manusia){
            this.ikatanManusia -= 20;
            M1.ikatanManusia -= 20;
        }else{
            this.ikatanHewan -=10;
            M1.ikatanManusia -= 10;
        }
    }

    @Override
    public void Berkomunikasi(MakhlukHidup M1) {
        if(M1 instanceof Manusia){
            this.ikatanManusia += 5;
            M1.ikatanManusia += 5;
        }else{
            this.ikatanHewan +=10;
            M1.ikatanManusia += 10;
        }
    }
}
