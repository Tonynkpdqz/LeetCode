package wait_notify;

import java.util.List;

public class Consumer implements Runnable{

    private List<String> list;

    public Consumer(List<String> list){
        this.list = list;
    }

    public void consume(List<String> list){

            synchronized (list) {
                while (list.size() <= 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String remove = list.remove(list.size() - 1);
                System.out.println(remove + " guns!");
                list.notify();
            }
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            consume(list);
        }

    }
}
