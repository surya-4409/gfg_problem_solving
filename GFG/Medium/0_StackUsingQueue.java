/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/stack-using-queue/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class myStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2= new LinkedList<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
        if(!q1.isEmpty())
        {
            q1.add(x);
        }
        else{
            q2.add(x);
        }
    }

    void pop() {
        // Removes an element from the top of the stack
         int top=-1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                top=q1.remove();
                
                if(q1.isEmpty())
                {
                    break;
                }
                q2.add(top);
            }
            
        }
        else{
            while(!q2.isEmpty())
            {
                top=q2.remove();
                if(q2.isEmpty())
                {
                    break;
                }
                q1.add(top);
            }
        }
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if(q1.isEmpty()  &&  q2.isEmpty())
        {
            return -1;
        }
         int first=-1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                first=q1.remove();
                q2.add(first);
            }
            
        }
        else{
            while(!q2.isEmpty())
            {
                first=q2.remove();
                q1.add(first);
            }
        }
        return first;
    }

    int size() {
        // Returns the current size of the stacka
        return q1.size()+q2.size();
    }
}

