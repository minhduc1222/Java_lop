public class Return_value {
    static int myMain(int x){
        return 5 + x;
    }
    //method with if else
    static void myMethod(int num){
        if (num < 18){
            System.out.print("You are not old enough");
        }
        else{
            System.out.print("You are old enough");
        }
    }
    public static void main(String[] arg){
        System.out.print(myMain(6)+"\n");
        myMethod(15);

    }
}

