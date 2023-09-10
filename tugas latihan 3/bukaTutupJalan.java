import java.util.Scanner;

public class bukaTutupJalan {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan plat nomor. Maks 4 mobil =");
        String plat = input.nextLine();
        String[] token = plat.split(" ");

        if ( token.length > 4){
            System.out.println("Maaf jumlah plat yang anda masukan sudah melebihi batas maksimal");
            input.close();
            return;
        }
        for (int i =0; i < token.length; i++){
            if (token[i].length() < 4 || token[i].length() > 4){
                System.out.println("inputan tidak valid, inputan untuk satu mobil hanya 4 digit");
                input.close();
                return;       
            }
        }

        int angka1 = Integer.parseInt(token [0]);
        int angka2 = Integer.parseInt(token [1]);
        int angka3 = Integer.parseInt(token [2]);
        int angka4 = Integer.parseInt(token [3]);
        // mengubah sting menjadi integer

        double totalGabungan = angka1 + angka2 + angka3 + angka4;
        double jalan = (totalGabungan - 999999) % 5;
     
        if (jalan == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }

        input.close();
    }
}