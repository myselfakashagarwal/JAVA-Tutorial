import java.util.*;
class myarray
{
    Scanner obj =new Scanner(System.in);
    //Creating an array in thye class so that it can be accessed any part of the program 
    int arr[] =new int[10];
    public void input()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Input the data at index: "+i);
            arr[i]=obj.nextInt();
        }
    }
    public void display()
    {
         for(int i=0;i<10;i++)
        {
            System.out.println("Element of an array at index: "+i+" is "+arr[i]);
        }
    }
    class Main
    {
        public void main(String args[])
        {
            myarray ob =new myarray();
            ob.input();
            ob.display();
        }
    }
}