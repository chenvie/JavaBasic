public class Workout {
    int jumping_jack;
    int squat;
    int push_up;
    int target_burn_kalori;
    int real_burn_kalori;
    int target_waktu;
    int real_waktu;

    public Workout(int target_burn_kalori, int target_waktu) {
        this.target_burn_kalori = target_burn_kalori;
        this.target_waktu = target_waktu;
        this.jumping_jack = 0;
        this.squat = 0;
        this.push_up = 0;
        this.real_burn_kalori = 0;
        this.real_waktu = 0;
    }

    void jumping_jack(){
        this.real_burn_kalori += 15;
        this.real_waktu += 3;
        this.jumping_jack += 1;
        System.out.println("Anda melakukan Jumping Jack sebanyak 1x");
    }

    void jumping_jack(int jum){
        this.real_burn_kalori += (15*jum);
        this.real_waktu += (3*jum);
        this.jumping_jack += jum;
        System.out.println("Anda melakukan Jumping Jack sebanyak " + jum + "x");
    }

    void squat(){
        this.real_burn_kalori += 20;
        this.real_waktu += 2;
        this.squat += 1;
        System.out.println("Anda melakukan Squat sebanyak 1x");
    }

    void squat(int jum){
        this.real_burn_kalori += (20*jum);
        this.real_waktu += (2*jum);
        this.squat += jum;
        System.out.println("Anda melakukan Squat sebanyak " + jum + "x");
    }

    void push_up(){
        this.real_burn_kalori += 20;
        this.real_waktu += 2;
        this.push_up += 1;
        System.out.println("Anda melakukan Push Up sebanyak 1x");
    }

    void push_up(int jum){
        this.real_burn_kalori += (25*jum);
        this.real_waktu += (2*jum);
        this.push_up += jum;
        System.out.println("Anda melakukan Push Up sebanyak " + jum + "x");
    }

    void rest(){
        this.real_waktu += 10;
        System.out.println("Anda melakukan rest selama 10 detik!");
    }

    void calculate(){
        System.out.println("-------------------------------");
        System.out.println("Mengkalkulasi workout anda: ");
        System.out.println("Jumping Jack         : " + this.jumping_jack);
        System.out.println("Squat                : " + this.squat);
        System.out.println("Push Up              : " + this.push_up);
        System.out.println("Kalori (Burn/Target) : " + this.real_burn_kalori + "/" + this.target_burn_kalori);
        System.out.println("Waktu (Burn/Target)  : " + this.real_waktu + "/" + this.target_waktu);

        if(this.real_waktu >= this.target_waktu && this.real_burn_kalori >= this.target_burn_kalori){
            System.out.println("Anda sudah memenuhi target waktu dan sudah memenuhi target pembakaran kalori");
        }else if(this.real_waktu >= this.target_waktu && this.real_burn_kalori < this.target_burn_kalori){
            System.out.println("Anda sudah memenuhi target waktu, akan tetapi anda belum memenuhi target pembakaran kalori");
        }else if(this.real_waktu < this.target_waktu && this.real_burn_kalori >= this.target_burn_kalori){
            System.out.println("Anda belum memenuhi target waktu, akan tetapi anda sudah memenuhi target pembakaran kalori");
        }else if(this.real_waktu < this.target_waktu && this.real_burn_kalori < this.target_burn_kalori){
            System.out.println("Anda belum memenuhi target waktu dan belum memenuhi target pembakaran kalori");
        }

        System.out.println("-------------------------------");
    }
}
