import java.util.ArrayList;
public class ArrayListAddMethodExample
{
   public static void main()
   {
      // creating an empty ArrayList with initial capacity
      ArrayList<Integer> al = new ArrayList<Integer>(6);
      al.add(12);
      al.add(14);
      al.add(16);
      al.add(18);
      al.add(20);
      // adding element 15 at fourth position
      al.add(3, 15);
      for(Integer number : al)
      {
         System.out.println("Number: " + number);
      }
   }
}