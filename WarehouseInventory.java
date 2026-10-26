public class WarehouseInventory {
    public static void main(String[] args) {
        int currentStock = 12;
        int safetyStockLevel = 20;
        int itemsOnOrder = 15;
        boolean supplierHoliday = false;

        if (currentStock < 0 || safetyStockLevel < 0 || itemsOnOrder < 0) {
            System.out.println("Inventory Error: Quantities cannot be negative.");
        } else {
            if (currentStock <= safetyStockLevel) {
                if ((currentStock + itemsOnOrder) <= safetyStockLevel) {
                    if (supplierHoliday) {
                        System.out.println("Action Required: Extreme Low Stock. Alert alternate supply network.");
                    } else {
                        System.out.println("Action Required: Auto-triggering emergency restock order.");
                    }
                } else {
                    System.out.println("Action Required: Low stock, but existing pipeline order is sufficient.");
                }
            } else {
                if (currentStock > 100) {
                    System.out.println("Action Required: Excess stock detected. Pause regular production line.");
                } else {
                    System.out.println("Action Required: Stock levels optimal. No movement needed.");
                }
            }
        }
    }
}
