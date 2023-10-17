public class break_and_continue {
    public static void main(String[] arg){
        for(int i = 0; i < 10; i++){
            if (i==4){
                break;// break one iteration and jump out of the loop
            }
            System.out.println(i);
        }
        for(int j = 0; j <7; j++){
            if (j==4){
                continue;// break one iteration and continue with the next iteration
            }
        }
    }
}
