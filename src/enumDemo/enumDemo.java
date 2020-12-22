package enumDemo;

public class enumDemo {
    public static void main(String[] args) {
        TrafficLight tl1 = TrafficLight.GREEN;


        for (TrafficLight l : TrafficLight.values()) {

            System.out.println(l);


        }
        var color = "GREEN";
        var tl2 = TrafficLight.valueOf(color);
        System.out.println(tl2);

        switch (tl2){
            case RED:
                System.out.println("Steady!");
                break;
            case YELLOW:
                System.out.println("Ready!");
                break;
            case GREEN:
            System.out.println("Go!");
            break;
        }
        for (TrafficLight tl: TrafficLight.values()){
            tl.printMessage();
        }
    }
}

