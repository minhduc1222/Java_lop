public class Arrays {
    public static void main(String[] arg){
        int[] myNum = {10, 20, 30, 40};
        myNum[2]=50;
        System.out.println(myNum[2]);
        System.out.println(myNum.length);
        //loop through an array
        String[] weather = {"cloudy", "windy", "rainy", "sunny"};
        for( int i = 0; i < weather.length; i++){
            System.out.println(weather[i]);
        }
        for( String j : weather){
            System.out.println(j);
        }
    }
}
