# include <iostream>
using namespace std;
class swapper {
    private:
    int x; int y;
    public:
    void swapping () {
        swapper temp;
        cout<<"enter value of x: ";
        cin>>x;
        cout<<"enter value of y: ";
        cin>>y;t 
        temp.x = x;
        x=y;
        y=temp.x;
        cout<<"the value of x: "<<x;
        cout<<endl;
        cout<<"the value of y: "<<y;
    }
};
    int main() {
        swapper object;
        object.swapping(); 
    }