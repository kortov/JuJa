package com.juja.kortov.multithreading.task3;

public class SpecialThread implements Runnable{
    @Override
    public void run() {
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
}
