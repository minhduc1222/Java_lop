public class String_1 {/* cannot name file as string cuz there's already a java string class */
  public static void main(String[] args){
    String greeting="Hello";
    /* length of string */
    System.out.println("the length of the string is:" + greeting.length());
    /* upper, lowercase string */
    System.out.println(greeting.toUpperCase());
    System.out.println(greeting.toLowerCase());
    /* find the location of a specific word */
    String word="hello can you find where's locate occur";
    System.out.println("pls find 'locate' occurence: " + word.indexOf("locate"));
    String greeting_1="World";
    /* String concatenation ( noi ch_uoi) */
    System.out.println(greeting.concat(greeting_1));
  }
}