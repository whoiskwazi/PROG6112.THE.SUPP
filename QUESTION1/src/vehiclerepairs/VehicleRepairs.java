/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclerepairs;

/**
 *
 * @author ntokozoshinga
 */
public class VehicleRepairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // two-dimensional array decleration
        double[][] repairsData = {
                {8000, 2500, 5000},
                {7000, 2200, 5600}
        };
        //contructor
        Repairs repairs = new Repairs();
        repairs. displayRepairData(repairsData);
        System.out.println("\n");

        // Calculate and print the total vehicle repair amount for each vehicle repair technician
        for (int i = 0; i < repairsData.length; i++) {
            double totalRepairs = repairs.calculateTotalRepairs(repairsData[i]);
            System.out.println("Total vehicle repairs for " + repairs.getTechnicianName(i) + " = R" + totalRepairs );
        }
        System.out.println("\n");

        // Calculate commission
        for (int i = 0; i < repairsData.length; i++) {
            double totalRepairs = repairs.calculateTotalRepairs(repairsData[i]);
            double commission = repairs.calculateTechnicianPay(totalRepairs);
            System.out.println("Total commission for " + repairs.getTechnicianName(i) + " = R" + commission);
        }
         System.out.println("\n");
        // Display the top performing technician
        int topTechnician = repairs.findTopTechnician(repairsData);
        System.out.println("Top-performing Technician is " + repairs.getTechnicianName(topTechnician));

        
        
        
    }
    
}
