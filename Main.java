import Old.DecrytLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        * Öğrenci numarasının son 5 hanesine göre şifreleme yapan program..
        *
        * */


        String cryptedText;
        System.out.println("-Hoş geldiniz-\n");


        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));





        System.out.println("Metin Şifrelemek istiyorsanız  / '1' \n Metin Şifresinin çözülmesini istiyorsanız / '2' \n giriniz");
        int choice = Integer.parseInt(reader.readLine());
        System.out.println(choice);


        if(choice == 1){

            System.out.println("-Şifreleme işlemi için lütfen okul numaranızı giriniz..-");
            String inComingInput = reader.readLine();

            System.out.println("-Şifrelemek istediğiniz metni giriniz..-");
            String lockText = reader.readLine();


            CryptoLogicService cryptoLogicService = new CryptoLogicService(inComingInput,lockText,true);
            cryptoLogicService.lastFiveDigitOfIncomingInput();

            System.out.println(cryptoLogicService.encryption());

        }
        else if(choice == 2){
            System.out.println("-Şifre Çözme işlemi için lütfen okul numaranızı giriniz..-");
            String inComingInput = reader.readLine();

            System.out.println("-Şifresinin Çözülmesini istediğiniz metni giriniz..-");
            String lockText = reader.readLine();

            CryptoLogicService cryptoLogicService = new CryptoLogicService(inComingInput,lockText,false);
            cryptoLogicService.lastFiveDigitOfIncomingInput();

            System.out.println(cryptoLogicService.encryption());
        }


    }

}