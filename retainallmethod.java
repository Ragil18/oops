1.	import java.util.*;  
2.	class TestCollection6{  
3.	 public static void main(String args[]){  
4.	  ArrayList<String> al=new ArrayList<String>();  
5.	  al.add("Ragil");  
6.	  al.add("varun");  
7.	  al.add("kamalesh");  
8.	  ArrayList<String> al2=new ArrayList<String>();  
9.	  al2.add("cyril");  
10.	  al2.add("sabari");  
11.	  
12.	  al.retainAll(al2);  
13.	  
14.	  System.out.println("iterating the elements after retaining the elements of al2...");  
15.	  Iterator itr=al.iterator();  
16.	  while(itr.hasNext()){  
17.	   System.out.println(itr.next());  
18.	  }  
19.	 }  
20.	}  
