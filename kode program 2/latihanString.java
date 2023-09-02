import java.util.Scanner;

public class latihanString {
    public static void main(String[] args) {
         Scanner inputKata = new Scanner(System.in);
        
        System.out.println("Msukan kata pertama:");
        String myString = inputKata.nextLine();
        
        System.out.println("Masukan kata kedua:"); 
        String myString2 = inputKata.nextLine();   
   
        int panjangKata = myString.length();
        int panjangKata2 = myString2.length();
        int totalpanjang = panjangKata + panjangKata2;
        
        int perbandingan = myString.compareTo(myString2);
        String hasilbanding = (perbandingan>0) ? "No" : "Ypppppes";
       
        System.out.println("panjang:" +totalpanjang);
        System.out.println("kalimat:" +myString+myString2); 
        System.out.println("banding:" +hasilbanding); 
    }
}
 