public class Data_type{
    public static void main(String[] arg){
/* after a word(my, float), need to uppercase the next letter(Float, Num, Letter) */
        byte myByte=127;/* 1 byte - 	Stores whole numbers from -128 to 127 */
        short myShort=32767;/* 2 byte - 	Stores whole numbers from -32,768 to 32,767 */
        int myNum=2147483647;/* 4 byte - 	Stores whole numbers from -2,147,483,648 to 2,147,483,647 */
        long myLong=9223372036854775807L;/* value must end with l(use L to avoid confuse l and 1) | 8 byte - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 */
        float myFloatNum=9.999999f;/* 4 byte -  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits  */
        double myDouble=9.99999999999999d;/*  value must end with d | 8 byte -  Stores fractional numbers. Sufficient for storing 15 decimal digits  */
        char myLetter='a';
        boolean myBool=true;
        String myText="abas";/* use double quote when assigning value for a String */
            System.out.println(myByte);
            System.out.println(myShort);
            System.out.println(myNum);
            System.out.println(myLong);
            System.out.println(myFloatNum);
            System.out.println(myDouble);
            System.out.println(myLetter);
            System.out.println(myBool);
            System.out.println(myText);
    }
}
