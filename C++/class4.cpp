# include <iostream>
using namespace std;
int main ()
{

int n=0;
int ary1[3][3];
int ary2[3][3];
int storageMatrix[3][3];


cout<<"entering in the 1st matrix"<<endl;
for(int i=0 ; i<=2 ; i++)
{
    for(int j=0 ; j<=2 ; j++)
    {
    cout << "enter the element of i="<<i+1<<" j="<<j+1<<endl;
    cin>>n;
    ary1[i][j] = n;
    }  
}
cout<<"entering in the 2nd matrix"<<endl;
for(int i=0 ; i<=2 ; i++)
{
    for(int j=0 ; j<=2 ; j++)
    {
    cout << "enter the element of i="<<i+1<<" j="<<j+1<<endl;
    cin>>n;
    ary2[i][j] = n;
    }  
}

for(int i=0 ; i<=2 ; i++)
{
    int element=0;
    int j_value=0;
    for(int j=0 ; j<=2 ; j++)
    {
        int temp1=1;
        int temp2=1;
        temp1 = ary1[i][j];
        temp2 = ary2[j][i];
        element += temp1*temp2; 
        j_value = j;
    }
    storageMatrix[i][j_value] = element;
    }


for(int i=0 ; i<=2 ; i++)
{
    for(int j=0 ; j<=2 ; j++)
    {
    cout << storageMatrix[i][j] << " ";
    }  
    cout<<endl;
}
return 0;
}