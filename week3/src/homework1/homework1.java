

//Adım1=Başla
//Adım2=Klavyeden bir sayı al
//Adım3=Eğer sayi>0 ise "pozitif"yaz,sayi<0 ise "negatif" yaz
//Adım3=Aksi takdirde sayı "0" yaz
//Adım4=Bitir
import java.util.Scanner;

public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System .in);
       System.out.println("Bir adet sayı giriniz:");
       int a=input.nextInt();
       
       if (a>0) {
            System.out.println(a+"pozitif");
      } 

       else if(a<0) {
           System.out.println(a+"negatif");
       }
       else {
           System.out.println("0");
       }
    }
       
    
}
