
/**
 * To implement Knapsack problem using Genetic Algorithm
 *
 * @author (Subham Kumar)
 * @version (21/02/2021)
 */
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
class ga1
{
   Random rd=new Random();
   int fitness[]=new int[201];
   int pop[][]=new int[250][15];
   void random() 
     {
       int i,j;
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
  void fit()
    {
      int i,j,fit1=0,k=0;
      System.out.println(pop.length);
      for(i=0;i<pop.length;i++)
      {
         for(j=0;j<10;j++)
          {
           System.out.print(pop[i][j]+" "); 
           if(pop[i][j]==1)
           fit1 ++;
           }
          fitness[k]=fit1;
          System.out.println(fit1);
          fit1=0;
          k++;
       }
    }
     public void main()
      {
        ga1 genetic;
        genetic=new ga1();
        genetic.random();
        genetic.fit();
      }
}