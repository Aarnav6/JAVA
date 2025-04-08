# include <iostream>
# include <conio.h>
using namespace std;
int main ()
{
static int counter;
char ch;
while(true)
{
    ch = _getch();

    if (ch == 'w')
    {
        cout<<"UP";
        cout<<endl;
    }
    else if (ch == 'a')
    {
        cout<<"LEFT";
        cout<<endl;
    }
    else if (ch == 's')
    {
        cout<<"DOWN";
        cout<<endl;
    }
    else if (ch == 'd')
    {
        cout <<"RIHGT";
        cout<<endl;
    }
    else if (ch == ' ')
    {
        cout <<"spaceeeeeeeeeeee";
        cout<<endl;
    }
    else if (ch == 'q')
    {
        cout <<"Quit";
        cout<<endl;
        break;
    }
}
return 0;
}