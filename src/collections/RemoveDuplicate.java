package collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("mango");
		l.add("apple");
		l.add("orange");
		l.add("mango");
		System.out.println(l.toString());
		Set<String> s=new HashSet<String>(l);
		System.out.println(s.toString());
		
		String s1="I am learing selenium";
		
		LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++){
			lh.add(s1.charAt(i));}
		
			for(char ch:lh){
				System.out.println(ch);
			}
			}
			
			
		}
			
		
		
	}

}
