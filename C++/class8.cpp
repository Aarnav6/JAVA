# include <iostream>
using namespace std;
class Demo {
  
    int x,y;
  
    public:

    Demo() {
        x=0;
        y=0;
        cout<<"DC and value of x and y is " <<x<<" "<<y<<endl;
    }

    Demo (int a, int b) {
        x=a;
        y=b;
        cout<<"PC and value of x and y is " <<x<<" "<<y<<endl;
    }

    ~Demo() {
    cout<<"Destroyer and value of x and y is " <<x<<" "<<y<<endl;
    }

};

int main () {
    Demo d1,d2;
    Demo d3(1,1);
    Demo(3,9);

return 0;
}
// destructor only works from the last object since compiler fowllows the concept of stack 
// LIFO -->LAST IN FIRST OUT