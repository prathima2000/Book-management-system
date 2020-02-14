/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package journal;

/**
 *
 * @author USER
 */

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class journal 
{
        Scanner in=new Scanner(System.in);
        int Journalid[]=new int[2];
        String JournalName[]=new String[2];
        public journal()
        {
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter the following details of Jounal "++1);
            System.out.println("Enter the JournalID");
            Journalid[i]=in.nextInt();
            System.out.println("Enter the JournalName");
            JournalName[i]=in.next();
        }       
        }
        public void display(int i)
     {
         System.out.println("Journalid"+Journalid[i]);
         System.out.println("JournalName"+JournalName[i]);
              
     }
        public int journalsearch(int j)
     {
         for(int i=0;i<Journalid.length;i++)
         {
         if(Journalid[i]==j)
         {
            return i;
         }
         }
         return -1;           
         
     }
}
