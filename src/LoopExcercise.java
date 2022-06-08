public class LoopExcercise {
    public static void main (String[]args){
        pagar1();
    }

    public static void pagar1(){
        int x = 5;
        for (int i = 1; i<=x;i++){
            for(int j = 1; j<=x;j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void pagar2(){
        int x = 5;
        for (int i = 1; i<=x;i++){
            for(int j = 1; j<=i;j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
