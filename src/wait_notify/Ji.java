package wait_notify;

public class Ji implements Runnable{

    MyInt a;

    public Ji(MyInt a) {
        this.a = a;
    }

    @Override
    public void run() {
        synchronized (a){
            while(a.a<10) {
                a.a++;
                System.out.println(a.a + "ji");
                try {
                    a.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                a.notify();


            }
        }
    }
}
