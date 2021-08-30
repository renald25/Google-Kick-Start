package roundA.sorting;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sorting{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String line ="";
        while (scan.hasNextLine()) {
            line = scan.nextLine();
      
        }
        List<Integer> nums = new ArrayList<Integer>();
        for(String s:line.split(" ")){
        	nums.add(Integer.parseInt(s));
        }
        
       // nums.so
	}
}
