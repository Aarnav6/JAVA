# include <iostream>
# include <conio.h>
using namespace std;
int main ()
{
cout<<"hello"<<endl;
cout<<"hello"<<endl;


while(true) // infinite loop
{
    if (kbhit()) { // tells if key is currently pressed 
            getch(); // take ch input
            system("cls"); //clear output screen
            break;
        }
}
return 0;
}