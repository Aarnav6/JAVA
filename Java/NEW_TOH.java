// lets go new begning of tower of hanoi game

import java.util.Scanner;
class Tower {
    private int Tow1[] = {10,20,30,40,50};
    private int Tow2[] = {0 ,0 ,0 ,0 ,0};
    private int Tow3[] = {0 ,0 ,0 ,0 ,0};
    int disk;
    Scanner sc = new Scanner(System.in);

    public void Show() {
        for (int i=0 ; i<5 ; i++) {
            System.out.println(Tow1[i]);
            System.out.println("\n\n\n");
            System.out.println(Tow2[i]);
            System.out.println("\n\n\n");
            System.out.println(Tow3[i]);
        }
    }
    public void SelectForPick() {
        System.out.println("Tower no: ");
        int TowerNo = sc.nextInt();
        System.out.println("Element no: ");
        int ElementNo = sc.nextInt();
        switch(TowerNo-1) {
            case 0-> {
                disk = 0;
                System.out.println("picked the: " + Tow1[disk]+" Disk");
            }
            case 1 -> {
                disk = 1;
                System.out.println("picked the: " + Tow2[disk]+" Disk");
            }
            case 2 -> {
                disk = 2;
                System.out.println("picked the: " + Tow3[disk]+" Disk");
            }
        }
    }
}