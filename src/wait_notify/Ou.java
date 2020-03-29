package wait_notify;

public class Ou implements Runnable{

    MyInt a;

    public Ou(MyInt a) {
        this.a = a;
    }

    @Override
    public void run() {
        synchronized (a){
            while(a.a<10) {
                a.a++;
                a.notify();
                System.out.println(a.a + "ou");
                try {
                    a.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //a.notify();


            }
        }
    }
}
