class bit_functions {

    public static int bitRequried (int number) {
        int bits=0;
        while (number!=0) {
            bits++;
            number >>=1; // means: number = number << 1;
        }
        return bits;
    }

    public static void binaryConvert (int number) {
        int required_bits_index;
        required_bits_index = bitRequried(number)-1;
        if(required_bits_index < 4) {
            for (int i=3 ; i>=0 ; i--) {
                System.out.print(getBit(number, i));
            }
        }
        else {
            for (int i=required_bits_index ; i>=0 ; i--) {
            System.out.print(getBit(number, i));
            }
        }
        System.out.println();
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

    public static int setBit (int number , int bitPosition) {
        int bitmask = 1 << bitPosition;
        int result = bitmask | number;
        return result;
    }


    public static int clearBit (int number , int bitPosition) {
        int bitmask = 1 << bitPosition;
        int result = (~bitmask) & number;
        return result;
    }


    public static int UpdateBit (int number , int bitPosition ,int bitType) {

        int result = 9999;
        switch (bitType) {
            case 0 -> {
            int bitmask = 1 << bitPosition;
            result = (~bitmask) & number;
            }
            case 1 -> {
                int bitmask = 1 << bitPosition;
                result = bitmask | number;
            }
            default->{
                System.out.println("please enter a valid bit Type");
                throw new IllegalArgumentException("yo yo yo wait bro enter correct bit only 0 or 1 ");
            }
        }
        return result;
    }
    
}

class Lec15 extends bit_functions{

    public static void main (String args[]) {


        System.out.print("5 in binary is: ");
        Lec15.binaryConvert(5);

        System.out.println("\n\nbit on the 1st position is: " + Lec15.getBit(5,1));

        System.out.print("\n\nusing setBit(5,1): ");
        Lec15.binaryConvert(Lec15.setBit(5,1));

        System.out.print("\n\nusing clearBit(5,2): ");
        Lec15.binaryConvert(Lec15.clearBit(5,2));

        System.out.print("\n\nusing UpdateBit(5,3,1): ");
        Lec15.binaryConvert(Lec15.UpdateBit(5,3,1));

    }
}