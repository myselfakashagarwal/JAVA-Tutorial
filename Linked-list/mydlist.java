import java.util.*;
class mydlist
{
    Scanner in=new Scanner(System.in);
    
      class bruh
      {
          String name;
          bruh previous;
          bruh next;
          bruh(String name)
          {
              this.name=name;
              previous=null;
              next=null;
          }
      }
      
      bruh head;
      
      public void add_front()
      {
          System.out.println("Input the name of the bruh");
          String name =in.nextLine();
          bruh newbruh=new bruh(name);
          if(head==null)
           { 
              head=newbruh;
           }
          else
           {
              newbruh.next=head;
              newbruh.previous=null;
              head.previous=newbruh;
              head=newbruh;
           }
      }
     
      public void add_last()
      {
          bruh temporary=head;
          System.out.println("Input the name of the bruh");
          String name=in.nextLine();
          bruh newbruh =new bruh(name);
          if(head==null)
          {
              head=newbruh;
          }
          else
          {              
              while(temporary.next!=null)
              {
                  temporary=temporary.next;
              }
              temporary.next=newbruh;
              newbruh.previous=temporary;
          }
      }
    
      public void add_specific()
      {
          System.out.println("Input the name of the bruh");
          String name=in.nextLine();
          bruh newbruh=new bruh(name);
          System.out.println("Input index you wanna insert ");
          int desired_index=in.nextInt();
          int current_index=1;
          bruh temporary=head;
          if(temporary==null)
          {
              System.out.println("List is empty");
          }
          else
          {
              while(current_index!=desired_index-1)
              {
                temporary=temporary.next;
                current_index++;
              }  
              newbruh.next=temporary.next;
              temporary.next=newbruh;
              temporary.next.next.previous=newbruh;
              newbruh.previous=temporary;
          }
      }
    
      public void delete_front()
      {
          if(head==null)
          {
              System.out.println("This list is empty");
          }
          else if(head.next==null)
          {
              head=null;
          }
          else
          {
              head=head.next;
              head.previous=null;
          }
      }
     
      public void delete_last()
      {
          bruh temporary=head;
          if(head==null)
          {
            System.out.println("This list is empty");    
          }
          else if(temporary.next==null)
          {
              delete_front();
          }
          else
          {
            while(temporary.next.next!=null)
            {
                temporary=temporary.next;
            }
            temporary.next=null;
          }
      }
      
      public void delete_specific()
      {
          bruh temporary=head;
          System.out.println("Input the index you wanna delete node at ");
          int desired_index=in.nextInt();
          int current_index=1;
          if(temporary==null)
          {
              System.out.println("The list is empty");
          }
          else if(desired_index==1)
          {
              delete_front();
          }
          else
          {
              while(current_index<desired_index-1)
              {
                  temporary=temporary.next;
                  current_index++;
              }
              bruh temporary_next=temporary.next;
              temporary.next=temporary_next.next;
              temporary_next.previous=temporary;
          }
      }
      
      public void display_front()
      {
          if(head==null)
          {
              System.out.println("This list is empty");
          }
          else
          {
              bruh temporary=head;
              while(temporary!=null)
              {
                  System.out.print(temporary.name+" .next = ");
                  temporary=temporary.next;
              }
              System.out.println("NULL");
          }
      }

      public void display_back()
      {
          if(head==null)
          {
              System.out.println("List is empty");
          }
          else if(head.next==null)
          {
              System.out.println(head.name+" .previous = NULL");
          }
          else
          {
            bruh temporary=head;
            while(temporary.next!=null)
            {
                temporary=temporary.next;
            }
          
            while(temporary!=null)
            {
               System.out.print(temporary.name+" .previous = ");
               temporary=temporary.previous;             
            }
            System.out.println("NULL");              
          }
      }
      
      
 
      class Main
      {
          public void main(String[] args)
          {
              mydlist ob=new mydlist();
              ob.add_front();
              ob.add_last();
              ob.add_specific();
              ob.delete_front();
              ob.delete_last();
              ob.delete_specific();
              ob.display_front();
              ob.display_back();
          }
      }
      
}