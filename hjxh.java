import java.util.Scanner;
import java.util.*;
import java.lang.*;
class hjxh
{
    void main()
    {
        int i,j,m=0;
        Random rd=new Random();
        int pop[][]=new int[16][10];
        int cop[]=new int[16];
        for(i=0;i<pop.length;i++)
        {
            for(j=0;j<10;j++)
            {
                pop[i][j]=rd.nextInt(2);
            }
        }
        for(i=0;i<pop.length;i++)
        {
            for(j=0;j<10;j++)
            {
                System.out.print(pop[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<pop.length;i+=2)
        {
            cop[m]=rd.nextInt(10);
            int temp;
            for(j=0;j<cop[m];j++)
            {
             temp=pop[i][j];
             pop[i][j]=pop[i+1][j];
             pop[i+1][j]=temp;
            }
            m++;
        }
        for(i=0;i<pop.length;i++)
        {
            for(j=0;j<10;j++)
            {
                System.out.print(pop[i][j]+" ");
            }
            System.out.println(cop[i]);
        }
    }
}