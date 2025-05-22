// Interface for GPS functionality
interface GPS {
    void locate();
}

// Interface for Camera functionality
interface Camera {
    void clickPhoto();
    void recordVideo();
}

// Interface for Network functionality
interface Network {
    void connectToInternet();
    void makeCall(String number);
}

// MySmartPhone implements all three interfaces
class MySmartPhone implements GPS, Camera, Network {

    // GPS method implementation
    @Override
    public void locate() {
        System.out.println("Locating using GPS...");
    }

    // Camera methods implementation
    @Override
    public void clickPhoto() {
        System.out.println("Clicking photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    // Network methods implementation
    @Override
    public void connectToInternet() {
        System.out.println("Connecting to the Internet...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }
}

public class InterfacePolymorphismDemo {
    public static void main(String[] args) {

        // You own the phone object2
        MySmartPhone myPhone = new MySmartPhone();

        // You can use all features because you have the actual phone reference
        myPhone.locate();             // GPS feature
        myPhone.clickPhoto();         // Camera feature
        myPhone.connectToInternet();  // Network feature

        System.out.println("\n--- Giving phone to friend with Camera access ONLY ---");

        // Now, you give your friend the phone but only as a Camera interface
        // Your friend can ONLY use Camera features, not GPS or Network

        Camera friendPhone = myPhone; //similar to Camera friendPhone = new MySmartPhone(); but shouldnt be used here explaned at last of code in notes section

        friendPhone.clickPhoto();
        friendPhone.recordVideo();

        // The following lines would cause compile-time errors because
        // friendPhone is of type Camera and cannot access GPS or Network methods:
        //
        // friendPhone.locate();             // ERROR
        // friendPhone.connectToInternet();  // ERROR
        // friendPhone.makeCall("123456789"); // ERROR

        System.out.println("\n--- Giving phone to colleague with Network access ONLY ---");

        // Another example: colleague gets phone only as Network interface
        Network colleaguePhone = myPhone; //simmillar to Network colleaguePhone = new MySmartPhone(); but shouldnt be used here explaned at last of code in notes section

        colleaguePhone.connectToInternet();
        colleaguePhone.makeCall("987654321");

        // The following lines would cause compile-time errors because
        // colleaguePhone cannot access GPS or Camera methods:
        //
        // colleaguePhone.locate();      // ERROR
        // colleaguePhone.clickPhoto();  // ERROR
    }
}
/*
    
1. Network colleaguePhone = myPhone;
Here, you are assigning an existing object (myPhone) to a new reference of type Network.
Both colleaguePhone and myPhone refer to the same single object in memory.
Any changes via either reference affect the same underlying object.
This is efficient, no new object is created.
This is useful when you want to restrict access to an existing object.

2. Network colleaguePhone = new MySmartPhone();
Here, you are creating a brand new MySmartPhone object.
colleaguePhone refers to this new object, which is different from myPhone.
Changes to colleaguePhone affect this new object, not the original myPhone.
This uses more memory (because you create a new object).
Useful if you want to give a new, independent phone object to your colleague.

Which is better?
If you want to restrict access to your existing phone object, use the first (colleaguePhone = myPhone;).
You don't create extra objects unnecessarily.
The interface reference type controls what methods are accessible.
If you want to give your colleague a new phone (a separate object), use the second (new MySmartPhone()).
This is a new independent instance with its own state.
But interface polymorphism still applies for restricting methods.

how it affects refrence and memory through code example :- 
interface Camera {
    void clickPhoto();
    int getPhotoCount();
}

class MySmartPhone implements Camera {
    private int photoCount = 0;

    public void clickPhoto() {
        photoCount++;
    }

    public int getPhotoCount() {
        return photoCount;
    }
}

public class Main {
    public static void main(String[] args) {
        MySmartPhone myPhone = new MySmartPhone();

        // Friend can only access Camera functions (restricted via interface)
        Camera friendPhone1 = myPhone; // SAME object

        friendPhone1.clickPhoto();
        friendPhone1.clickPhoto();
        
        System.out.println("when using this line Camera friendPhone1 = myPhone");
        System.out.println("Photos via friendPhone1: " + friendPhone1.getPhotoCount()); // Output: 2
        System.out.println("Photos via myPhone: " + myPhone.getPhotoCount()); // Output: 2
        
        // Create NEW phone for another person
        Camera friendPhone2 = new MySmartPhone(); // NEW object
        friendPhone2.clickPhoto();
        
        System.out.println("when using this line Camera friendPhone2 = new MySmartPhone()");
        System.out.println("Photos via friendPhone2: " + friendPhone2.getPhotoCount()); // Output: 1
        System.out.println("Photos via myPhone: " + myPhone.getPhotoCount());   // Still 2
    }
}

*/