package com.juja.kortov.multithreading.task1;

/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
}

class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("My first thread");
    }
}