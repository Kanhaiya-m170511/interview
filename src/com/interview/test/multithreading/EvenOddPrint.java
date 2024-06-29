package com.interview.test.multithreading;

public class EvenOddPrint {
    public static void main(String[] args) throws Exception{
        Runnable r1 = ()->{
            for(int i = 1 ; i < 10 ; i++){
                if( i % 2 != 0)System.out.println(i);
            }
           // System.out.println("Hii");
        };
        Runnable r2 = ()->{
            for(int i = 1 ; i < 10 ; i++){
                if( i % 2 == 0)System.out.println(i);
            }
            //System.out.println("Hello");
        };
        Thread th1 = new Thread(r1);
        th1.start();
        Thread.sleep(1000);
        Thread th2 = new Thread(r2);

        th2.start();
        Thread.sleep(1000);
    }


}

