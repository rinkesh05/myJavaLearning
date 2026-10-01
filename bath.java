class Bathyscaphe {
    public void descend() {
        System.out.println("Descending into the epipelagic zone using standard ballast ballast.");
    }
}

class DeepSeaBathyscaphe extends Bathyscaphe {
    @Override
    public void descend() {
        System.out.println("Descending into the Mariana Trench using reinforced syntactic foam.");
    }
}

public class bath {
    public static void main(String[] args) {
        Bathyscaphe standardVessel = new Bathyscaphe();
        Bathyscaphe deepVessel = new DeepSeaBathyscaphe();

        standardVessel.descend();
        deepVessel.descend();
    }
}
