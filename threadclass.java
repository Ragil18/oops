1.	class Multi extends Thread{  
2.	public void run(){  
3.	System.out.println("thread is running...");  
4.	}  
5.	public static void main(String args[]){  
6.	Multi t1=new Multi();  
7.	t1.start();  
8.	 }  
9.	}  
