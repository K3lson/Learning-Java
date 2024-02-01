public class chargingBattery {

    // Constants
    private static final double BATTERY_CAPACITY = 35.8; // kWh
    private static final double VOLTAGE_SINGLE_PHASE = 230.0; // Volts
    private static final double VOLTAGE_THREE_PHASE = 400.0; // Volts
    private static final double SQRT_3 = Math.sqrt(3);
    private static final int[] CURRENTS_SINGLE_PHASE = {10, 16}; // Amperes for single-phase
    private static final int[] CURRENTS_THREE_PHASE = {16, 32}; // Amperes for three-phase

    public static void main(String[] args) {
        // Display the header
        System.out.println("Battery: " + BATTERY_CAPACITY + " (kWh)");
        System.out.println("Current(A) | Voltage(V) | Charging Power (kW) | Charging Time (h)");

        // Calculate and print the details for single-phase voltage
        for (int current : CURRENTS_SINGLE_PHASE) {
            printChargingDetails(current, VOLTAGE_SINGLE_PHASE, false);
        }

        // Calculate and print the details for three-phase voltage
        for (int current : CURRENTS_THREE_PHASE) {
            printChargingDetails(current, VOLTAGE_THREE_PHASE, true);
        }
    }

    private static void printChargingDetails(int current, double voltage, boolean isThreePhase) {
        double power = current * voltage * (isThreePhase ? SQRT_3 : 1); // Calculate power
        double chargingTime = BATTERY_CAPACITY / (power / 1000); // Calculate charging time (power converted to kW)
        chargingTime = Math.round(chargingTime * 100.0) / 100.0; // Round to two decimal places

        // Print the row
        System.out.printf("%-11s | %-10s | %-19s | %-16s\n",
                formatDecimal(current),
                formatDecimal(voltage),
                formatDecimal(power / 1000),
                formatDecimal(chargingTime));
    }

    // Helper method to format numbers to have at least one decimal point
    private static String formatDecimal(double number) {
        return number == (long) number ? String.format("%s.0", (long) number) : String.format("%s", number);
    }
}
