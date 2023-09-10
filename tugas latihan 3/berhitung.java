import java.util.Scanner;

public class berhitung {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);   
        System.out.println("Masukkan perhitungan:");
        String i = angka.nextLine();  
        String[] token = i.split(" ");
        // inputan yang di masukan akan menjadi token yang terdiri dari angka 1, angka 2, opp
        
        double angka1, angka2;
        try{
            angka1 = Double.parseDouble(token[0]);
            angka2 = Double.parseDouble(token[2]);
            // mengubah string menjadi double
        } catch (NumberFormatException e){
            //menangkap apakah angka atau tidak
            System.out.println ("Inputan tidak valid, harus dengan nagka");
            angka.close();
            return;
        }

        String opp = token[1];
        double hasil = 0;
        switch (opp) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            case "%":
                hasil = angka1 %  angka2;
                break;     
            default:
                System.out.println("operasi tidak valid");
                angka.close();
                break;
        }
        System.out.println("hasilnya =" +hasil);
    }
}
