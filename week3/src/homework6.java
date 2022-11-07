//Adım1=Başla
//Adım2=klavyeden 1.sayıyı al ve oku
//Adım3=klavyeden 2.sayıyı al ve oku
//Adım4=carpim=0
//Adım5=S=0
//Adım6=

import java.util.Scanner;

public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System .in);
      System.out.println("1.pozitif sayıyı giriniz:");
      int x=input.nextInt();
      System.out.println("2.pozitif sayıyı girniz:");
      int y=input.nextInt();
      
      
      int S=0;
      int carpim=0;
      while(S<y){
          S=S+1;
          carpim=carpim+x;
      }
      System.out.println("iki sayının çarpımı:"+carpim);
      
      }

      

    }
    

