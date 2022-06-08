public class Hewan extends MakhlukHidup implements AktivitasBersama{

    String nama;

    public Hewan(String nama){
        this.nama = nama;
    }

    @Override
    public void Bermain(MakhlukHidup M1) {
        if(M1 instanceof Hewan){
            this.ikatanManusia += 10;
            M1.ikatanManusia += 10;
        }else{
            this.ikatanHewan += 15;
            M1.ikatanManusia += 15;
        }
    }

    @Override
    public void Memarahi(MakhlukHidup M1) {
        if(M1 instanceof Hewan){
            this.ikatanManusia -= 20;
            M1.ikatanManusia -= 20;
        }else{
            this.ikatanHewan -=10;
            M1.ikatanManusia -= 10;
        }
    }

    @Override
    public void Berkomunikasi(MakhlukHidup M1) {
        if(M1 instanceof Hewan){
            this.ikatanManusia += 5;
            M1.ikatanManusia += 5;
        }else{
            this.ikatanHewan +=10;
            M1.ikatanManusia += 10;
        }
    }
}
