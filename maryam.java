package LAB2;

class Lab1 extends Thread{
	public void run () {
		System.out.println("Task one");
	}
	public static void MAIN (String ARGS[]) {
		Lab1 t1=new Lab1();
		Lab1 t2=new Lab1();
		Lab1 t3=new Lab1();
		t1.start();
		t2.start();
		t3.start();
	}
}


public class maryam implements Runnable abrar  {

public static void main(String[] args) {

    final maryam testThr = new maryam();

    for(int i =1; i<=100; i++){
        Thread t1=new Thread(testThr);
        t1.start();
    }

}

@Override
public void run() {
    for(int i=1; 1<=10; i++) {
        sync(i);
    }
}

public synchronized void sync(int num){
    for (int i=1;i<=10;i++){
        System.out.println(i + "X" + num + ": "  +i*num  +Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }catch (Exception e) {}
    }
}
}
