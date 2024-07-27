package lab_5;

public class Main implements Runnable{
	int sum   =  0 ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i   =0  ; i<=100 ;i++) {
			sum  += i  ;
		}
	}	
	
	public static void main(String[] args)  {
		Main  t1  = new Main() ;
		Thread t2 = new Thread(t1);
		
		t2.start(); 
	
		try {
			t2.join(); 
			
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		 System.out.println("Execution of thread is completed.");
		 System.out.println (" Sum of 1 to 100 i : " + t1.sum);
		
	}
}
