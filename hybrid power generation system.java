import java.util.Scanner;

public class HybridPowerGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter solar power generated (W): ");
        double solarPower = sc.nextDouble();

        System.out.print("Enter wind power generated (W): ");
        double windPower = sc.nextDouble();

        System.out.print("Enter load requirement (W): ");
        double load = sc.nextDouble();

        // Total hybrid power generation
        double totalPower = solarPower + windPower;

        System.out.println("\n--- Hybrid Power Generation System ---");
        System.out.println("Solar Power : " + solarPower + " W");
        System.out.println("Wind Power  : " + windPower + " W");
        System.out.println("Total Power : " + totalPower + " W");
        System.out.println("Load Demand : " + load + " W");

        if (totalPower >= load) {
            double excessPower = totalPower - load;
            System.out.println("Load demand is satisfied.");
            System.out.println("Excess Power: " + excessPower + " W");
            System.out.println("Excess power can be stored in a battery.");
        } else {
            double shortage = load - totalPower;
            System.out.println("Power generation is insufficient.");
            System.out.println("Power shortage: " + shortage + " W");
            System.out.println("Backup power is required.");
        }

        sc.close();
    }
}
