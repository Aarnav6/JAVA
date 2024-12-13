class Employee {
    final private String Employee_Name = "Devanshu";
    private final double Employee_Salary = 100;
    public void Employee_Details() {
        System.out.println("Employee Name: " + Employee_Name + "\n" + "Employee_Salary: "+ Employee_Salary);
    }
}
class Manager extends Employee{
    final private String Manager_Name = "Mr.Aarnav";
    private final double Manager_Salary = 1000;
    public void Manager_Details () {
        System.out.println("Manager Name: " + Manager_Name + "\n" + "Manager_Salary: "+ Manager_Salary);
    }
}
class CEO extends Manager {
    final private String CEO_Name = "Mr.Anvesh";
    private final double CEO_Salary = 10000;
    public void CEO_Details () {
        System.out.println("CEO Name: " + CEO_Name + "\n" + "CEO_Salary: "+ CEO_Salary);
    }
}
class Company extends CEO{
    final private String Company_Name = "Yamaha";
    final private String Company_Code = "Xf450";
    private final double Company_Balance = 100000;
    public void Company_Details () {
        System.out.println("Company Name: " + Company_Name + "\n" + "Company Code: "+ Company_Code + "\n" + "Company Balance: " + Company_Balance);
    }
    public static void main(String[] args) {
        //creating object of Company 
        Company call = new Company();

        System.out.println("Company Details: ");
        call.Company_Details();
        System.out.println("\n \n");

        System.out.println("CEO Details: ");
        call.CEO_Details();
        System.out.println("\n \n");

        System.out.println("Manager Details: ");
        call.Manager_Details();
        System.out.println("\n \n");

        System.out.println("Employee Details: ");
        call.Employee_Details();
        System.out.println("\n \n");
    }
}