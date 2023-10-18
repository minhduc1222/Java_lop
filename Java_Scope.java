public class Java_Scope {
    public static void main(String[] arg){
        //code here cannot use x
        {
            int x = 1;//x is only accessible within the block of code that contains it
            System.out.print(x);
        }
    }
}
