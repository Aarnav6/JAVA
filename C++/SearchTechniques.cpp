# include <iostream>
using namespace std;

class searching {
    public:
    int arry[4] = {12,45,87,20};
    void LinearSearch(int item , int length) {
        int i=0;
        int location = -1; 
        while (i<length) {
            if(arry[i] == item) {
                location = i;
                break;
            }
            i++;
        }
        if(location == -1) {
            cout<<"item is not in the list"<<endl;
        }
        else{
            cout<<"item found at index: "<<location<<endl;
        }
    }
    void BinarySearch(int item , int length) {
        int i=0;
        int location = -1;
        int beg = 0;
        int end = length-1; 
        while(beg <= end) {
            int mid = (beg+end)/2;
            if(arry[mid] == item) {
                location = mid;
                break;
            }
            else if(item>arry[mid]) {
                beg = mid+1;
            }
            else if(item<arry[mid]) {
                end = mid-1;
            }
        }
        if(location == -1) {
            cout<<"item is not in the list"<<endl;
        }
        else {
            cout<<"item found at index: "<<location<<endl;
        }
    }
};

int main() {
searching sc;
//index           0     1     2     3
//arry elements   12    45    87    20
int length = sizeof(sc.arry) / sizeof(sc.arry[0]);


sc.LinearSearch(87, length);
sc.BinarySearch(20, length);

}