import java.util.Scanner;

class Tower {
    private static int T1[]= {50,40,30,20,10};
    private static int T2[] = new int[5];
    private static int T3[] = new int[5];
    
    public static int[] Tower1() {
        return T1;
    }
    public static int[] Tower2() {
        return T2;
    }
    public static int[] Tower3() {
        return T3;
    }

}

class Tower_functions extends Tower {

    private static final Scanner sc = new Scanner(System.in);
    private static int Tower_Input;
    private static int Picked_Disk;
    private static int Disk_Input;

    public static void show() {

        for(int col=0 ; col<5 ; col++ ) {
                System.out.print(Tower1()[col]);
                System.out.print("           ");
                System.out.print(Tower2()[col]);
                System.out.print("           ");
                System.out.print(Tower3()[col]);
                System.out.println();
        }
    }

    public static void select() {
        System.out.println("select the tower among the three");
        Tower_Input = sc.nextInt();
        if (Tower_Input == 1 || Tower_Input == 2 || Tower_Input == 3) {
            //does nothing its valid input
        }
        else {
            System.out.println("wrong input");
            throw new IllegalArgumentException("Error: Something went wrong!");
        }
        System.out.println("enter the Disk no.");
        Disk_Input = sc.nextInt();
        if (Disk_Input>=0 && Disk_Input<=5) {
            //does nothing its valid input
        }
        else {
            System.out.println("wrong input");
            throw new IllegalArgumentException("Error: Something went wrong!");
        }
    }

    public static void  Picked_Disk() {
        switch (Tower_Input) {
            case 1 -> {
                switch (Disk_Input){
                    case 1 -> {
                        System.out.println(Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower1()[Disk_Input - 1];
                    }
                    case 2 -> {
                        System.out.println(Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower1()[Disk_Input - 1];
                    }
                    case 3 -> {
                        System.out.println(Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower1()[Disk_Input - 1];
                    }
                    case 4 -> {
                        System.out.println(Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower1()[Disk_Input - 1];
                    }
                    case 5 -> {
                        System.out.println(Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower1()[Disk_Input - 1];
                    }
                    default -> System.out.println("wrong input");
                }
            }
            case 2 -> {
                switch (Disk_Input){
                    case 1 -> {
                        System.out.println(Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower2()[Disk_Input - 1];
                    }
                    case 2 -> {
                        System.out.println(Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower2()[Disk_Input - 1];
                    }
                    case 3 -> {
                        System.out.println(Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower2()[Disk_Input - 1];
                    }
                    case 4 -> {
                        System.out.println(Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower2()[Disk_Input - 1];
                    }
                    case 5 -> {
                        System.out.println(Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower2()[Disk_Input - 1];
                    }
                    default -> System.out.println("wrong input");
                }
            }
            case 3 -> {
                switch (Disk_Input) {
                    case 1 -> {
                        System.out.println(Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower3()[Disk_Input - 1];
                    }
                    case 2 -> {
                        System.out.println(Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower3()[Disk_Input - 1];
                    }
                    case 3 -> {
                        System.out.println(Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower3()[Disk_Input - 1];
                    }
                    case 4 -> {
                        System.out.println(Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower3()[Disk_Input - 1];
                    }
                    case 5 -> {
                        System.out.println(Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
                        Picked_Disk = Tower3()[Disk_Input - 1];
                    }
                    default -> System.out.println("wrong input");
                }
            }
            default -> System.out.println("cant locate your tower input sorry try again later!");
        }

        if(Picked_Disk == 999) {
            throw new IllegalArgumentException("Error: Something went wrong!");
        }
    }

    public static void put() {

        switch (Tower_Input) {
            case 1 -> Tower1()[Disk_Input-1] = Picked_Disk;
            case 2 -> Tower2()[Disk_Input-1] = Picked_Disk;
            case 3 -> Tower3()[Disk_Input-1] = Picked_Disk;
        }
    }
}
class Execution extends Tower_functions {

    public static void execute () {

        Tower_functions.show(); // this works
        Tower_functions.select(); // this works
        Tower_functions.Picked_Disk(); // this works
        Tower_functions.select(); // this works
        Tower_functions.put(); // this works
        Tower_functions.show(); // this works



        // show(); // this also works
        // select(); // this also works
        // Picked_Disk(); // this also works


        // create a class object then use classobject.show(); this also works
        // create a class object then use classobject.select(); this also works
        // create a class object then use classobject.Picked_Disk(); this also works
    }
}

class Tower_of_hanoi extends Execution {

    public static void main (String args [])
    {
        Tower_of_hanoi.execute();
    }
}
