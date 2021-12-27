// package multithreading;

import java.util.*;


class myThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("t-1");
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        while(true) {
            System.out.println("t-2");
        }
    }
}
public class basic {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();

        t1.start();
        t2.start();
    }
}

