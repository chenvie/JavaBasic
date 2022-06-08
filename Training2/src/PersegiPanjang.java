public class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public float keliling() {
        return 2*(this.panjang+this.lebar);
    }

    @Override
    public float luas() {
        return this.panjang*this.lebar;
    }

    @Override
    public void info() {
        System.out.println("Kelilingnya adalah : "+2*(this.panjang+this.lebar)+" Luasnya adalah : "+this.panjang*this.lebar);
    }
}

