# include <iostream>
using namespace std;
class demo{
    int x,y;
    public:
    demo(){
        cout<<"dc"<<endl;
    }
    demo(int a,int b){
        cout<<"pc"<<endl;
    }
    ~demo() {
        cout <<"od"<<endl;
    }
    demo sum (demo a,demo b){
    demo t;

    }
    
};
int main ()
{
    demo d1;
    demo d2(9,8);
    demo d3=demo(1,2);
    demo d4;
    d4=d1.sum(d2,d3);
return 0;
}