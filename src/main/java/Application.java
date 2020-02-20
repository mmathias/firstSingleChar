import java.util.HashMap;

public class Application {

    public char getFirstSingleChar(String string) {
        char[] characters = string.toCharArray();

        // getCounterPerCharacter
        HashMap<Character, Integer> ocurrencies = getCounterPerCharacter(characters);

        // getTheFirstOneWith1asOcurencies
        return getTheFirstOneWith1asOcurencies(characters, ocurrencies);
    }

    private char getTheFirstOneWith1asOcurencies(char[] characters, HashMap<Character, Integer> ocurrencies) {
        for (char character : characters) {
            if (ocurrencies.get(character) == 1) {
                return character;
            }
        }

        return '-';
    }

    private HashMap<Character, Integer> getCounterPerCharacter(String characters) {
        HashMap<Character, Integer> ocurrencies = new HashMap<>();

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
