public class Final_variable {
    public static void main1(String[] arg){
        final int myNumber=2;
        myNumber=3;/* cannot assign value to final variable myNumber */
        System.out.println(myNumber);
    }
}
