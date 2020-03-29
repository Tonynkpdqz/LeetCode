package wait_notify;

public class Sold {

    static int ticket = 100;
    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (ticket>0){
                    synchronized (this){
                        ticket--;
                        System.out.println(ticket+" 1");
                    }

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (ticket>0){
                    synchronized (this){
                        ticket--;
                        System.out.println(ticket+" 2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (ticket>0){
                    synchronized (this){
                        ticket--;
                        System.out.println(ticket+" 3");
                    }
                }
            }
        }).start();
    }
}

