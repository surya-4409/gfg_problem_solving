/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/implement-queue-using-array/1
 * Platform     : GFG
 * Difficulty   : Basic
 */

class myQueue {

    // Constructor
    static int arr[];
    static int size;
    static int rear;
    
    public myQueue(int n) {
        // Define Data Structures
        arr=new int[n];
        size=n;
        rear=-1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return rear==-1;
    }

    public boolean isFull() {
        // Check if queue is full
        return rear==arr.length-1;
    }

    public void enqueue(int x) {
        
        // Enqueue
        rear=rear+1;
        arr[rear]=x;
    }

    public void dequeue() {
        // Dequeue
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear=rear-1;
    }

    public int getFront() {
        // Get front element
        if(isEmpty())
        {
            return -1;
        }
        else{
            return arr[0];
        }
    }

    public int getRear() {
        // Get last element'
     if(isEmpty())
     {
         return -1;
     }
     else{
         return arr[rear];
     }
    }
}

