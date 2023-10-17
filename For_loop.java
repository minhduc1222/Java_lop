public class For_loop {
    public static void main(String[] arg){
        for (int i = 0; i < 5; i++){
            System.out.println("Outer: "+i);

            for (int j = 0; j < 3; j++){
                System.out.println("  Inner: "+j);
            }
        }
    }
}