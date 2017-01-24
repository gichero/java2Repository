
public class MyThread extends Thread {

double count;

public MyThread(int mt){

count = mt;
for(int i=0; i<=mt; i++){


System.out.println(" Thread Running " + count);
}// close loop

}// close constructor

public static void main (String[] args){

MyThread mt = new MyThread(300); 

mt.start();

MyThread mt1 = new MyThread(250); 

mt1.start();


}// close main

}// close class
