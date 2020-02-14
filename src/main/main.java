/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import journal.*;
import book.*;
import java.util.Scanner;
class student
{
    int rollno;
    String studentname;
    Scanner in=new Scanner(System.in);
    void getstudent()
    {
        System.out.println("Enter the rollno");
        rollno=in.nextInt();
        System.out.println("Enter the name");
        studentname=in.next();
    }
    
}
class staff
{
    String staffid;
    String staffname;
    Scanner in=new Scanner(System.in);
    void getstaff()
    {
        System.out.println("Enter the StaffId");
        staffid=in.next();
        System.out.println("Enter the staffname");
        staffname=in.next();
    }
}

public class main {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        Book b=new Book();
        journal j=new journal();
        System.out.println("Enter your designation 1.student 2.staff");
        int choice=in.nextInt();
        switch(choice)
        {
            case 1:
                student s=new student(); 
                s.getstudent();
                System.out.println("Enter the details to be searched 1.Book 2.Journal");
                int ch=in.nextInt();
                if(ch==1)
                {
                System.out.println("Enter the BookId");
                int id=in.nextInt();
                int found=b.booksearch(id);
                if(found!=-1)
                {
                    b.display(found);
                }
                else
                {
                    System.out.println("Book is not available");
                }
                }
                if(ch==2)
                {
                System.out.println("Enter the Journalid");
                int id=in.nextInt();
                int found=j.journalsearch(id);
                if(found!=-1)
                {
                    j.display(found);
                }
                else
                {
                    System.out.println("Journal is not available");
                }
                }
                break;
                case 2:
                staff s1=new staff();
                s1.getstaff();
                System.out.println("Enter the details to be searched 1.Book 2.Journal");
                int ch1=in.nextInt();
                if(ch1==1)
                {
                System.out.println("Enter the BookId");
                int id=in.nextInt();
                int found=b.booksearch(id);
                if(found!=-1)
                {
                    b.display(found);
                }
                else
                {
                    System.out.println("Book is not available");
                }
                }
                if(ch1==2)
                {
                System.out.println("Enter the Journalid");
                int id=in.nextInt();
                int found=j.journalsearch(id);
                if(found!=-1)
                {
                    j.display(found);
                }
                else
                {
                    System.out.println("Journal is not available");
                }
                }
                break;
                
    }
}
}
