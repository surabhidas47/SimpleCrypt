import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    Character cs;
    Character cf;

    ROT13(Character cs, Character cf) {


        this.cs=cs;

        this.cf=cf;

    }

    ROT13() {



    }


    public String crypt(String text) throws UnsupportedOperationException {


        char [] letters = new char[text.length()];

        for (int i=0;i<text.length();i++){
            letters[i]=text.charAt(i);
        }




        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
