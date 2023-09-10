import java.util.Scanner;

public class gajiAgent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total penjualan barang:");
        int barang = input.nextInt();

        int gaji = 500000;
        double bonus = 0;
        double denda = 0;
        // bonus dan denda harus di deklar 0, kl ngk eror trs

        if (barang >= 80 ){
            bonus = 0.35 * barang * 50000;
            //35 %
        }
        else if (barang >= 40 && barang <80){
            bonus = 0.25 * barang * 50000;
            // 25%
        }
        else if ( barang >= 15 && barang <40){
            bonus = 0.10 * barang * 50000;
            // 10 %
        }
        else if (barang <= 15){
            denda = 0.15 * (15 - barang) *50000;
            // kurang dari 15
            gaji -= denda;
        }

        double totalGaji = gaji + bonus;

        System.out.println("Gaji yang anda dapatkan adalah =" + totalGaji);        
      
        input.close();                                                                                      

    }                          
}
