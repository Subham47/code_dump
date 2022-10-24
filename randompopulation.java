import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class randompopulation
{
   public void random() 
     {
        int i,j;
        int fitness[]=new int[201];
        int pop[][]=new int[250][15];
     //Generating a random population of size 200
       Random rd=new Random();//to generate random numbers
        for(i=0;i<200;i++)
        {
           for(j=0;j<10;j++)
           {
             pop[i][j]=rd.nextInt(2);
             System.out.print(pop[i][j]+" ");
            } 
           System.out.println();
        }
    }
}
