public class if_else {
    public static void main(String[] arg){
        int time = 20;
        if (time < 10){
            System.out.println("Good day");
        }
        else if(time<18){
            System.out.println("Good afternoon");
        }
        else{
            System.out.println("Good evening");
        }
        //short hand if else
        int number = 100;
        //variable String = {condition} ? expressionTrue : expressionFalse;
        String result = (number < 18) ? "Good day" : "Good evening";
        System.out.println(result);
    }
}
