package ru.netology;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup mainGroup = new ThreadGroup("main group");
        MyThread myThread1 = new MyThread("'Thread 1'");
        MyThread myThread2 = new MyThread("'Thread 2'");
        MyThread myThread3 = new MyThread("'Thread 3'");
        MyThread myThread4 = new MyThread("'Thread 4'");

        final Thread thread1 = new Thread(mainGroup, myThread1);
        final Thread thread2 = new Thread(mainGroup, myThread2);
        final Thread thread3 = new Thread(mainGroup, myThread3);
        final Thread thread4 = new Thread(mainGroup, myThread4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);
        mainGroup.interrupt();

    }
}
