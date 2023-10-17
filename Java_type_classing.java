public class Java_type_classing {
    public static void main(String[] arg){
        /* Widening casting-passing a smaller size type to a larger one */
        int myNum = 9;
        double myDouble = myNum;
        System.out.println(myNum);
        System.out.println(myDouble);
        /* Narrow casting ... placing the type in parentheses in front of the value */
        double mydouble = 9.78;
        int myInt= (int)mydouble;
        System.out.println(mydouble);
        System.out.println(myInt);
    }
}
