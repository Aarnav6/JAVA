#include <iostream>
using namespace std;

class CircularQueue {
private:
    int front, rear, maxSize;
    int* queueArray;

public:
    CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    bool isFull() {
        return ((rear + 1) % maxSize == front);
    }

    bool isEmpty() {
        return (front == -1);
    }

    void enqueue(int value) {
        if (isFull()) {
            cout << "Queue is full. Cannot enqueue " << value << endl;
        } else {
            if (front == -1) front = 0;
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            cout << "Enqueued " << value << " to queue." << endl;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            cout << "Queue is empty. Cannot dequeue." << endl;
            return -1;
        } else {
            int value = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
            return value;
        }
    }

    int peek() {
        if (isEmpty()) {
            cout << "Queue is empty. No element to peek." << endl;
            return -1;
        } else {
            return queueArray[front];
        }
    }

    ~CircularQueue() {
        delete[] queueArray;
    }
};

int main() {
    CircularQueue queue(5);

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);

    cout << "Front element is: " << queue.peek() << endl;

    cout << "Dequeued element is: " << queue.dequeue() << endl;
    queue.enqueue(60);

    cout << "Front element after dequeue and enqueue: " << queue.peek() << endl;
    cout << "Dequeued element is: " << queue.dequeue() << endl;
    cout << "Is queue empty? " << (queue.isEmpty() ? "Yes" : "No") << endl;

    return 0;
}
