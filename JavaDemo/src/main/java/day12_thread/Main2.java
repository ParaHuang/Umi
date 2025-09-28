package day12_thread;

import java.util.Calendar;

public class Main2 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while(true){
                    Calendar calendar = Calendar.getInstance();

                    System.out.println(
                            calendar.get(Calendar.YEAR)
                                    +"-"+(calendar.get(Calendar.MONTH)+1)
                                    +"-"+calendar.get(Calendar.DAY_OF_MONTH)
                                    +" "+calendar.get(Calendar.HOUR)
                                    +":"+calendar.get(Calendar.MINUTE)
                                    +":"+calendar.get(Calendar.SECOND)
                    );

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.start();
    }
}
