package MultiThread;


class Demo implements Runnable {
    Thread thread;

    Demo(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Demo2 implements Runnable {
    Thread thread;

    Demo2(String name){
        thread = new Thread(this, name);
        thread.start();
        thread.setPriority(10);
    }


    @Override
    public void run() {
        for (int i = 0; i >= -40; i--) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThread{
    public static void main(String[] args) {
        Demo demo = new Demo("Child #1");
        Demo2 demo2 = new Demo2("Child #2");
        try {
            demo.thread.join();
            demo2.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}