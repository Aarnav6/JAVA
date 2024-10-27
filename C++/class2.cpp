# include <iostream>
using namespace std;

int call()
{
    static int x;
    x++;
    return x;
}
int main ()
{
    for(int i=1;i<=5;i++)
    {
        cout<<"\n"<<call();
    }
    return 0;
}