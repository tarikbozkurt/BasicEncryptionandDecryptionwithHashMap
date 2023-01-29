# BasicEncryptionandDecryptionwithHashMap
 Java Program that takes the last 5 digits of the university student number entered from outside and takes the 5-character string that is requested to be encrypted or decrypted and performs the operation.

Ön açıklama:
-----------
Proje içerisinde bulunan "old" klasöründeki kodlar projenin ilk yapıldığı halidir. Burada for'lar if'ler ile programın akışını inceleyebilirsiniz.


1- Adım : Program sizden Şifreleme mi yapmak istersiniz yoksa Şifre Çözmek mi istersiniz diye bir soru yöneltecek,
2- Adım : Program sizden okul numaranızı isteyecek.,
3- Adım : Program sizden Adım bir deki seçiminize göre bir  5 karakter uzunluğunda string ifade isteyecek,
4- Adım : Seçimlere göre program size Şifrelenmiş Stringi / Şifresinin çözülmesini istediğiniz stringi verecektir.

Kurallar
---------
Eğer okul numarasının son 5 hanesi içerisinde 0 varsa, 0'a denk gelen karakterin kendisini direkt yazdır.


Programın çalışma mantığı
--------------------------

Yukarıda ki adımlar tamamlandıktan sonra;
    Program öncelikle girilen okul numarasının son 5 hanesini alacağı fonksiyonu çalıştırır.
    Program başka bir fonksiyon ile   int array e çevirir.
    
    Daha sonra HashMap Olarak tanımlanan Şifreler yapıcı metod ile istenilen işleme göre oluşturulur ve gerekli algoritmalar sağlanır. Bu algoritmalar neticesinde istenilen işlem
    sonuca ulaşmış olur.
    
    
    
    Algoritmanın çalışma Mantığı
    ---------------------------
    Alınan okul numarasının son 5 hanesi bizim derinlik sayılarımız olacak.
    Açıklama:
          örneğin 14545524 numaralı bir öğrenci numarasını girdi.
            numaranın son 5 hanesinin int array hali [4,5,5,2,4]
            Burada mevcut olan sayılar bizim şifreleme için hashMap içerisinde daha da derine gireceğimiz adım sayısını veriyor.
            
           örneğin kullanıcı HashMap tablosunda mevcut olan karakterleri içeren bir kelime olarak "Tarik" girdi.
           
           burada mantık şu şekilde olacaktır..
            [4,5,5,2,4]
             T A R I K
           
           T : 4,
           A : 5,
           R : 5,
           I : 2,
           K : 4,
           
           Adım-1 : T'nin hasmap de value si ne bakarız. Daha sonra Bulduğumuz value yi key olarak atayıp yeni value yi buluruz. Bu işlem 4 adım derinliğindedir çünki,
           okul numarasının son 5 hanesinde "T" ye denk gelen sayı 4 tür.
           Diğer karakterler de bu şekilde yapılıp en son çıkan string ekrana yazdırılır..
           
           Algoritmada 0 gelirse direkt gelen karakterin kendisi, 1 gelirse de kendi value si ne eşit olacağı için döngü içerisinde 0 ve 1 e yer vermedim. Switch-Case yapısı ile
           programın kontrol etmesini sağladım.
           
           
           
      ENG
      
      Preliminary explanation:
-----------
The codes in the "old" folder in the project are the first version of the project. Here you can examine the flow of the program with for's if's.


1- Step: The program will ask you whether you want to Encrypt or Decrypt,
2- Step: The program will ask you for your school number.
3- Step: The program will ask you for a 5-character string expression according to your selection in Step one,
4- Step: According to the selections, the program will give you the Encrypted String / the string you want to decrypt.

Rules
---------
If 0 is in the last 5 digits of the school number, print the character corresponding to 0 directly.


The working logic of the program
--------------------------

After completing the above steps;
    The program first runs the function where it will take the last 5 digits of the entered school number.
    The program converts it to an int array with another function.
     
     Then, Passwords defined as HashMap are created according to the desired operation with the constructor method and the necessary algorithms are provided. As a result of these algorithms, the desired operation
    reaches the conclusion.
    
    
    
    Working Logic of the Algorithm
    ---------------------------
    The last 5 digits of the received school number will be our depth numbers.
    Explanation:
          For example, he entered a student number 14545524.
            int array of the last 5 digits of the number [4,5,5,2,4]
            The numbers available here give us the number of steps we'll go deeper into in the hashMap for encryption.
            
           for example the user has entered "Tarik" as a word containing the characters available in the HashMap table.
           
           Here the logic would be as follows.
            [4,5,5,2,4]
             T A R I K
           
           T: 4,
           A: 5,
           R: 5,
           I : 2,
           K: 4,
           
           Step-1: We look at the value of T's hasmap. Then we assign the value we found as the key and find the new value. This process is 4 steps deep because,
           The number corresponding to "T" in the last 5 digits of the school number is 4.
           Other characters are made in this way and the last string is printed on the screen.
           
           In the algorithm, I did not include 0 and 1 in the loop, since the character itself will be equal to its own value if 0 comes in, and if it comes to 1, it will be equal to its own value. With Switch-Case structure
           I got the program to check.
           
           
             
             
      
