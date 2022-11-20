import java.util.*;
class mydarray
{
     int[] myarr =new int[5];
     int current;
     public void add(int data)
     {
         if(current==myarr.length)
         {
             grow();
         }
         myarr[current]=data;
         current++;
     }
     public void grow()
     {
         int[] temporary_arr = new int[myarr.length*2];
         for(int i=0;i<myarr.length;i++)
         {
             temporary_arr[i]=myarr[i];
         }
         myarr = temporary_arr;
     }
     public void display()
     {
      for(int i=0;i<myarr.length;i++)
         {
             System.out.println(myarr[i]);
         }   
     }
     class Main
     {
         Scanner in=new Scanner(System.in);
         public void main(String[] args)
         {
             mydarray ob =new mydarray();
             System.out.println("input a number");
             int data =in.nextInt();
             ob.add(data);
         }
     }
}
