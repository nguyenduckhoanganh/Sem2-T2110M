package lap11part2;

class RaseCar extends Thread
{
    int finish;
    String name;
    RaseCar(int finish, String name) {
        this.finish = finish;
        this.name = name;
    }
        public void run(){
            for (int i = 0; i < finish; i++){
                System.out.println(name +": "+ (i+1)+"running...");
                try {
                    Thread.sleep(Math.round(Math.random()*5000));
                }
                catch(Exception e){}
            }
            System.out.println(name+" finished");
        }
}