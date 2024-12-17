# include <iostream>
using namespace std;

class searching {
    private:
            // this is the array to seach
            const int arry[11] = {0,1,2,3,4,5,6,7,8,9,10};

            // this is the sorting function to sort array when binary search is used
            void sort(int cloned_arry[]) {
            int length = sizeof(cloned_arry)/sizeof(cloned_arry[0]);
            for (int i=0 ; i<length-1 ; i++) {
                for(int j=0 ; j<length-1 ; j++) {
                    if(cloned_arry[j] > cloned_arry[j+1]) {
                        int temp = cloned_arry[j+1];
                        cloned_arry[j+1] = cloned_arry[j];
                        cloned_arry[j] = temp;
                    }
                }
            }
        }
    public:
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
                sort(arry);
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
            void codeRunner(int length) {
                int element;
                cout<<"enter the item you want to search: ";
                cin>>element
                cout<<"searching using LinearSearch: "<<LinearSearch(element,length)<<endl;
                cout<<"searching using BinarySearch: "<<BinarySearch(element,length)<<endl;
            }
};

int main() {
searching sc;
int length = sizeof(sc.arry) / sizeof(sc.arry[0]);
sc.codeRunner(length)
}