package wait_notify;

import java.util.ArrayList;
import java.util.List;

public class Producter implements Runnable{

    private List<String> list;

    public Producter(List<String> list){
        this.list = list;
    }
    public void producter(List<String> list){
            synchronized (list) {
                while (list.size() >= 5) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add("noob");
                System.out.println("now have"+list.size());
                list.notify();
            }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            producter(list);
        }
    }
}
