//Adım1=Başla
//Adım2=Klavyeden üçgene ait üç kenar giriniz
//Adım3=Eğer 1.kenar=2.kenar=3.kenar ise "eşkenar" yaz
//Adım4=Eğer 1.kenar=2.kenar veya 1.kenar=3.kenar veya 2.kenar=3.kenar ise "ikizkenar" yaz
//Adım5=Aksi takdirde "çeşitkenar"yaz
//Adım6=Bitir
    import java.util.Scanner;

public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner (System .in);
                System.out.println("Üçgenin 1.kenarını giriniz:");
                int a =input.nextInt();
                System.out.println("Üçgenin 2.kenarını giriniz:");
                int b=input.nextInt();
                System.out.println("Üçgenin 3.kenarını giriniz:");
                int c=input.nextInt();
                if(a==b && a==c){
                    System.out.println("eşkenar");
                    
                }  
                else if (a==b || b==c || a==c) {
                    System.out.println("ikizkenar");
                }
                else{
                    System.out.println("çeşitkenar");
                } 
                }

    }
    

