package Old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecrytLogic {

    String incomingInput;
    String unlockText;

    private List<Integer> keyList = new ArrayList<>();

    public Map<String, String> temporaryMap = new HashMap<>();
    public HashMap<String, String> map = new HashMap<>();

    DecrytLogic(String incomingInput, String lockText) {
        this.unlockText = lockText;
        this.incomingInput = incomingInput;

    }


    public void lastFiveDigitOfIncomingInput() {

        String key = this.incomingInput.substring(incomingInput.length() - 5);
        System.out.println(key);

        convertKeyList(key);

    }

    public void convertKeyList(String key) {
        String[] list = key.split("");
        for (String s : list) {
            keyList.add(Integer.parseInt(s));
        }
        System.out.println(keyList);
        temporaryMap();

    }

    public void temporaryMap() {
        temporaryMap = this.temporaryMap;
        temporaryMap.put("b", "A");
        temporaryMap.put("c", "B");
        temporaryMap.put("d", "C");
        temporaryMap.put("e", "D");
        temporaryMap.put("f", "E");
        temporaryMap.put("g", "F");

        temporaryMap.put(" ", "a");
        temporaryMap.put("Z", "b");
        temporaryMap.put("Y", "c");
        temporaryMap.put("V", "d");
        temporaryMap.put("U", "e");
        temporaryMap.put("T", "f");

        temporaryMap.put("-", "Z");
        temporaryMap.put("*", "Y");
        temporaryMap.put("+", "v");
        temporaryMap.put("/", "U");
        temporaryMap.put(",", "T");
        temporaryMap.put("*-", " ");

        temporaryMap.put("h", "-");
        temporaryMap.put("I", "*");
        temporaryMap.put("i", "+");
        temporaryMap.put("j", "/");
        temporaryMap.put("k", ",");
        temporaryMap.put("l", "*-");

        temporaryMap.put("N", "h");
        temporaryMap.put("O", "ı");
        temporaryMap.put("Ö", "i");
        temporaryMap.put("P", "j");
        temporaryMap.put("R", "k");
        temporaryMap.put("S", "l");

        temporaryMap.put("H", "N");
        temporaryMap.put("W", "O");
        temporaryMap.put("J", "Ö");
        temporaryMap.put("K", "P");
        temporaryMap.put("L", "R");
        temporaryMap.put("M", "S");

        temporaryMap.put("=", "H");
        temporaryMap.put(">", "I");
        temporaryMap.put("<", "J");
        temporaryMap.put("@", "K");
        temporaryMap.put("~", "L");
        temporaryMap.put("(", "M");

        temporaryMap.put("1", "=");
        temporaryMap.put("2", ">");
        temporaryMap.put("3", "<");
        temporaryMap.put("4", "@");
        temporaryMap.put("5", "~");
        temporaryMap.put("6", "(");

        temporaryMap.put("%", "1");
        temporaryMap.put("&", "2");
        temporaryMap.put("'", "3");
        temporaryMap.put("^", "4");
        temporaryMap.put("#", "5");
        temporaryMap.put("£", "6");

        temporaryMap.put("A", "%");
        temporaryMap.put("B", "&");
        temporaryMap.put("C", "'");
        temporaryMap.put("D", "^");
        temporaryMap.put("E", "#");
        temporaryMap.put("F", "£");

        map.putAll(temporaryMap);
        System.out.println(map);

        createCryp(map, unlockText, keyList);

    }

    public String createCryp(HashMap<String, String> map, String lockText, List<Integer> keyList) {


        String cryptedKey = "";
        System.out.println("Şifresinin Çözülmesi istenilen metin: " + lockText);
        System.out.println("\n");
        System.out.println("şifreleme anahtar adım sayısı: " + keyList);
        System.out.println("\n");

        String[] lockTextList = lockText.split("");
        System.out.println(lockTextList);

        int limitOfKeyList = keyList.size();
        for (int i = 0; i < limitOfKeyList; i++) {

            //adımlarda birincisini aldık..

            //bu adım sayısı kadar derine ineceğiz..
            if (keyList.get(i) == 0) {
                cryptedKey += lockTextList[i];
            } else if (keyList.get(i) == 1) {
                cryptedKey += map.get(lockTextList[i]);

            } else {

                int counter = keyList.get(i);
                System.out.println("Adım sayısı:" + keyList.get(i));

                String tutucuValue = map.get(lockTextList[i]);

                for (int y = 1; y < counter; y++) {
                    tutucuValue = map.get(tutucuValue);

                }
                cryptedKey += tutucuValue;
            }


        }


        System.out.println(cryptedKey);

        return cryptedKey;
    }
}
