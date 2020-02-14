/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package book;
import java.util.Scanner;
public class Book 
{
        Scanner in=new Scanner(System.in);
        int BookId[]=new int[2];
        int AccessionNumber[]=new int[2];
        String BookName[]=new String[2];
        String Author[]=new String[2];
        String Publication[]=new String[2];

    
    public Book()
        {            
        for(int i=0;i<BookId.length;i++)
        {
            System.out.println("Enter the following details for book "+i+1);
            System.out.println("Enter the bookid");
            BookId[i]=in.nextInt();
            System.out.println("Enter the AccessionNumber");
            AccessionNumber[i]=in.nextInt();
            System.out.println("Enter the BookName");
            BookName[i]=in.next();
            System.out.println("Enter the Author");
            Author[i]=in.next();
            System.out.println("Enter the Publication");
            Publication[i]=in.next();
        }
        }

    public void display(int i)
     {
         System.out.println("BookId"+BookId[i]);
         System.out.println("AccessionNumber"+AccessionNumber[i]);
         System.out.println("BookName"+BookName[i]);
         System.out.println("Author"+Author[i]);
         System.out.println("Publication"+Publication[i]);
     
     }

    public int booksearch(int j)
     {
         for(int i=0;i<BookId.length;i++)
         {
         if(BookId[i]==j)
         {
            return i;
         }
         }
         return -1;           
         
     }
}


