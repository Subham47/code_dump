import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
class ga
{
   ArrayList<Integer> list = new ArrayList();
   ArrayList<Integer> selected = new ArrayList();
   Random rd=new Random();
   int fitness[]=new int[201];
   //int pop[][]=new int[250][15];
  public void random() 
     {
       int i,j;
       //Generating a random population of size 200
       Random rd=new Random();//to generate random numbers
        for(i=0;i<200;i++)
        {
           for(j=0;j<10;j++)
           {
             list.add(rd.nextInt(2));
             //System.out.print(pop[i][j]+" ");
            } 
           //System.out.println();
        }
       //return(pop);
    }
   public void fit() 
    {
    int i,j;
    int a=0,k=0,fit1=0;
    for(i=0;i<list.size();i=i+10)
      {
        j=i;
        while(j<i+10&&i+10<list.size())
        {
        if(list.get(j)==1)
          {
           fit1++;
          }
        j++;
        }
        fitness[a]=fit1;
        a++;
        fit1=0;
      }
    for(int index=0;index<list.size();index++)
       {
          if(index%10==0&&index!=0)
          System.out.println(fitness[k++]);
          System.out.print(list.get(index)+" ");
          
       }
          System.out.println(fitness[k]); 
  }
  public void select() 
    {
    int i=0,j=0,big=0,k=0,m=0;
    for(i=0;i<fitness.length;i++)
      {
       System.out.println(fitness[i]); 
    }}
       /*if(fitness[i]>big)
          {
            big=fitness[i];
            k=i;
          }
       if((i+1)%4==0)
         {
        System.out.println(k); 
        for(j=(i+1-4)*10;j<(i+1)*10;)
          {
            if(j==k*10)//(j>=k*10||j<k*10+10) && j<list.size()
            j=j+10;
            if(j<list.size())
            {
            list.remove(j);
            j++;
            }
          }
        big=0;
        k=0;
        }
         //System.out.println();
        }
    for(int index=0;index<list.size();index++)
       {
          if(index%10==0&&index!=0)
          System.out.println();
          System.out.print(list.get(index)+" ");
       }
          System.out.println(); */  
   //}
  
  /*public void cross() 
   {
    int i,j=0;
    //int max=4;
    int max=rd.nextInt()*10;
    for(i=0;i<list.size();i=i+22)
      {
        j=i;
        max+=j;
        while(j<=max&&j+11<list.size())
        {
        Collections.swap(list,j,j+11);
        j++;
        }
      }
      for(int index=0;index<list.size();index++){
          System.out.print(list.get(index));
          }
          System.out.println();  
    }
  public void mutate() 
    {
      int i,j;
      for(i=0;i<list.size();i++)
      {
      int rand=(int)(Math.random()*list.size());
        if(list.get(rand)==0)
        {
         list.set(rand,1);
         //list.remove(j+1);
        }
        if(list.get(rand)==1)
        {
         list.set(rand,0);
         //list.remove(j+1);
        }
     }
     for(int index=0;index<list.size();index++){
          System.out.print(list.get(index));
          }
          System.out.println(); 
    }*/
    
  public void main()
      {
        ga genetic;
        genetic=new ga();
        genetic.random();
        int z=0;
        //do
        //{
        System.out.println("Generation "+(z)+":");
        genetic.fit();
        System.out.println("\nGeneration 1");
        genetic.select();
        //genetic.cross();
        //genetic.mutate();
        z++;
        //}while(list.size()>11);
        System.out.println("Success");
        //System.out.println("The best solution is="+selected.get(0));
      }
    
}

    