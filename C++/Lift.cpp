# include <iostream>
# include <windows.h>
using namespace std;


class Lift {

private:
    
    static int floor;
    static int currentFloor;
    static int set;


public :

    Lift () // constructor
    {   
        cout <<"welcome to Lift "<< endl;
        cout <<"you are currently on floor no: "<<currentFloor<<endl;
        cout <<"enter the floor no. you want to go"<<endl;
        cin >> floor;
    }

    ~Lift() // desturctor
    {
        
    }

    int floor_valid ()
    {
        if (currentFloor == floor)
        {
            set = 3;
        }
        else if ( (floor>7) || (floor<0) )
        {
            set = 2;
        }
        else
        {
            if (currentFloor<floor)
            {
                set = 1;
            }
            else if (currentFloor>floor)
            {
                set = 0;
            }
        }   
        return set;
    }
    
    void Work (int tocheck)
    {
        int temp = 0;   
        switch(tocheck)
        {
        case 0:    //case 0 start
                for (int k=currentFloor ; k>=floor ; k--)
                {
                    Sleep(1000);
                   // cout<<""<<endl;
                    cout<<k<<endl;
                    temp=k;
                }
                currentFloor = temp;
                cout<<"welcome to the "<<floor<<" floor"<<endl;
                break;

        case 1:    //case 1 start
                for (int k=currentFloor ; k<=floor ; k++)
                {
                    Sleep(2500);
                    // right here
                    cout<<"\u2193"<<endl;
                    cout<<k<<endl;
                    temp=k;
                }
                currentFloor = temp;
                cout<<"welcome to the "<<floor<<" floor"<<endl;
                break;

        case 2:    //case 1 start
                cout  <<"invalid floor number"<<endl;
                break;
        
        case 3:    //case 3 start 
                cout <<"your already on floor number " << currentFloor << endl;
                break;
        }
    }
};

int Lift :: floor;
int Lift :: currentFloor;
int Lift :: set;

int main ()
{
    char ask;
    char confirm;
    
    while(true)
    {

        Lift l1;                          //object created
        int temp = l1.floor_valid();     //to determine output according user input 
        l1.Work(temp);                  //to run loop and output according floor entred


        /// code written to terminate loop when needed
        cout<<"want to exit lift Y for or N for no" <<endl;
        cin>>ask;

        if (ask == 'Y')
        {
            cout<<"Have a nice day"<<endl;
            break;
        }
        else if(ask == 'N')
        {
            cout << "you want to keep going Y for yes or N for no"<<endl;
            cin >> confirm;

            if(confirm == 'Y')
            {
                continue;
            }
            else if(confirm == 'N')
            {
                cout<<"Have a nice day"<<endl;
                break;
            }
            else
            {
                cout<< "invalid input try again"<<endl;
                break;
            }
        }
        else
        {
            cout<< "invalid input try again"<<endl;
            break;
        }

    }
    return 0;
}