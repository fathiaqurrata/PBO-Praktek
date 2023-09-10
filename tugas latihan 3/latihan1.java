import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner inputKalimat = new Scanner(System.in);
        System.out.println("Masukkan kalimat:");
        String s = inputKalimat.nextLine();

        String[] tokens = s.split("[\\s!,?._'@]+");
        int jumlahToken = tokens.length;

        for (String token : tokens) {
            System.out.println(token);
        }

        System.out.println("Jumlah token = " + jumlahToken);

        inputKalimat.close();
    }
}
