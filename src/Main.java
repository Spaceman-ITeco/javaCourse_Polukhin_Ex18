public class Main {

    public static void main(String[] args) throws InterruptedException {

        new Thread("App-exit") {
            @Override
            public void run() {
                try {
                    //Увеличил до 40 секунд чтоб прошел полный цикл.
                    sleep(40000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }
        }.start();

        for (int i = 0;i<5;i++) {
            Road road = new Road();
            PeopleThread peopleThread = new PeopleThread("люди", road);
            CarsThread carsThread = new CarsThread("автомобили", road);
            peopleThread.start();
            peopleThread.join();
            carsThread.start();
            carsThread.join();
        }

    }
}
