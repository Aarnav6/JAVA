# include <iostream>
using namespace std;
class complex
{
int x,y;

public:
void get()
{
    cout <<"enter x value "<<endl;
    cin >> x; 
    cout <<"enter y value "<<endl;
    cin >> y;
}
void show()
{
    cout<<"the x value entred is : "<<x<<endl<<"the y value entred is : "<<y<<endl;
}
};

int main ()
{
complex c1 , c2 ,t ;
c1.get();
c2.get();
t = c2;
c2 = c1;
c1 = t;
cout<<"values after swapping"<<endl;
c1.show();
c2.show();

return 0;
}
