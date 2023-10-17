public class Math_1 {
    public static void main(String[] arg){
        System.out.println(Math.max(5, 10));
        System.out.println(Math.sqrt(64));

        //return the absolute (positive) value of x
        System.out.println(Math.abs(-4.7));
        //return a random between 0.0 and 1.0
        System.out.println(Math.random());

        int randomNum=(int)(Math.random()*101); // 0 to 100
        System.out.println(randomNum);
    }
}
