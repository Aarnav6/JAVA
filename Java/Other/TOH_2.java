// // lets go new begning of tower of hanoi game

// import java.util.Scanner;

// class Tower {
//     private int Tow1[] = { 10, 20, 30, 40, 50 };
//     private int Tow2[] = { 0, 0, 0, 0, 0 };
//     private int Tow3[] = { 0, 0, 0, 0, 0 };
//     int TowerPick, DiskPick, TowerPut, DiskPut;
//     Scanner sc = new Scanner(System.in);

//     public void Show() {
//         for (int i = 0; i < 5; i++) {
//             System.out.print(Tow1[i]);
//             System.out.print("\t");
//             System.out.print(Tow2[i]);
//             System.out.print("\t");
//             System.out.print(Tow3[i]);
//             System.out.print("\n");
//         }
//     }

//     public void Pick() {
//         System.out.print("enter tower no to pick disk: ");
//         TowerPick = sc.nextInt();
//         if (TowerPick != 1 && TowerPick != 2 && TowerPick != 3) {
//             throw new RuntimeException("\n Tower doesnt exist");
//         }
//         System.out.print("Disk no: ");
//         DiskPick = sc.nextInt();
//         if (DiskPick != 1 && DiskPick != 2 && DiskPick != 3 && DiskPick != 4 && DiskPick != 5) {
//             throw new RuntimeException("\nDisk doesnt exist");
//         }
//         DiskPick--;
//         switch (TowerPick) {
//             case 1 -> System.out.println("picked the disk of weight: " + Tow1[DiskPick] + " Disk");
//             case 2 -> System.out.println("picked the disk of weight: " + Tow2[DiskPick] + " Disk");
//             case 3 -> System.out.println("picked the disk of weight: " + Tow3[DiskPick] + " Disk");
//             default -> throw new RuntimeException("error ocurred tempReturn is -999");
//         }
//         System.out.print("enter tower no to put disk: ");
//         TowerPut = sc.nextInt();
//         if (TowerPut != 1 && TowerPut != 2 && TowerPut != 3) {
//             throw new RuntimeException("\n Tower doesnt exist");
//         }
//         System.out.print("Disk no: ");
//         DiskPut = sc.nextInt();
//         if (DiskPut != 1 && DiskPut != 2 && DiskPut != 3 && DiskPut != 4 && DiskPut != 5) {
//             throw new RuntimeException("\nDisk doesnt exist");
//         }
//         DiskPut--;
//     }

//     public void Put() {
//         int tempHolder;
//         int val;
//         switch (TowerPick) {
//             case 1 -> val = Tow1[DiskPick];
//             case 2 -> val = Tow2[DiskPick];
//             case 3 -> val = Tow3[DiskPick];
//             default -> {
//                 val = -999;
//                 System.out.println("error occurred val = -999");
//             }
//         }
//         switch (TowerPut) {
//             case 1 -> {
//                 tempHolder = Tow1[DiskPut];
//                 Tow1[DiskPut] = val;
//             }
//             case 2 -> {
//                 tempHolder = Tow2[DiskPut];
//                 Tow2[DiskPut] = val;
//             }
//             case 3 -> {
//                 tempHolder = Tow3[DiskPut];
//                 Tow3[DiskPut] = val;
//             }
//             default -> {
//                 tempHolder = -999;
//                 System.out.println("error occurred tempHolder = -999");
//             }
//         }
//         switch (TowerPick) {
//             case 1 -> Tow1[DiskPick] = tempHolder;
//             case 2 -> Tow2[DiskPick] = tempHolder;
//             case 3 -> Tow3[DiskPick] = tempHolder;
//             default -> System.out.println("error occurred");
//         }
//     }
// }

// class TOH_2 {
//     public static void main(String args[]) {
//         Tower run = new Tower();
//         run.Show();
//         run.Pick();
//         run.Put();
//         run.Show();
//     }
// }
