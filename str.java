import java.io.*;
import java.lang.*;
class str
{
    void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String str1=br.readLine();
        System.out.println("You have entered"+str1);
    }
}