package javaprogram.javaprogram001;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result1 {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
		
    	List<Integer> resultArr= new ArrayList<Integer>();
    	for(int i=d;i<a.size();i++)
    	{
    		resultArr.add(a.get(i));
    	}
    	for(int i=0;i<d;i++)
    	{
    		resultArr.add(a.get(i));
    	}
    	
    	return resultArr;
   

    }

}

public class LeftRotationArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> result = Result1.rotLeft(a, d);
        System.out.println(result);

        for (int i = 0; i < result.size(); i++) {
           // bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
               // bufferedWriter.write(" ");
            }
        }

       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
