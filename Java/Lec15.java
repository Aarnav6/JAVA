import java.util.Scanner;

class bit_functions {

    public static int bitRequried (int number) {
        int bits=0;
        while (number!=0) {
            bits++;
            number >>=1; // means: number = number << 1;
        }
        return bits;
    }


    public static int getBit (int number , int bitPosition) {
        int bitmask = 1 << bitPosition;
        int result = bitmask & number;
        if (result == 0) {
            return 0;
        } 
        else {
            return 1;
        }
    }


    public static int binaryConvert (int number) {
        int result=1;
        int required_bits_index;
        required_bits_index = bit_functions.bitRequried(number)-1;
        for (int i=required_bits_index ; i>=0 ; i--) {
            System.out.print(bit_functions.getBit(number, i));
        }
        return result;
    }
}

class Lec15 extends bit_functions{
        
    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        bit_functions.binaryConvert(num);
    }
}