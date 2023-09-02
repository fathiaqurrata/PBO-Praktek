public class DataType{
    public static void main(String[] args){
        int maxCoba = 10;

        String[] data = {
            "5", "-150", "150000", "1500000000", "213333333333333333333333333333333333", "-100000000000000", "A", "hELOW", "A9"
        };

        for ( int i = 0; i <maxCoba; i++) {
            String input = data[i];

            try {
                long n = Long.parseLong(input);

                System.out.println(input + " termasuk :");
                if ( n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE){
                    System.out.println("byte");
                }
                if ( n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                    System.out.println("short");
                }
                if ( n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE){
                    System.out.println("integer");
                }
                if ( n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
                    System.out.println("long");
                }
            } catch (NumberFormatException e){
                System.out.println(input + " Bukan termaksud tipe data byte, short, int, dan long");
            }
        }
    }
}