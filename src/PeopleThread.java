public class PeopleThread extends Thread{

    private Road road;

    public PeopleThread(String threadName, Road road) {
        super(threadName);
        this.road = road;
    }

    public void run()
    {
        try {
            road.person=0;
            {
                for (int i=0;i<5;i++)
                {   road.person++;
                    System.out.println(Thread.currentThread().getName() + " ждут у светофора: " + road.person);
                    sleep(2000);
                    }
                road.peopleWait();
            }
        }catch (InterruptedException ie)
        {interrupt();}
    }
}
