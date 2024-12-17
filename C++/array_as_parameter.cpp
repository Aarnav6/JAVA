# include <iostream> 
using namespace std;
void checker(string stringA[] , int integerA[] ) 
{
    ///////////////////////
    cout<<"I size of arry: "<<sizeof(integerA)<<endl;
    cout<<"I size of arry[0]: "<<sizeof(integerA[0])<<endl;
    ///////////////////////
    cout<<"S size of arry: "<<sizeof(stringA)<<endl;
    cout<<"S size of arry[0]: "<<sizeof(stringA[0])<<endl;
}
int main() 
{
    int Array_int[5] = {132,554,870,554,458};
    string Array_string[5] = {"132","554","870","554","458"};
    checker(Array_string , Array_int);
}