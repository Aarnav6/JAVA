import java.util.Scanner;

    class details
    {
        
        String name;
        int rollno;
        String section;

    }

    class get extends details{

        Scanner sc = new Scanner(System.in);
        
        void GetDetails()
        {
            System.out.println("enter the name of student");
            name = sc.nextLine();

            System.out.println("enter the roll no. of student");
            rollno = sc.nextInt();
        
            sc.nextLine();

            System.out.println("enter the section");
            section = sc.nextLine();
        }
    }
    
    class show extends get {
    
        void ShowDetails()
        {
            System.out.println("the name of student " + name);

            System.out.println("the roll no of student " + rollno);
        
            System.out.println("the section of student " + section);
        }   
    
    }

    class student extends show{

        public static void main (String args [])
        {
            student s1 = new student();
            s1.GetDetails();
            s1.ShowDetails();
        }
    }

    

