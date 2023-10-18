public class Java_method{
    static void myMethod(){
        System.out.print("Hello World\n");
    }

    //parameter
    static void myParameter(String classes){
        System.out.println("Hello"+ classes);
    }

    public static void main(String[] arg){
        myMethod();

    //parameter
        myParameter(" my Friend");
        myParameter(" world");

    }
}