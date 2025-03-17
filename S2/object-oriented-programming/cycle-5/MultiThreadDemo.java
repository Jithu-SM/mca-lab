import java.util.Scanner;
class MultiplicationTable extends Thread{
	public void run(){
		System.out.println("\nMultiplication Table of 5:");
		for(int i=1;i<=10;i++){
			System.out.println("5 x "+i+" = "+(5*i));
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println("Multiplication thread interrupted.");
			}
		}
	}
}
class PrimeNumbers implements Runnable{
	private int N;
	public PrimeNumbers(int N){
		this.N=N;
	}
	public void run(){
		System.out.println("\nFirst "+N+" Prime Numbers:");
		int count=0,num=2;
		while(count<N){
			if(isPrime(num)){
				System.out.println(num+" ");
				count++;
				try{
					Thread.sleep(300);
				}catch(InterruptedException e){
					System.out.println("Prime number thread interrupted.");
				}
			}
			num++;
		}
		System.out.println();
	}
	private boolean isPrime(int num){
		if(num<2) return false;
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0) return false;
		}
		return true;
	}
}
public class MultiThreadDemo{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of prime numbers to display: ");
		int N=s.nextInt();
		s.close();
		MultiplicationTable multiplicationThread=new MultiplicationTable();
		Thread primeThread=new Thread(new PrimeNumbers(N));
		multiplicationThread.start();
		primeThread.start();
		try{
			multiplicationThread.join();
			primeThread.join();
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		System.out.println("\nBoth threads have completed execution.");
	}
}
