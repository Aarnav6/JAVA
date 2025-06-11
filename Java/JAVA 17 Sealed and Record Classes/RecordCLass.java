record human (String eyeColor , String skinColor , String hairColor , int weight , int height) {}

public class RecordCLass { 
    public static void main(String[] args) {
        human anvesh = new human("blue", "fair", "blonde", 60, 140);
        System.out.println(anvesh);
        System.out.println(anvesh.eyeColor());
    }
}
/*
 * Important Notes :- 
 * record are classes that are used to create data
 * it has by default parametrized costructor to intialize values 
 * it has by default overloaded toString method
 * it has by default overloaded equals method
 * the fields inside the records are private and final this makes the data imuatable
 * you can create static variable and methods to if you want
 * instance variable can not be created inside the class, you can only do that in parameters of record 
 * to acess any of its method you can call directly object.variableName
 * this saves multiple line of code to prevent overloading and assigning fields and constructors code manualy
 */