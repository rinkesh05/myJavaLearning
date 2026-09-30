class Teleprinter {
    public void transmitData() {
        System.out.println("Transmitting standard text data via current loop.");
    }
}

class CryptographicTeletype extends Teleprinter {
    @Override
    public void transmitData() {
        System.out.println("Encrypting data stream before transmission.");
    }
}

public class tele {
    public static void main(String[] args) {
        Teleprinter oldTerminal = new Teleprinter();
        Teleprinter secureTerminal = new CryptographicTeletype();

        oldTerminal.transmitData();
        secureTerminal.transmitData();
    }
}
