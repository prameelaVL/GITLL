package collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Arraylist will store elements on basis of index
		//We can retrieve the data based on idex
		//Array list will have duplicate elements
		ArrayList<String> ar=new ArrayList();
		ar.add("selenium");
		ar.add("python");
		ar.add("qtp");
		ar.add("prameela");
		ar.add("load");
		ar.add("test");
		//System.out.println("ar values are"+ar);
		//System.out.println(ar.get(1));
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("hhhh");
		ar2.add("pppp");
		ar2.add("errrr");
		ar2.add("selenium");
		System.out.println("ar2 values are"+ar2);
		System.out.println(ar2.size());

		System.out.println(ar2.addAll(ar));
		for(String s:ar2){
			System.out.println(s);
		}
		ar2.retainAll(ar);
		for(String s1:ar2){
			System.out.println(s1);
		}
		
		}

}
