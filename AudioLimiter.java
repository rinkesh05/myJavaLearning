public class AudioLimiter {
    public static void main(String[] args) {
        double inputDecibels = 3.5;
        double ceilingDecibels = 0.0;
        String compressionMode = "Hard";
        boolean bypassProcessor = false;

        if (bypassProcessor) {
            System.out.println("Output Signal: " + inputDecibels + " dB (Processor Bypassed)");
        } else {
            if (inputDecibels > ceilingDecibels) {
                if (compressionMode.equals("Soft")) {
                    double reducedSignal = ceilingDecibels + ((inputDecibels - ceilingDecibels) * 0.25);
                    System.out.println("Output Signal: " + reducedSignal + " dB (Soft Knee Compression)");
                } else if (compressionMode.equals("Hard")) {
                    System.out.println("Output Signal: " + ceilingDecibels + " dB (Brickwall Clamped)");
                } else {
                    System.out.println("Output Signal: " + inputDecibels + " dB (Unknown compression logic)");
                }
            } else {
                if (inputDecibels < -60.0) {
                    System.out.println("Output Signal: -Infinity dB (Noise Gate Active)");
                } else {
                    System.out.println("Output Signal: " + inputDecibels + " dB (Pass-through)");
                }
            }
        }
    }
}
