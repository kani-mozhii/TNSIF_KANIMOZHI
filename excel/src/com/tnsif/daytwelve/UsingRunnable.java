package com.tnsif.daytwelve;

public class UsingRunnable {
	 public static void main(String[] args) {
    Thread thread;
    int high,low;
    String msg;
    
    public UsingRannable(int low,int high,String msg);
       this.high=high;
       this.low=low;
       this.msg=msg;
       thread=new Thread(this,"child Thread");
       thread.start();
       
}
}
@override
public void run() {
	for (int i=low;i<=high;i++) {
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("Error" +e.getMessage());
			
		}
		System.out.println(msg +i);
	}
}
