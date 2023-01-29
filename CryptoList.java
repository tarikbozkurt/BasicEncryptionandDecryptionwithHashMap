import java.util.HashMap;
import java.util.Map;



public class CryptoList {

     // Sınıfın nesnesi oluşturulmuş mu =?
     HashMap<String,String> map = new HashMap<>();
     Map<String,String> temporaryMap = new HashMap<>();


    CryptoList(Boolean control){

        if(control){
            temporaryMap.put("A","b");
            temporaryMap.put("B","c");
            temporaryMap.put("C","d");
            temporaryMap.put("D","e");
            temporaryMap.put("E","f");
            temporaryMap.put("F","g");

            temporaryMap.put("a"," ");
            temporaryMap.put("b","Z");
            temporaryMap.put("c","Y");
            temporaryMap.put("d","V");
            temporaryMap.put("e","U");
            temporaryMap.put("f","T");

            temporaryMap.put("Z","-");
            temporaryMap.put("Y","*");
            temporaryMap.put("V","+");
            temporaryMap.put("U","/");
            temporaryMap.put("T",",");
            temporaryMap.put(" ","*-");

            temporaryMap.put("-","h");
            temporaryMap.put("*","I");
            temporaryMap.put("+","i");
            temporaryMap.put("/","j");
            temporaryMap.put(",","k");
            temporaryMap.put("*-","l");

            temporaryMap.put("h","N");
            temporaryMap.put("ı","O");
            temporaryMap.put("i","Ö");
            temporaryMap.put("j","P");
            temporaryMap.put("k","R");
            temporaryMap.put("l","S");

            temporaryMap.put("N","H");
            temporaryMap.put("O","W");
            temporaryMap.put("Ö","J");
            temporaryMap.put("P","K");
            temporaryMap.put("R","L");
            temporaryMap.put("S","M");

            temporaryMap.put("H","=");
            temporaryMap.put("I",">");
            temporaryMap.put("J","<");
            temporaryMap.put("K","@");
            temporaryMap.put("L","~");
            temporaryMap.put("M","(");

            temporaryMap.put("=","1");
            temporaryMap.put(">","2");
            temporaryMap.put("<","3");
            temporaryMap.put("@","4");
            temporaryMap.put("~","5");
            temporaryMap.put("(","6");

            temporaryMap.put("1","%");
            temporaryMap.put("2","&");
            temporaryMap.put("3","'");
            temporaryMap.put("4","^");
            temporaryMap.put("5","#");
            temporaryMap.put("6","£");

            temporaryMap.put("%","A");
            temporaryMap.put("&","B");
            temporaryMap.put("'","C");
            temporaryMap.put("^","D");
            temporaryMap.put("#","E");
            temporaryMap.put("£","F");

            map.putAll(temporaryMap);
        }
        else{

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

        }


    }



    public HashMap<String, String> getMap(){

        return map;
    }

    public HashMap<String, String> updateList(String key, String value) throws Exception {

         if(map.containsKey(key))
             map.put(key,value);
         else{
             throw new Exception("Key Mevcut değil");
         }

         return map;

    }


}
