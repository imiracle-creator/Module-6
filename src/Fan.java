public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (default values)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with parameters
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON [Speed: " + speedToString(speed) +
                    ", Radius: " + radius + ", Color: " + color + "]";
        } else {
            return "Fan is OFF [Radius: " + radius + ", Color: " + color + "]";
        }
    }

    // Helper method to convert speed to string
    private String speedToString(int speed) {
        String speedStr;
        switch (speed) {
            case SLOW:
                speedStr = "SLOW";
                break;
            case MEDIUM:
                speedStr = "MEDIUM";
                break;
            case FAST:
                speedStr = "FAST";
                break;
            default:
                speedStr = "STOPPED";
        }
        return speedStr;
    }
}

// This class contains the main method to test the Fan class
class FanTest {
    public static void main(String[] args) {
        // Creating fan with default constructor
        Fan fan1 = new Fan();

        // Creating fan with parameterized constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.5, "blue");

        // Displaying fan states
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

        // Demonstrating setters and getters
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8.0);
        fan1.setColor("green");

        System.out.println("Fan 1 after modification: " + fan1.toString());

        // Check individual fields
        System.out.println("Fan 1 Speed: " + fan1.getSpeed());
        System.out.println("Fan 1 isOn: " + fan1.isOn());
        System.out.println("Fan 1 Radius: " + fan1.getRadius());
        System.out.println("Fan 1 Color: " + fan1.getColor());
    }
}
