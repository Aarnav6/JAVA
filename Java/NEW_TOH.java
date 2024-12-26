// lets go new begning of tower of hanoi game

import java.util.Scanner;
class Tower {
    private int Tow1[] = {10,20,30,40,50};
    private int Tow2[] = {0 ,0 ,0 ,0 ,0};
    private int Tow3[] = {0 ,0 ,0 ,0 ,0};
    int Element ,ElementNo ,TowerNo ,Disk;
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
        TowerNo = sc.nextInt();
        if(TowerNo != 1 || TowerNo != 1 || TowerNo != 1) {
            throw new RuntimeException("Not Valid Input");
        }
        System.out.println("Element no: ");
        ElementNo = sc.nextInt();
        switch(TowerNo-1) {
            case 0-> {
                Disk = Tow1[ElementNo];
                System.out.println("picked the: " + Tow1[Disk]+" Disk");
            }
            case 1 -> {
                System.out.println("picked the: " + Tow2[Disk]+" Disk");
                Disk = Tow2[ElementNo];
            }
            case 2 -> {
                System.out.println("picked the: " + Tow3[Disk]+" Disk");
                Disk = Tow3[ElementNo];
            }
        }
    }
}