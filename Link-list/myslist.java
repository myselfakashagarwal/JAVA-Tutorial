import java.util.*;
public class myslist
{
      Scanner in =new Scanner(System.in);
      
      public class bruh
      {
          String name;
          bruh next;
          bruh(String name)
          {
              this.name = name;
              this.next =null;
          }
      }
    bruh head; 
    bruh temporary;
    
      public void add_front()
      {
          System.out.println("Input the name of the bruh");
          String name = in.nextLine();
          bruh newbruh = new bruh(name);
          if(head==null)
          {
              head = newbruh;
          }
          else
          {
              newbruh.next = head;
              head = newbruh;
          }
      }
      
      public void add_last()
      {
          System.out.println("Input the name of the bruh");
          String name = in.nextLine();
          bruh newbruh = new bruh(name);
          if(head==null)
          {
              head= newbruh;
          }
          else
          {
             temporary = head;
             
               while (temporary.next!=null)
               {
                   temporary = temporary.next;
               }
               
             temporary.next = newbruh;
          }
      }
      
      public void add_specific()
      {
          System.out.println("Input the name of the bruh");
          String name =in.nextLine();
          bruh newbruh =new bruh(name);
          System.out.println("Enter the position you wanna enter that");
          int current_index = 1;
          int desired_index = in.nextInt();    
          temporary = head;
          if(desired_index==1)
          {
              newbruh.next=head;
              head=newbruh;
          }
          else
          {
              
              while(current_index<desired_index-1)
              {
                  temporary=temporary.next;
                  current_index++;
              }
            
            newbruh.next= temporary.next;
            temporary.next=newbruh; 
          }
      }
      
      public void delete_front()
      {
          if(head==null)
          {
              System.out.println("The list is empty");
          }
          else
          {
              head = head.next;
          }
      }
      
      public void delete_last()
      {
          if(head==null)
          {
              System.out.println("The list is empty");
          }
          else if(head.next==null)
          {
              head=null;
          }
          else
          {
              temporary = head; 
              while(temporary.next.next!=null)
              {
                temporary =temporary.next;
              }
              temporary.next = temporary.next.next;    
          }
      }
      
      public void delete_specific()
      {   
          if(head==null)
          {
              System.out.println("The list is empty");
          }
          else
          {
             System.out.println("Enter the position you wanna delete");
             int initial = 1;
             int desired_index = in.nextInt();
             temporary = head;
             if(desired_index==1)
             {
                 delete_front();
             }
             else
             {
               while(initial<desired_index-1)
               {
                   temporary=temporary.next;
                   initial++;
               }
               temporary.next=temporary.next.next; 
             }
          }
      }
      
      public void display()
      {
          if(head==null)
          {
              System.out.println("The list is empty");
          }
          else
          {
             temporary = head;
             while(temporary!=null)
             {
                 System.out.print(temporary.name+" .next = ");
                 temporary =temporary.next;
             }
             System.out.print("NULL");
          }
      } 
    
      class Main
      {
          Scanner in =new Scanner(System.in);
          public void main(String []args)
          {
              myslist ob =new myslist();
              ob.add_front();
              ob.add_last();
              ob.add_specific();
              ob.delete_front();
              ob.delete_last();
              ob.delete_specific();
              ob.display();
          }
      }
      
}

