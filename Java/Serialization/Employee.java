// this is class employee accessed in the same package
// employee object will trhow error while serialization if not implements Serializable(interface)
public class Employee implements java.io.Serializable {
    final private int id;
    final private String name;
    transient final private String password; // left out of seriliazation due to transient keyword

    protected int getId() { return this.id; }
    protected String getName() { return this.name; }
    protected String getPassword() {return password; }

    @SuppressWarnings("unused")
    Employee (int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString(){
        return String.format("id = %d \nname = %s \npassword = %s",this.id,this.name,this.password);
    }
}