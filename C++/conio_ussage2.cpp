#include <iostream>
#include <conio.h>   // For kbhit() and _getch()
#include <windows.h> // For Sleep()

int main() {
    long long sum = 0;

    // Notify user about the program
    std::cout << "Calculating the sum of the first 100 natural numbers...\n";
    std::cout << "Press any key to terminate the program.\n";

    for (int i = 1; true ; i++) {
        // Sleep for 2 seconds
        Sleep(100);
        
        // Add the current number to the sum
        sum += i;
        std::cout << "Current sum after adding " << i << " is: " << sum << std::endl;

        // Check if a key has been pressed
        if (_kbhit()) {
            std::cout << "Key pressed! Terminating the program...\n";
            break; // Exit the loop if a key is pressed
        }
    }

    std::cout << "Final sum: " << sum << std::endl;
    return 0;
}
