public class Switch_Statements {
    public static void main(String[] arg){
        int day = 4; //expression
        // value of expression is compared with values of each case
        switch(day){
            case 1:
                System.out.println("monday");
                break;// break stop the execution of more code by breaking out of the switch block
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("looking forward to some other time");
        }
    }
}
