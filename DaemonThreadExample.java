package com.threading;

class MyDaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        MyDaemonThread daemonThread = new MyDaemonThread();
        daemonThread.setDaemon(true); // Set the thread as a daemon thread it should before start
        daemonThread.start();

//        try {
//            Thread.sleep(3000); // Main thread sleeps for 3 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Main thread is finished.");
    }
}
