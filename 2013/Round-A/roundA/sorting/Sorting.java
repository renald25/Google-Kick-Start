package roundA.sorting;

import java.util.*;
import java.io.*;


public class Sorting{
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCase=0;
		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		testCase = Integer.parseInt(scan.nextLine());
        
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
        for(int i=0;i<testCase;i++){
        	int n=scan.nextInt();
        	scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        	String line = scan.nextLine();
        	
        	List<Integer> evens = new ArrayList<Integer>();
            List<Integer> odds = new ArrayList<Integer>();
            
            String[] arrStr = line.split(" ");

            for(int cnt=0;cnt<n && cnt<arrStr.length;cnt++){
            	int num = Integer.parseInt(arrStr[cnt]);
            	if(num%2==0){
            		evens.add(num);
            	}else{
            		odds.add(num);
            	}
            }
            evens.sort(Comparator.reverseOrder());
            odds.sort(Comparator.naturalOrder());
            List<Integer> newOrders = new ArrayList<Integer>();
            int e=0;
            int o=0;
            for(String s:line.split(" ")){
            	int num = Integer.parseInt(s);
            	if(num%2==0){
            		newOrders.add(evens.get(e));
            		e++;
            	}else{
            		newOrders.add(odds.get(o));
            		o++;
            	}
            }
            
            strMap.put(i, newOrders.toString().replace("[", "").replace("]", ""));
        }
        
        for(int i=0;i<testCase;i++){
        	System.out.println("Case #"+(i+1)+": "+strMap.get(i));
        }
        
        
	}
}
