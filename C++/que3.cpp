# include <iostream>
using namespace std;
class Assigner {
    private: 
        const string name;
        const int roll_no;
        int marks=0;
        float percentage;
    public: 
        void assign() {
            int set;
            cout<<"enter the marks of all 5 subjects: ";
            for (int i=0 ; i<5 ; i++) {
                int temp;
                cin>>temp;
                marks += temp;
                percentage = (marks/500)*100;
            }
            if(marks>=70 && marks<=74) {
                set = 4;
            }
            else if(marks>=75 && marks<=79) {
                set = 3;
            }
            else if(marks>=80 && marks<=89) {
                set = 2;
            }
            else if(marks>90 && marks<=89) {
                set = 1;
            }
            void show(int set) {
                    cout <<"name: "<<name;
                    cout<<"roll no: "<<roll_no;
                switch (set) {
                    case 1 : cout<<""<<ednl
                    break;
                    case 2 : cout<<"your branch is: Electronics"<<endl;
                    break;
                    case 3 : cout<<"your branch is: Mechanical"<<endl;
                    break;
                    case 4 : cout<<"your branch is: Electrical"<<endl;
                    break;
                }
            }
        }
};