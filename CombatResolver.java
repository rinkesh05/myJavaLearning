public class CombatResolver {
    public static void main(String[] args) {
        int attackerPower = 85;
        int defenderArmor = 40;
        String elementModifier = "Fire";
        boolean criticalHit = true;

        double finalDamage = attackerPower - (defenderArmor * 0.5);

        if (finalDamage <= 0) {
            System.out.println("Result: Attack deflected completely.");
        } else {
            if (elementModifier.equals("Fire") || elementModifier.equals("Water")) {
                finalDamage *= 1.5;
            } else if (elementModifier.equals("Earth")) {
                finalDamage *= 0.8;
            }

            if (criticalHit) {
                finalDamage *= 2.0;
                System.out.println("Critical Hit! Damage dealt: " + finalDamage);
            } else {
                System.out.println("Standard Hit. Damage dealt: " + finalDamage);
            }
        }
    }
}
