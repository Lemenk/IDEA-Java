package top.lemenk;

public class ThreadTest1 implements Runnable{
    private String ID;
    public ThreadTest1(String ID){
        this.ID = ID;
    }
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(ID + " is running " + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest1 h1 = new ThreadTest1("线程1");
        Thread demo1 = new Thread(h1);
        ThreadTest1 h2 = new ThreadTest1("线程2");
        Thread demo2 = new Thread(h2);
        demo1.start();
        demo2.start();
    }
}