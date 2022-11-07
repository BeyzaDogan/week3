//Adım1=Başla
//Adım2=Klavyeden bir 1 ile 7 arası sayi al
//Adım3=Eğer sayi=1 ise "pazartesi" yaz
//Adım4=Eğer sayi =2 ise "salı" yaz
//Adım4=Eğer sayi =3 ise "çarşamba" yaz
//Adım4=Eğer sayi=4 ise "perşembe" yaz
//Adım5="Eğer sayi =5 ise "cuma" yaz
//Adım6=Eğer sayi=6 ise "cumartesi" yaz
//Adım7=Eğer sayi=7 ise "pazar" yaz
//Adım8=Bitir
    import java.util.Scanner;


public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System .in);
        System.out.println("1 ile 7 arasında sayı giriniz:");
        int a =input.nextInt();
        
        if (a==1){
            System.out.println(a+"pazartesi");
           
        }
        else if (a==2) {
            System.out.println(a+"salı");
        }
        else if (a==3) {
                System.out.println(a+"çarşamba");

    }
        else if(a==4){
             System.out.println(a+"perşembe");
        }
        else if(a==5){
             System.out.println(a+"cuma");
        }
        else if (a==6){
            System.out.println(a+"cumartesi");
        }
        else if (a==7) {
            System.out.println(a+"pazar");
        }
    }
}
            
        
