package com.tnsif.dayeleven.v1;

public class ChildThread  extends Thread{
	private int n;
	private String msg;
	
	public ChildThread(int n,String msg) {
	this.n=n;
	this.msg=msg;
	
}
 public void run() {
 for (int i=1;i<=n;i++) {
	 try {
		 Thread.sleep(300);
       }catch (Exception e) {
    	   System.err.println("Thread interrupted:"+e.getMessage());
       }
	 System.out.println(msg +i +"  "+Thread.currentThread().getName());
        }
    }
 }
 

