import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
class crossover extends selection 
{
    public void cross() 
    {
    int i,j=0;
    int fitness[]=new int[201];
    int pop[][]=new int[250][15];
    int a=0,k,sum=0;
    for(i=0;i<selected.size();i=i+2)
      {
        for(j=0;j<5;j++)
        {
        temp=selected.get(i+1).get(j);
        selected.get(i+1).get(j)=selected.get(i).get(j); 
        selected.get(i).get(j)=temp;
        }
      }
    }
}
    