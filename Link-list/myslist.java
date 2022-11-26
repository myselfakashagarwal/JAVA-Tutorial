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
    public void add_back()
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
           temporary =head;
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
        int initial = 1;
        int position1 = in.nextInt();    
        temporary = head;
        while(initial<position1-1)
        {
            temporary=temporary.next;
            initial++;
        }
        newbruh.next= temporary.next;
        temporary.next=newbruh;
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
    public void delete_back()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            temporary = head; 
            while(temporary.next.next!=null)
            {
              temporary =temporary.next;
            }
            temporary.next = null;           
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
           int position2 = in.nextInt();
           temporary = head;
           while(initial<position2-1)
           {
               temporary=temporary.next;
               initial++;
           }
           temporary.next=temporary.next.next;            
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
               System.out.println(temporary.name);
               temporary =temporary.next;
           }
        }
    } 
    class main
    {
        Scanner in =new Scanner(System.in);
        public void main(String[] args)
        {
            myslist ob =new myslist();
            ob.add_front();
            ob.add_back();
            ob.add_specific();
            ob.delete_front();
            ob.delete_back();
            ob.delete_specific();
            ob.display();
        }
    }
}
