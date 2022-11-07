//Adım1=Başla
//Adım2=klavyeden bir n sayisi al
//Adım3=toplam=0 ve S=1
//Adım4=Eğer S>N ise git Adım 8
//Adım5=Eğer S%2!=0 ise Toplam=Toplam+S;
//Adım6=S=S+1
//Adım7=Git Adım 4
//Adım 8=Toplam yazdır
//Adı9=Bitir


    import java.util.Scanner;

public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        Scanner input = new Scanner (System .in);
                        System.out.println("Bir n sayısı giriniz:");
                        int n=input.nextInt();
                        int toplam=0;
                        int S=1;
                        while ( S<=n)
                        {
                              if(S%2!=0)
                              {
                              toplam=toplam+S ;
                              }
                                  S=S+1;
                        }                  
                            System.out.println("toplam:"+toplam);
                        }


    }
    

