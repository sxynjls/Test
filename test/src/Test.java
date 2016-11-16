import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by sunxuyang on 16/11/16.
 */
public class Test {
    private Timer timer;
    private int num;
    public Test(){
        this.timer = new Timer();

        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println(num);
                num = 0;

            }
        }, 1000, 2000);
    }

    public void add(int value){
        num += value;
    }


    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        while (true){
            Thread.sleep(500);
            test.add(4);
        }


    }
}
