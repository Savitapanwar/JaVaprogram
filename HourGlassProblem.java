package javaprogram.javaprogram001;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlassProblem {

	public static void main(String[] args) throws IOException {
		

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
                
            }

            arr.add(arrRowItems);
        }

        int result = Result.hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
     //   bufferedWriter.close();
    
		
		
		//i=0
               //j=0,1,2
		//i=1
			//j=1
		//i=2
			//j=0,1,2
		
		//for(i=0;i<n-1;i++)
		//for(j=0;j<n-1;j++)
		//arr[i,j],arr[i,j+1],arr[i,j+2]
		//arr[i+1,j+1]
		//arr[i+2,j],arr[i+2,j+1],arr[i+2,j+2]

	}

}



class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    	Integer sum;
    	
    	 List<List<Integer>> arrsum = new ArrayList<>();
    	 
    	for(int i=0;i<arr.size()-2;i++)	
    	{	List<Integer> item=new ArrayList<Integer>();
    		for(int j=0;j<arr.size()-2;j++)	
        	{    
    			 sum =arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)
    					+arr.get(i+1).get(j+1)
    					+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
    			 	
    			item.add(sum);	
    					
        	}
    		
    		arrsum.add(item);
    	}
    	Integer sumall=0;
    	for (List<Integer> list : arrsum) {
    		
    		for (Integer list2 : list) {
    			
    			if(sumall<list2)
    			sumall= list2;
			}
			
    		
    		
		}	

    
    	
    	return sumall;



    }

}


