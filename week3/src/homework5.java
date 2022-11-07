//Adım1=Başla
//Adım2=Klavyeden bir sayı(n) al
//Adım3=toplam=0
//Adım4=eğer i>n ise git adım8
//Adım5=toplam=(i*i)+toplam
//Adım6=i++
//Adım7=git adım4
//Adım8=toplam yazdır
//Adım9=bitir


import java.util.Scanner;

public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner (System .in);
          System.out.println("Seçtiğiniz sayıyı giriniz:");
          int n=input.nextInt();
          int toplam=0;
         
         
          for(int i=0;i<=n;i++){
              toplam=(i*i)+toplam;
         
         
          } 
          System.out.println("karelerinin toplamı:"+toplam);          
                     
                     
          }
          
                     
              

    }
    

