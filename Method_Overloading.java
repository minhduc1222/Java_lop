public class Method_Overloading {
    //Method overloading, multiple method could have the same name with different parameter
    static int myInt(int x, int y){
        return x + y;
    }
    static double myDouble(double x , double y){
        return x + y;
    }
    //Or we could overload into one
    static int myLoad(int a, int b){
        return a + b;
    }
    static Double myLoad(double a, double b){
        return a + b;
    }
    public static void main(String[] arg){
        int z = myInt(5, 7);
        double e= myDouble(6, 8);
        System.out.print("Int "+ z +"\n");
        System.out.print("Double "+ e +"\n");

        int myNum1 = myLoad(8, 9);
        double myNum2 = myLoad(4.7 , 3.7);
        System.out.print("Second int " + myNum1 + "\n");
        System.out.print("Second double " + myNum2 + "\n");
    }
}
