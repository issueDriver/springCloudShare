package com.zuojie.springcloud.demo;

public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        //线程需要执行的任务
        System.out.println("线程执行任务");
    }
    //线程通过start来实现
    //如何销毁？run方法执行结束(销毁的过程由JVM实现)
    //思考问题：线程如何回收 达到重复利用
    public static void main(String[] args) {
        new Thread(new ThreadDemo()).start();//启动一个线程
    }

}
