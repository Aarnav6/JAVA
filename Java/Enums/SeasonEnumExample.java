enum Seasons {
    WINTER("Hemant Ritu", "5°C - 20°C 🌡️"),
    SPRING("Vasant Ritu", "15°C - 25°C 🌡️"),
    SUMMER("Grishma Ritu", "30°C - 45°C 🌡️"),
    MONSOON("Varsha Ritu", "25°C - 35°C 🌡️"),
    AUTUMN("Sharad Ritu", "20°C - 30°C 🌡️");
    
    final private String avgTemprature;
    final private String traditionalName;    

    private Seasons (String traditionalName , String avgTemprature) {
        this.traditionalName = traditionalName;
        this.avgTemprature = avgTemprature;
    }

    public String getTraditionalName() {
        return "Traditional Name In India : " + traditionalName;
    }
    public String getAvgTemprature() {
        return "Average Temprature In India: " + avgTemprature;
    }
}
public class SeasonEnumExample {

    public static void main(String[] args) {
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
            System.out.println(s.getTraditionalName());
            System.out.println(s.getAvgTemprature());
            System.out.println("----------------------------------------");

        }
    }
}
/*
notes-
    Every enum in Java automatically has a public static method called values() 
    that returns an array of all enum constants in the order they're declared,
    an for each loop can be used to iterate over the array given by .values() in an array
    u can also use name() method in enum to get the name of fields


        Java Enum Key Points:- 


        values() method
        Returns all enum constants in declared order as an array.
        enum Day { MONDAY, TUESDAY, WEDNESDAY }
        Day[] days = Day.values();


        Iterate using for-each
        Loop over all enum constants.
        for (Day d : Day.values()) {
            System.out.println(d);
        }


        name() method
        Returns the enum constant’s name as a String.
        System.out.println(Day.MONDAY.name());  // prints "MONDAY"

        
        Understanding ordinal() in Java Enums
        ordinal() is a method that returns the position of an enum constant based on its order in the enum declaration.
        The first enum constant has ordinal 0, the second has ordinal 1, and so on.
        For example, imagine an enum called Season with these constants declared in this order:
        WINTER (ordinal 0), SUMMER (ordinal 1), MONSOON (ordinal 2), SPRING (ordinal 3).
        If you call ordinal() on WINTER, you get 0; on SUMMER, you get 1; and so on.
        In practice, if you loop through all the Season constants and print their name and ordinal value, you will get:

        WINTER is at position 0
        SPRING is at position 1
        SUMMER is at position 2
        MONSOON is at position 3
        AUTMUN is at position 4
        
        Seasons s = Seasons.AUTUMN;
        for(int i=0 ; i<s.ordinal() ; i++) {
            System.out.println(i);
        }
        Important: The ordinal values depend strictly on the order of the constants. If you change the order in the enum, ordinal values will change as well        .

        Therefore, avoid using ordinal values in important logic or storage because it can lead to bugs if the enum order changes.
        Instead, use explicit fields (like an ID or code) inside the enum if you need stable values
*/
