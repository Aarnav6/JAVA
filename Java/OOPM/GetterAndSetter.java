// class GetterAndSetter {
//     private int x;

//     public int GetX() {
//         return x;
//     }
//     public void SetX(int in) {
//         this.x = in;
//     }
// }
// class run {
// /*
//         we cant directly acess the data members of the class through the object of class from outside the class
//         due to private acess modifiers so,
//         we acess them through the getter and setter function
// */
//         public static void main(String[] args) {
//         GetterAndSetter ob = new GetterAndSetter();
//         // ob.x = 5; // throws an error due to the private acess specifier
//         System.out.println(ob.GetX());
        
//     }
// }



// /*
// class a {
//     private int x; // gives an error     
// }

// class GetterAndSetter {
//     public static void main(String[] args) {
//         a ob = new a();
//         ob.x = 5; // ❌ This will now give error!
//         System.out.println(ob.x);
//     }
// }
// */
