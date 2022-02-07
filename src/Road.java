public class Road {

    int person=0;
    int car=0;


    public synchronized void peopleWait() {
        try{ while (person<5)
        { wait();}
        person++;
            System.out.println("Светофор для пешеходов включен.");
            notify();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public synchronized void carsWait(){
        try{ while (car<4)
        {wait();}
        car++;
            System.out.println("Светофор для автомобилей включен.");
            notify();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
