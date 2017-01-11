package com.sedion.mynawang.advanced._lock.pra8_reentrantreadwritelock;

/**
 * @auther mynawang
 * @create 2017-01-11 16:39
 */
public class ThreadReadWriteMutexA extends Thread{

    private ReadWriteLock_ReadWriteMutex readWriteLock_readWriteMutex;

    public ThreadReadWriteMutexA(ReadWriteLock_ReadWriteMutex readWriteLock_readWriteMutex) {
        super();
        this.readWriteLock_readWriteMutex = readWriteLock_readWriteMutex;
    }

    @Override
    public void run() {
        readWriteLock_readWriteMutex.read();
    }
}
