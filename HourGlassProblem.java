package javaprogram.javaprogram001.JaVaprogram;
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
		System.out.println( "result: largest sum "+result);

		//        bufferedWriter.write(String.valueOf(result));
		//        bufferedWriter.newLine();

		bufferedReader.close();
		//   bufferedWriter.close();



	

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
		Integer lar=arrsum.get(0).get(0);
		System.out.println("initial small reference set"+lar);

		for (List<Integer> list : arrsum) {

			for (Integer list2 : list) {

				if(list2>lar)
				{
					lar= list2;
					
				}
			}



		}	


		return lar;



	}

}


