 public class Encapsulation {
    private int speed;

    public Encapsulation() {
        this.speed = 0;
    }

    // Getter method to safely access private data
    public int getSpeed() {
        return speed;
    }

    // Setter method to safely control and validate data changes
    public void setSpeed(int speed) {
        if (speed >= 0) { // Simple validation rule
            this.speed = speed;
        }
    }
}