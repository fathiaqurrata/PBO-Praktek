import java.math.BigInteger;
import java.util.Scanner;

public class bigNumber {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan angka pertama =");
        String pertama = input.next();
        System.out.println("Masukan angka kedua =");
        String kedua = input.next();

        BigInteger angka1 = new BigInteger(pertama);
        BigInteger angka2 = new BigInteger(kedua);

        if ( angka1.compareTo(BigInteger.ZERO) <0 || angka2.compareTo(BigInteger.ZERO) <0){
            System.out.println("Tidak bisa memasukan angka negatif. angka harus bernilai positif");
            input.close();
            return;
        }

        if (pertama.length() > 200 || kedua.length() > 200){
            System.out.println("Tidak valid. maksimal hanya 200 digit");
            input.close();
            return;           
        }

        BigInteger pertambahan = angka1.add (angka2);
        BigInteger perkalian = angka1.multiply (angka2);

        System.out.println("Hasil penjumlahanya =" + pertambahan);
        System.out.println("Hasil perkalian =" +perkalian);


        input.close();
    }

}
