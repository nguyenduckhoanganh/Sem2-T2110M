package lap11part2;

public class Race {
    public static void main(String a[]) {
        RaseCar[] cars = new RaseCar[5];
        cars[0] = new RaseCar(10, "Mario");
        cars[1] = new RaseCar(10, "Songoku");
        cars[2] = new RaseCar(10, "Herman");
        cars[3] = new RaseCar(10, "Doremon");
        cars[4] = new RaseCar(10, "Hoang Phi Long");
        for (int i = 0; i < 5; i++)
            cars[i].start();
    }

}
