public class MyThread1{


public static void main(String[] args){

Thread t1 = new Thread (new Runnable() {

@Override
public void run() {

for(int i=0; i<=300; i++){

}
}
});

Thread t2 = new Thread (new Runnable() {

@Override
public void run() {

for(int i=0; i<=250; i++){

}
}
});

Thread t3 = new Thread (new Runnable() {


public void run() {

for(int i=0; i<=200; i++){

}
}
});

Thread t4 = new Thread (new Runnable() {

@Override
public void run() {

for(int i=0; i<=150; i++){

}
}
});

t1.start();
t2.start();
t3.start();
t4.start();

System.out.println(Thread.currentThread().getId() + " Thread Running " + i);




}//main




}// class