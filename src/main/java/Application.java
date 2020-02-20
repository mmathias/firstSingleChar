public class Application {

    public char getFirstSingleChar(String string) {
        char character = string.charAt(0);
        int i = 1;

        while (i < string.length()) {
            if (character == string.charAt(i)) {
                string = string.replaceAll(String.valueOf(character), "");
                i = 1;
                if (string.length() > 0) {
                    character = string.charAt(0);
                }
            } else  {
                i++;
            }
        }

        return string.length() > 0 ? string.charAt(0) : '-';
    }
}
