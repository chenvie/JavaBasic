public class Hewan extends MahlukHidup implements AktivitasBersama{

    public Hewan() {
        super();
    }

    void makan(){
        this.energi += 25;
        System.out.println("Hewan makan, energi menjadi " + this.energi);
    }

    void tidur(){
        this.energi += 15;
        System.out.println("Hewan tidur, energi menjadi " + this.energi);
    }

    void tidur(int jam){
        this.energi += (15*jam);
        System.out.println("Hewan tidur selama "+ jam +" jam, energi menjadi " + this.energi);
    }

    void mandi(){
        System.out.println("hewan mandi dan bertambah nilai kebersihan sebanyak 100");
    }

    @Override
    public void bermain(MahlukHidup M1) {
        if(M1 instanceof Hewan){
            this.ikatanHewan += 10;
            M1.ikatanHewan += 10;
        }else {
            this.ikatanManusia += 15;
            M1.ikatanHewan += 15;
        }
        this.energi -= 20;
        M1.energi -= 20;
        this.print();
        M1.print();
    }

    @Override
    public void memarahi(MahlukHidup M1) {
        if(M1 instanceof Hewan){
            this.ikatanHewan -= 20;
            M1.ikatanHewan -= 20;
        }else {
            this.ikatanManusia -= 15;
            M1.ikatanHewan -= 15;
        }
        this.energi -= 25;
        M1.energi -= 25;
        this.print();
        M1.print();
    }

    @Override
    public void berkomunikasi(MahlukHidup M1) {
        if(M1 instanceof Hewan){
            this.ikatanHewan += 5;
            M1.ikatanHewan += 5;
        }else {
            this.ikatanManusia += 10;
            M1.ikatanHewan += 10;
        }
        this.energi -= 5;
        M1.energi -= 5;
        this.print();
        M1.print();
    }
}
