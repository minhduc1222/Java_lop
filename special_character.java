public class special_character {
    public static void main(String[] arg){
        String txt="We are the so-called 'Vikings' from the north_land";
        // the backslash(\) turns special characters into string characters
        // (\')-> ' ; (\")->" ; (\\)=>\
        String txt_1="it\'s alright";
        //escape sequence
        System.out.println(txt_1);
        String txt_escape_sequence_newline="Hello\nWorld";
        System.out.println(txt_escape_sequence_newline);
        String txt_escape_sequence_tab="Hello\tWorld";
        System.out.println(txt_escape_sequence_tab);
        String txt_escape_sequence_backspace="Hello\bWorld";
        System.out.println(txt_escape_sequence_backspace);
        String txt_escape_sequence_formfeed="Hello\fWorld";
        System.out.println(txt_escape_sequence_formfeed);
    }
}