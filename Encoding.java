package hw1;

import java.util.*;

public class Encoding {
	 public static Set<String> morseCodes(int m, int n)
	   {
	      Set<String> result = new TreeSet<>();
	      result.add(helper( m,n));
	      
		return result;
	     
	   }
	 public static void main(String[] args) {
		 
		 Set<String> result = new TreeSet<>();
		 result = morseCodes(2,1);
		 for (String s:result) {
			 System.out.println(s);
		 }
		 
		 
	 }
	 public static String  helper(int m,int n) {
		
		 return "."+ "-"+helper(m-1,n-1);
	 }

}
