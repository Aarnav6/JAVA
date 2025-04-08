# include <iostream>
# include <string.h>
using namespace std;


class record 
{
    int ino;
    char iname[20];
    float price;

public:

void get() {
    cout<<"enter the no / name /price "<<endl;
    cin>>ino>>iname>>price;
    }
void show() {
    cout <<ino<<" "<<iname<<" "<<" "<<price<<endl;
    }

friend void update(record &);
};

void update (record &r){
r.show();
r.ino = 200;
strcpy(r.iname , "keyboard");
r.price = 300;
}

int main ()
{
    record r1;
    r1.get ();
    r1.show ();
    update(r1);
    r1.show();
return 0;
}