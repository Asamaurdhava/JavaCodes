public class ReversedWords {

    public static String reverseWords(String S) {
        
        String reversed  = "";

        String[] stringArray = null;
        
        stringArray = S.split("[.]",0);

        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                reversed += stringArray[i] + ".";
            } else {
                reversed += stringArray[i];
            }
        }

        return reversed;
        
    }

    public static void main (String[] agrs) {

        String reversed = reverseWords("i.like.this.program.very.much");

        System.out.println(reversed);

    }
    
}
