package arraylist;

import java.util.ArrayList;

public class All {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.add(10));
		System.out.println(al.add(20));
		System.out.println(al.add("tejha"));
		System.out.println(al);
		al.add(   1,"sudarshan")   ;
		System.out.println(al);
		System.out.println(al.add("hitesh"));
		System.out.println(al);
		al.add("adithya");
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		Object ob=al.set(5,"harshith");
		System.out.println(ob);
		System.out.println(al);
		System.out.println(al.contains("asmitha"));
		System.out.println(al.add(20));
		System.out.println(al);
		System.out.println(al.indexOf(20));
		System.out.println(al.lastIndexOf(20));
		System.out.println(al.indexOf("trdvv"));
		System.out.println(al);
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		
		

	}

}
