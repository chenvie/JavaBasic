public class Workout {
    public int waktu;
    public int kalori;
    public int jb;
    public int sq;
    public int pu;

    public Workout(int waktu, int kalori){
        this.waktu = waktu;
        this.kalori = kalori;

    }

    public void jumping_back(int jb){
        this.jb = jb;
        System.out.println("Anda melakukan jumping back sebanyak "+jb+ " kali");

    }

    public void squat(int sq){
        this.sq=sq;
        System.out.println("Anda melakukan squat sebanyak "+sq+ " kali");

    }

    public void push_up(int pu){
        this.pu=pu;
        System.out.println("Anda melakukan push up sebanyak "+pu+ " kali");

    }

    public void rest(){
        System.out.println("Anda melakukan rest selama 10 detik !");
    }

    public void calculate(){
        System.out.println("Mengkalkulasi workout anda : ");
        System.out.println("Jumping back : " +jb);
        System.out.println("Squat : " +sq);
        System.out.println("Push Up : " +pu);

        int kaloriBurn = (jb*15)+(sq*20)+(pu*25);
        int waktuBurn = (jb*3)+(sq*2)+(pu*2);
        System.out.println("Kalori (Burn/Target) : " +kaloriBurn+"/"+kalori);
        System.out.println("Waktu(Burn/Target) : " +waktuBurn+"/"+waktu);

        if(kaloriBurn >= kalori && waktuBurn >= waktu){
            System.out.println("Anda memenuhi target waktu anda, dan anda memenuhi target pembakaran kalori !");
        } else if (kaloriBurn < kalori && waktuBurn > waktu) {
            System.out.println("Anda belum memenuhi target kalori namun anda memenuhi target waktu !");
        } else if (kaloriBurn > kalori && waktuBurn < waktu) {
            System.out.println("Anda belum memenuhi target waktu namun anda memenuhi target kalori !");
        } else {
            System.out.println("Anda belum memenuhi target waktu dan anda belum memenuhi target kalori !");
        }
    }

    public static void main(String[] args) {
        Workout workout = new Workout(30,20);
        System.out.println("Selamat memulai workout anda");

        workout.jumping_back(2);
        workout.squat(6);
        workout.push_up(5);
        workout.rest();
        workout.calculate();
    }
}
