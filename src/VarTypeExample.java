public class VarTypeExample {
    int instanceField;
    static int staticField;

    public static void main (String[]args){
       VarTypeExample varOne = new VarTypeExample();
       varOne.instanceField = 1;

       System.out.println("Var One is "+varOne.instanceField);
    }
}
