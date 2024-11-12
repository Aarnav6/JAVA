#include <iostream>
using namespace std;

class Stack {
private:
    int maxSize;
    int* stackArray;
    int top;

public:
    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            cout << "Stack is full. Cannot push " << value << endl;
        } else {
            stackArray[++top] = value;
            cout << "Pushed " << value << " onto stack." << endl;
        }
    }

    int pop() {
        if (top == -1) {
            cout << "Stack is empty. Cannot pop." << endl;
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    int peek() {
        if (top == -1) {
            cout << "Stack is empty. No element to peek." << endl;
            return -1;
        } else {
            return stackArray[top];
        }
    }

    bool isEmpty() {
        return (top == -1);
    }

    ~Stack() {
        delete[] stackArray;
    }
};

int main() {
    Stack stack(5);
    
    stack.push(10);
    stack.push(20);
    stack.push(30);
    
    cout << "Top element is: " << stack.peek() << endl;
    cout << "Popped element is: " << stack.pop() << endl;
    cout << "Is stack empty? " << (stack.isEmpty() ? "Yes" : "No") << endl;

    return 0;
}
