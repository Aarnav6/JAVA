#include <iostream>
using namespace std;

int main() {
    int A = 5;
    
    int C = A++;  // A is assigned to C first, then incremented
    cout << "After post-increment, A: " << A << ", C: " << C << endl;

    // Pre-increment example (++A)
    int B = ++A;  // A is incremented first, then assigned to B
    cout << "After pre-increment, A: " << A << ", B: " << B << endl;
    // A is 6, B is 6

    // Post-increment example (A++)

    // A is 7, C is 6

    return 0;
}
