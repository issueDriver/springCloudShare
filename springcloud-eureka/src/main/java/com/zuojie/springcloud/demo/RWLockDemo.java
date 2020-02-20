package com.zuojie.springcloud.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLockDemo {
    static Map<String,Object> cacheMap=new HashMap<>();

    static ReentrantReadWriteLock rw=new ReentrantReadWriteLock();

    static Lock rade=rw.readLock();

    static Lock write=rw.writeLock();

    //缓存的更新和读取

    public static final Object get(String key){
         rade.lock();
         try {
             return cacheMap.get(key);

         }finally {
             rade.unlock();
         }
    }
    public static final Object set(String key,Object value){
        write.lock();
        try {
            return cacheMap.put(key,value);

        }finally {
            write.unlock();
        }
    }

}
