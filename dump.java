import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
class dump
{
    public void main() 
       {
        int n=10,profit1=0,weight1=0;
        int count=0,flag=0,i,j;
        int fitness[]=new int[201];
        int pop[][]=new int[250][15];
        int profit[]=new int[50];
        int weight[]=new int[50];
        int max1[][]=new int[20][20];
        int max2[][]=new int[20][20];
        int merge[]=new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PROFIT AND WEIGHT OF 10 ELEMENTS");
        System.out.println();
        for(i=0;i<10;i++)
        {
        System.out.println("Enter the "+(i+1)+"th profit,weight pair");
        profit[i]=sc.nextInt();
        //System.out.print(",");
        weight[i]=sc.nextInt();
        }
        
        
     Generating a random population of size 200
    /*  Random rd=new Random();//to generate random numbers
     /* while(flag<200)
        
        for(i=0;i<200;i++)
        {
           for(j=0;j<n;j++)
           {
             pop[i][j]=rd.nextInt(2);
             System.out.println(pop[i][j]+" ");
            }
           System.out.println();
        }*/
        
        
    //Selection process
    int a=0,k,sum=0;
    for(i=0;i<200;i++)
        {
          k=0;
          for(j=n;j<0;j--)
          {
           sum+=pop[i][j]*(int)Math.pow(2,k);
           k++;
           }
          fitness[a]=sum;
          a++;
        }
    for(i=0;i<200;i++)
        {
           for(j=0;j<n;j++)
           {
             //pop[i][j]=rd.nextInt(2);
             //System.out.print(pop[i][j]+" "+fitness[i]);
            }
           System.out.println();
        }
  }
}
for(i=0;i<list.size();i++)
      {
          //k=0;
         for(j=i;j<10;j++)
          {
           //System.out.print(pop[i][j]+" ");  
           if(pop[i][j]==1)
           fit1 ++;
           //= pop[i][j]*(int)Math.pow(2,k);
           //k++;
           }
          pop[i][10]=fit1;
          //System.out.print(pop[i][j]+" ");
          //fitness[a]=sum;
          //a++;
          System.out.print(pop[i][10]);
          System.out.println();
          fit1=0;
       }
    return(fit1);