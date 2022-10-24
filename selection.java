import java.util.Scanner;
import java.util.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
class selection extends fitness 
{
    public void select() 
    {
    int i=0,j=0,big=0,k=0,m=0;
    //int fitness[]=new int[201];
    int pop[][]=new int[250][15];
    List<ArrayList<Integer>> selected=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(i+=j;i<200;i++)
      {
          j=0;
          while(j<4)
           {
            if(pop[i+j][10]>big)
             {
              //big=pop[i+j][10];
              k=i+j;
             }
            j++;
           }
          for(m=0;m<10;m++)
           {
            list.add(pop[k][m]);
           }
          selected.add(list);
          big=0;
      }
    }
}