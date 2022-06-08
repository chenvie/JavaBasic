package sims;

public class Main {
    public static void main(String[] args){
        Manusia rini = new Manusia("Rini", "perempuan");
        Manusia ervan = new Manusia ("ervan", "laki-laki");
        Hewan shiro = new Hewan("shiro");

        ervan.bermain(shiro);
        ervan.memarahi(shiro);
        try {
            ervan.menikah(rini);
            ervan.menikah(shiro);
        } catch (Exception e) {
            System.out.println("Error");
            ervan.berkomunikasi(rini);
        }
        ervan.bermain(shiro);
    }
}
