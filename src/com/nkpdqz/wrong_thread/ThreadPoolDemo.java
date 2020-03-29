package com.nkpdqz.wrong_thread;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        /*executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    throw new RuntimeException();
                }catch (RuntimeException e){
                    System.out.println("asd");
                }
            }
        });*/
        Future<?> submit = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                throw new RuntimeException();
            }
        });
        System.out.println("as");
        /*try {
            System.out.println("here");
            //Object o = submit.get();
            //System.out.println(o.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/

    }


}
