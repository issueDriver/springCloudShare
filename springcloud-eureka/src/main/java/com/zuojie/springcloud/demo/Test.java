package com.zuojie.springcloud.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test implements Runnable {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(1);
        for (int i=0 ;i<10;i++){
            service.submit(new Test());
        }
        service.shutdown();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}
