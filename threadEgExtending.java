package com.threading;

public class threadEgExtending {

    private static int counter = 0;

    static class CounterThread extends Thread {
        boolean isIncrement;

        public CounterThread(boolean isIncrement) {
            this.isIncrement = isIncrement;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                if (isIncrement) {
                    counter++;
                } else {
                    counter--;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CounterThread thread1 = new CounterThread(true); 
        CounterThread thread2 = new CounterThread(false);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final counter value: " + counter); 
    }
}