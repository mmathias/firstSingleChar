import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

    public char getFirstSingleChar(String string) {
        char[] characters = string.toCharArray();

        LinkedHashMap<Character, Integer> ocurrencies = getCounterPerCharacter(characters);

        return getTheFirstOneWith1asOcurencies(ocurrencies);
    }

    private char getTheFirstOneWith1asOcurencies(HashMap<Character, Integer> ocurrencies) {
        for (Map.Entry<Character, Integer> entity : ocurrencies.entrySet()) {
            if (entity.getValue() == 1) return entity.getKey();
        }

        return '-';
    }

    private LinkedHashMap<Character, Integer> getCounterPerCharacter(char[] characters) {
        LinkedHashMap<Character, Integer> ocurrencies = new LinkedHashMap<>();

        for (char character : characters) {
            if (ocurrencies.containsKey(character)) {
                ocurrencies.put(character, ocurrencies.get(character) + 1);
            } else {
                ocurrencies.put(character, 1);
            }
        }

        return ocurrencies;
    }
}
