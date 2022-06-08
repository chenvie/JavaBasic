public class VarTypeExample {
//    int instanceField;
//    static int staticField;

    public static void main(String[] args){
//        VarTypeExample varOne = new VarTypeExample();
//        varOne.instanceField = 10;
//
//        int i = 'A';
//        int a = (int) 123.56;
//        int array[] = {1,2,3,4,5};
//
//        System.out.println(varOne.instanceField);
//        System.out.println("i = " + i);
//        System.out.println("a = " + a);
//        System.out.println(array[2]);

//        for (int i = 0;i<5;i++){
//            for (int j = 0;j<5;j++){
//                System.out.print("# ");
//            }
//            System.out.println();
//        }

//        Workout a = new Workout(500,100);
//        System.out.println("Selamat memulai workout anda !!!");
//        a.squat();
//        a.squat();
//        a.squat();
//        a.squat(5);
//        a.calculate();
//        a.jumping_jack();
//        a.jumping_jack(10);
//        a.rest();
//        a.calculate();
//        a.push_up(15);
//        a.rest();
//        a.calculate();
//        a.squat();
//        a.push_up();
//        a.jumping_jack();
//        a.calculate();

        Manusia ervan = new Manusia();
        Manusia rini = new Manusia();
        Hewan shiro = new Hewan();
        ervan.bermain(shiro);
        rini.berkomunikasi(ervan);
        shiro.berkomunikasi(rini);
        System.out.println("Shiro: ");
        shiro.print();
        System.out.println("Ervan: ");
        ervan.print();
        System.out.println("Rini: ");
        rini.print();
        ervan.menikah(rini);
        rini.menikah(shiro);
    }


}
