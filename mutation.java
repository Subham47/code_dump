import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
class mutation extends crossover 
{
    public void mutate() 
    {
      int i,j;
      for(i=0;i<selected.size();i++)
      {
      //int rand=Math.random()*selected.size();
      for(j=5;j<7;j++)
        {
        if(selected.get(i).get(j)==0)
         selected.get(i).get(j)=1;
        else
         selected.get(i).get(j)=0;
        }
     }
    }
}
    