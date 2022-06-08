public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(6,4);
        PersegiPanjang pp2 = new PersegiPanjang(10, 6);

        pp.info();
        pp2.info();

        PersegiPanjang pp3 = new PersegiPanjang(0,0);
        pp3.panjang = 8;
        pp3.info();

        BangunDatar bangunDatar = pp2;
        bangunDatar.info();
    }

}
