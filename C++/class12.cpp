#include <iostream>
using namespace std;

class complex {
    int x;
    public:
    complex () {
        cout<<"enter a number: ";
        cin>>x;
    }
    int getvalue() {
        return x;
    }
    friend int operator > (complex , complex);  
};
    int operator > (complex C , complex D) {
        return (C.x > D.x) ? 1 : 0;
    }
int main () {
    complex c1; complex c2;
    if(c1 > c2) {
        cout<<c1.getvalue()<<" is bigger";
    }
    else {
        cout<<c2.getvalue()<<" is bigger";
    }
    return 0;
}