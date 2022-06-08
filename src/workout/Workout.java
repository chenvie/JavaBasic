package workout;

public class Workout {
    private int targetCalori;
    private int targetTime;
    private int actualCalori;
    private int actualTime;
    private int countJumpJack;
    private int countSquat;
    private int countPushUp;

    public Workout(int calori, int time){
        this.targetCalori = calori;
        this.targetTime = time;
        this.countJumpJack = 0;
        this.countPushUp = 0;
        this.countSquat = 0;
        System.out.println("Selamat memulai workout.Workout Anda !!");
    }

    public void jumping_jack(){
        actualCalori += 15;
        actualTime += 3;
        countJumpJack += 1;
        System.out.println("Anda melakukan Jumping Jack sebanyak 1x");
    }

    public void jumping_jack(int rep){
        actualCalori += (15 * rep);
        actualTime += (3 * rep);
        countJumpJack += rep;
        System.out.println("Anda melakukan Jumping Jack sebanyak " + rep + "x");
    }

    public void squat(){
        actualCalori += 20;
        actualTime += 2;
        countSquat += 1;
        System.out.println("Anda melakukan Squat sebanyak 1x");
    }

    public void squat(int rep){
        actualCalori += (20 * rep);
        actualTime += (2 * rep);
        countSquat += rep;
        System.out.println("Anda melakukan Squat sebanyak " + rep + "x");
    }

    public void push_up(){
        actualCalori += 25;
        actualTime += 2;
        countPushUp += 1;
        System.out.println("Anda melakukan Push Up sebanyak 1x");
    }

    public void push_up(int rep){
        actualCalori += (25 * rep);
        actualTime += (2 * rep);
        countPushUp += rep;
        System.out.println("Anda melakukan Push Up sebanyak " + rep + "x");
    }

    public void rest(){
        actualTime += 10;
        System.out.println("Anda melakukan rest selama 10 detik !");
    }

    public void calculate(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Mengkalkulasi workout.Workout Anda: ");
        System.out.println("Jumping Jack : " + countJumpJack);
        System.out.println("Squat : " + countSquat);
        System.out.println("Push Up : " + countPushUp);
        System.out.println("Kalori (Burn/Target) : " + actualCalori + "/" + targetCalori);
        System.out.println("Waktu (Burn/Target) : " + actualTime + "/" + targetTime);

        if (actualCalori < targetCalori) {
            if (actualTime < targetTime) {
                System.out.println("Anda belum memenuhi target waktu, dan Anda belum memenuhi target pembakaran kalori !");

            } else {
                System.out.println("Anda memenuhi target waktu Anda, tetapi Anda belum memenuhi target pembakaran kalori !");

            }
        } else {
            if (actualTime < targetTime) {
                System.out.println("Anda belum memenuhi target waktu Anda, tetapi Anda memenuhi target pembakaran kalori !");

            } else {
                System.out.println("Anda memenuhi target waktu, dan Anda memenuhi target pembakaran kalori !");

            }
        }
        System.out.println("---------------------------------------------------------------------------");

    }
}
