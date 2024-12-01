#include <iostream>
using namespace std;

class Deque {
private:
    int front, rear, maxSize;
    int* dequeArray;

public:
    Deque(int size) {
        maxSize = size;
        dequeArray = new int[maxSize];
        front = -1;
        rear = 0;
    }

    bool isFull() {
        return ((front == 0 && rear == maxSize - 1) || front == rear + 1);
    }

    bool isEmpty() {
        return (front == -1);
    }

    void insertFront(int value) {
        if (isFull()) {
            cout << "Deque is full. Cannot insert at front." << endl;
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = maxSize - 1;
        } else {
            front = front - 1;
        }
        dequeArray[front] = value;
        cout << "Inserted " << value << " at front." << endl;
    }

    void insertRear(int value) {
        if (isFull()) {
            cout << "Deque is full. Cannot insert at rear." << endl;
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == maxSize - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        dequeArray[rear] = value;
        cout << "Inserted " << value << " at rear." << endl;
    }

    void deleteFront() {
        if (isEmpty()) {
            cout << "Deque is empty. Cannot delete from front." << endl;
            return;
        }
        cout << "Deleted " << dequeArray[front] << " from front." << endl;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == maxSize - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
    }

    void deleteRear() {
        if (isEmpty()) {
            cout << "Deque is empty. Cannot delete from rear." << endl;
            return;
        }
        cout << "Deleted " << dequeArray[rear] << " from rear." << endl;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = maxSize - 1;
        } else {
            rear = rear - 1;
        }
    }

    int getFront() {
        if (isEmpty()) {
            cout << "Deque is empty. No front element." << endl;
            return -1;
        }
        return dequeArray[front];
    }

    int getRear() {
        if (isEmpty()) {
            cout << "Deque is empty. No rear element." << endl;
            return -1;
        }
        return dequeArray[rear];
    }

    ~Deque() {
        delete[] dequeArray;
    }
};

int main() {
    Deque deque(5);

    deque.insertRear(10);
    deque.insertRear(20);
    deque.insertFront(5);
    deque.insertFront(1);
    
    cout << "Front element: " << deque.getFront() << endl;
    cout << "Rear element: " << deque.getRear() << endl;

    deque.deleteFront();
    cout << "Front element after deletion: " << deque.getFront() << endl;

    deque.deleteRear();
    cout << "Rear element after deletion: " << deque.getRear() << endl;

    return 0;
}
