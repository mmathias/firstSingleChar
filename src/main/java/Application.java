import java.util.ArrayList;
import java.util.List;

public class Application {

    public String getFirstSingleChar(String original) {
        List<String> parsedChars = new ArrayList<>();

        for (Character c: original.toCharArray()) {
            String each = c.toString();

            if (parsedChars.contains(each)){
                parsedChars.remove(each);
            } else {
                parsedChars.add(each);
            }
        }

        return parsedChars.isEmpty() ? "-" : parsedChars.get(0);
    }
}
