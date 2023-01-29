package Old;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncryptLogic {

    String incomingInput;
    String lockText;
    private List<Integer> keyList = new ArrayList<>();

    public Map<String,String> temporaryMap = new HashMap<>();
    public HashMap<String,String> map = new HashMap<>();

    EncryptLogic(String incomingInput,String lockText){
        this.lockText = lockText;
        this.incomingInput = incomingInput;
    }

    public void lastFiveDigitOfIncomingInput(){

        String key = this.incomingInput.substring(incomingInput.length()-5);
        System.out.println(key);

        convertKeyList(key);

    }

    public void convertKeyList(String key){
        String[] list = key.split("");
        for(String s : list){
            keyList.add(Integer.parseInt(s));
        }
        System.out.println(keyList);
        temporaryMap();

    }

    public void temporaryMap(){
        temporaryMap = this.temporaryMap;

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
        System.out.println(map);

        createCryp( map,lockText,keyList);

    }

    public String createCryp(HashMap<String,String> map,String lockText,List<Integer> keyList){


        String cryptedKey="";
        System.out.println("Şifrelenmesi istenilen metin: "+lockText);
        System.out.println("\n");
        System.out.println("şifreleme anahtar adım sayısı: "+keyList);
        System.out.println("\n");

        String[] lockTextList = lockText.split("");

        int limitOfKeyList = keyList.size();
       for(int i=0;i<limitOfKeyList;i++){

           //adımlarda birincisini aldık..

           //bu adım sayısı kadar derine ineceğiz..
           if(keyList.get(i) == 0){
               cryptedKey+=lockTextList[i];
           }
           else if(keyList.get(i) == 1){
               cryptedKey +=map.get(lockTextList[i]);

           }
           else{

               int counter = keyList.get(i);
               System.out.println("Adım sayısı:"+keyList.get(i));

               String tutucuValue = map.get(lockTextList[i]);

               for(int y = 1;y<counter;y++){
                   tutucuValue = map.get(tutucuValue);

               }
               cryptedKey += tutucuValue;
           }


       }


        System.out.println(cryptedKey);

        return cryptedKey;
    }




}
