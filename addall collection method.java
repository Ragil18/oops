1.	import java.util.*;  
2.	class TestCollection4{  
3.	 public static void main(String args[]){  
4.	   
5.	  ArrayList<String> al=new ArrayList<String>();  
6.	  al.add("ragil");  
7.	  al.add("jacob");  
8.	  al.add("varun");  
9.	    
10.	  ArrayList<String> al2=new ArrayList<String>();  
11.	  al2.add("loeksh");  
12.	  al2.add("dibesh");  
13.	    
14.	  al.addAll(al2);    
15.	  
16.	  Iterator itr=al.iterator();  
17.	  while(itr.hasNext()){  
18.	   System.out.println(itr.next());  
19.	  }  
20.	 }  
21.	}  
