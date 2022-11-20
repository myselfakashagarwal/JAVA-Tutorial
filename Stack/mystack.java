import java.util.*;
class mystack
{
    Scanner in =new Scanner(System.in);
    int[] my_stack_arr;
    int top;
    mystack(int capacity)
    {
        my_stack_arr = new int[capacity];
        top =-1;
    }
    public void push(int data)
    {
        if(top==my_stack_arr.length-1)
        {
            System.out.println("OVERFLOW");
        }
        else
        {
            top++;
            my_stack_arr[top]=data;
        }
    }
    public void pop()
    {
        if(top==-1)
        {
           System.out.println("UNDERFLOW");    
        }
        else
        {
            top--;
        }
    }
    public void peek()
    {
        if(top<0)
        {
            System.out.println("The stack is empty");
        }
        else
        {
            System.out.println("The top element of the stack is: "+my_stack_arr[top]);            
        }
    }
    public void display()
    {
        if(top<0)
         {
            System.out.println("The stack is empty");
         }
        else
         {
            for(int i=0;i<=top;i++)
            {
               System.out.print(my_stack_arr[i]+" ");     
            }  
         }
    }
    public void isEmpty()
    {
        if(top<0)
        {
            System.out.println("The stack is empty");
        }
        else
        {
            System.out.println("Stack is not empty");
        }
    }
    public void search()
    {
        int check=0;
        System.out.println("input item you wanna search off");
        int search =in.nextInt();
        if(top<0){
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                if(my_stack_arr[i]==search)
                {
                    check++;
                }
            }
            if(check>=1)
            {
                System.out.println("The given element exists");
            }
            else
            {
                System.out.println("The given element does not exists");
            }
        }
    }
    public class Main
    {
        public void main(String[] args)
        {
          System.out.println("input the capacity of the stack ");
          int capacity =in.nextInt();
          mystack ob =new mystack(capacity);
          System.out.println("input the data");
          int data =in.nextInt();
          ob.push(data);
          ob.pop();
          ob.peek();
          ob.search();
          ob.display();
        }
    }
}
