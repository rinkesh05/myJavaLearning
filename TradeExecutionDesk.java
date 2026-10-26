public class TradeExecutionDesk {
    public static void main(String[] args) {
        double assetPrice = 64250.00;
        double shortTermMovingAvg = 64100.00;
        double longTermMovingAvg = 64500.00;
        double accountRiskLimitPercent = 2.5;

        if (accountRiskLimitPercent > 5.0 || accountRiskLimitPercent <= 0.0) {
            System.out.println("Execution System Status: Halted. Risk ceiling threshold violation.");
        } else {
            if (shortTermMovingAvg > longTermMovingAvg) {
                if (assetPrice < shortTermMovingAvg) {
                    System.out.println("Execution Choice: Market Order BUY (Bullish Golden Cross Retest)");
                } else {
                    System.out.println("Execution Choice: Hold Position (Bullish Momentum Extension)");
                }
            } else {
                if (assetPrice > shortTermMovingAvg) {
                    System.out.println("Execution Choice: Trailing Limit SELL (Bearish Death Cross Relief)");
                } else {
                    System.out.println("Execution Choice: Emergency liquidation triggered.");
                }
            }
        }
    }
}
