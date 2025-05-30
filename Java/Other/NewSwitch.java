public class NewSwitch {
    public static void method1 () {         // method 1
        int a = 6;
        switch(a) {
            case 1:System.out.println(a);
            break;
            case 2:System.out.println(a);
            break;
            case 3:System.out.println(a);
            break;
            case 4:System.out.println(a);
            break;
            case 5:System.out.println(a);
            break;
            default:System.out.println("nothing for a");
        }
    }
    public static void method2 () {         // method 2
        int b = 7;
        switch(b) {
            case 1 -> System.out.println(b);
            case 2 -> System.out.println(b);
            case 3 -> System.out.println(b);
            case 4 -> System.out.println(b);
            case 5 -> System.out.println(b);
            default -> System.out.println("nothing for b");
        }
    }
    public static void method3 () {         // method 3
        int c = 8;
        String result = switch(c) {
            case 1 -> "returning a string as 1";
            case 2 -> "returning a string as 2";
            case 3 -> "returning a string as 3";
            case 4 -> "returning a string as 4";
            case 5 -> "returning a string as 5";
            default -> "nothing for c";
        };
        System.out.println(result);
    }
    public static void method4 () {         // method 4
        int d = 9;
        String result = switch(d) {
            case 1 : yield "returning a string as 1";
            case 2 : yield "returning a string as 2";
            case 3 : yield "returning a string as 3";
            case 4 : yield "returning a string as 4";
            case 5 : yield "returning a string as 5";
            default : yield "nothing for d";
        };
        System.out.println(result);
    }
    public static void method5() {          // method 5
        int e = 9;
        String result = switch(e) {
            case 1 -> {
                System.out.println("Doing something for case 1");
                yield "returning a string as 1";
            }
            case 2 -> {
                System.out.println("Doing something for case 2");
                yield "returning a string as 2";
            }
            case 3 -> {
                System.out.println("Doing something for case 3");
                yield "returning a string as 3";
            }
            case 4 -> {
                System.out.println("Doing something for case 4");
                yield "returning a string as 4";
            }
            case 5 -> {
                System.out.println("Doing something for case 5");
                yield "returning a string as 5";
            }
            default -> {
                System.out.println("nothing for e");
                yield "yielding something for default in method 5";
            }
        };
        System.out.println("Returned: " + result);
    }
    public static void main(String[] args) {
        NewSwitch.method1();
        NewSwitch.method2();
        NewSwitch.method3();
        NewSwitch.method4();
        NewSwitch.method5();
    }
}