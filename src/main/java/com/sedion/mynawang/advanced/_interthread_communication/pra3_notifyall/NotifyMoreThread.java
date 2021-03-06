package com.sedion.mynawang.advanced._interthread_communication.pra3_notifyall;

/**
 * @auther mynawang
 * @create 2016-11-29 10:35
 */
public class NotifyMoreThread extends Thread {

    private Object lockObj;

    public NotifyMoreThread(Object lockObj) {
        super();
        this.lockObj = lockObj;
    }

    @Override
    public void run() {
        synchronized (lockObj) {
            lockObj.notify();
            lockObj.notify();
            lockObj.notify();
            lockObj.notify();
            lockObj.notify();
            lockObj.notify();
            lockObj.notify();
        }
    }
}
