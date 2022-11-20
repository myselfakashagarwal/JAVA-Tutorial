import java.util.*;
class myddarray
{
    Scanner obj =new Scanner(System.in);
    //Creating an array in thye class so that it can be accessed any part of the program 
    String arr[][] =new String[5][5];
    public void input()
    {
        for(int n_th_array=0;n_th_array<5;n_th_array++)
        {
            System.out.println("The current array is going on is ~ "+n_th_array);
            for(int i=0;i<5;i++)
            {
               arr[n_th_array][i]="("+n_th_array+","+i+")";
            }
        }
    }
    public void display()
    {
        for(int n_th_array=0;n_th_array<5;n_th_array++)
        {
            for(int i=0;i<5;i++)
            {
               System.out.print(arr[n_th_array][i]+"  ");
            }
            System.out.println('\n');
        }
    }
    class Main
    {
        public void main(String args[])
        {
            myddarray ob =new myddarray();
            ob.input();
            ob.display();
        }
    }
}
