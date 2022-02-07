public class CarsThread extends Thread{
    private Road road;

    public CarsThread(String threadName, Road road) {
        super(threadName);
        this.road = road;
    }

    public void run()
    {
        try {
            road.car=0;
            {
                for (int i=0;i<4;i++)
                {   road.car++;
                    System.out.println(Thread.currentThread().getName() + " ждут у светофора: " + road.car);
                    sleep(5000);}
                road.carsWait();
            }
        }catch (InterruptedException ie)
        {interrupt();}
    }
}
