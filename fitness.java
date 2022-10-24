import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
class fitness extends randompopulation 
{
    public void fit() 
    {
    int i,j;
    int fitness[]=new int[201];
    int pop[][]=new int[250][15];
    int a=0,k,fit1=0;
    for(i=0;i<200;i++)
      {
          k=0;
          for(j=9;j>=0;j--)
          {
           fit1 = fit1 + pop[i][j]*(int)Math.pow(2,k);
           k++;
           }
          pop[i][10]=fit;
          //fitness[a]=sum;
          a++;
        }
    /*Random rd=new Random();
    for(i=0;i<200;i++)
        {
           for(j=0;j<10;j++)
           {
             pop[i][j]=rd.nextInt(2);
             System.out.print(pop[i][j]+" ");
            }
           System.out.print(fitness[i]);
           System.out.println();
        }*/
    }
    /*class GA extends selection
    {
    void main()
      {
        selection se=new selection();
        se.random();
        se.select();
      }
    }*/
}