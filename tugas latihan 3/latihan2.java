import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kataArray = new String[3];
        int[] angkaArray = new int[3];
        
        // pengulangan 3 kali karna diperintah disuruh memasukan sebanyak 3 kali
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan kata (maksimum 10 karakter):");
            String kata = input.next();
            // menyimpan inputan user

            if(kata.length() >10){
                // memeriksa batasan apakah lebih dari 10
                System.out.println("Kata yang anda masukan melebihi batas maksimum. Masukan kata kembali");
                kata = input.next();
                // memasukan kata kembali jika yang sebelumnya terlalu panjang
            }

            System.out.println("Masukkan angka (tiga digit):");
            int angka = input.nextInt();
            
            kataArray[i] = kata;
            angkaArray[i] = angka;

        }
        System.out.println("================================");
        for(int i=0; i< 3; i++){
            // nampilin ke layar tiga kali
            System.out.printf("%-10s%03d%n", kataArray[i], angkaArray[i]); 
            // menncetak bahwa angka harus 3 digit dan kalimat maks 10 kata
        }
        System.out.println("================================");

        input.close();
    }
}