package top.lemenk;

public class ThreadTest3 extends Thread{
    private String ID;
    public ThreadTest3(String ID){
        this.ID = ID;
    }
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(ID + " is running " + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest3 h1 = new ThreadTest3("线程1");
        Thread demo1 = new Thread(h1);
        ThreadTest3 h2 = new ThreadTest3("线程2");
        Thread demo2 = new Thread(h2);
        demo1.start();
        demo2.start();
    }
}
