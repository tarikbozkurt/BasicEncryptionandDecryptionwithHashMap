import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class CryptoLogicService implements CryptoLogicInterface{

    private String incomingInput;
    private String lockText;
    private List<Integer> keyList = new ArrayList<>();

    protected CryptoList cryptoList;

    CryptoLogicService(String incomingInput,String lockText, Boolean control){
        this.lockText = lockText;
        this.incomingInput = incomingInput;
        cryptoList = new CryptoList(control);
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
    }


    @Override
    public String encryption() {
        final List<String> cryptedKey = new ArrayList<>();
        System.out.println("Şifrelenmesi istenilen metin: " + lockText);
        System.out.println("\n");
        System.out.println("şifreleme anahtar adım sayısı: " + keyList);
        System.out.println("\n");
        HashMap<String, String> map = cryptoList.getMap();

        /*
         *
         * TARIK
         *
         * SO10241
         * > 10241
         *
         * > 10241 keyList
         *
         * 1,0,2,4,1
         * >TARIK
         *
         * > String[] T,A,R,I,K
         *            1,0,2,4,1
         *
         * 1 > T
         *
         *
         *
         *
         * */

        String[] lockTextList = lockText.split("");

    keyList.forEach(f->{
        int index = keyList.indexOf(f);

        switch (f){

            case 0:
                cryptedKey.add(lockTextList[index]);
                break;

            case 1:
                cryptedKey.add(map.get(lockTextList[index]));
                break;

        }
        //Atomic referansta, String List olmadığı için Stream.map kullanmadım.
        if(f > 1){
            String tutucu = map.get(lockTextList[f]);
            for(int y = 1;y<f;y++){
                tutucu = map.get(tutucu);

            }
            cryptedKey.add(tutucu);
        }
    });

       return makeStringListTOString(cryptedKey);

    }



    public String makeStringListTOString(List<String> list){

        String cryptedList ="";
        for(int i =0;i<list.size();i++){
            cryptedList += list.get(i);

        }

        return cryptedList;
    }




    @Override
    public String decryption() {
        final List<String> cryptedKey = new ArrayList<>();
        System.out.println("Şifrelenmesi istenilen metin: " + lockText);
        System.out.println("\n");
        System.out.println("şifreleme anahtar adım sayısı: " + keyList);
        System.out.println("\n");
        HashMap<String, String> map = cryptoList.getMap();

        String[] lockTextList = lockText.split("");

        keyList.forEach(f->{
            int index = keyList.indexOf(f);

            switch (f){

                case 0:
                    cryptedKey.add(lockTextList[index]);
                    break;

                case 1:
                    cryptedKey.add(map.get(lockTextList[index]));
                    break;

            }
            //Atomic referansta, String List olmadığı için Stream.map kullanmadım.
            if(f > 1){
                String tutucu = map.get(lockTextList[f]);
                for(int y = 1;y<f;y++){
                    tutucu = map.get(tutucu);

                }
                cryptedKey.add(tutucu);
            }
        });

        return makeStringListTOString(cryptedKey);
    }
    }


