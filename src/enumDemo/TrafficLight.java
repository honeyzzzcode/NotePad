package enumDemo;

public enum TrafficLight {
    RED {
        @Override
        public void printMessage() {
            System.out.println("Steady");
        }
    },
    YELLOW {
        @Override
        public void printMessage() {
            System.out.println("Ready");

        }
    },
    GREEN {
        @Override
        public void printMessage() {
            System.out.println("Go");
        }
    },
    BLUE {
        @Override
        public void printMessage() {
            System.out.println("Dont kow");
        }
    };

    public abstract void printMessage();
}

