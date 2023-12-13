/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerepairs;

/**
 *
 * @author ntokozoshinga
 */
public class Repairs {
    //array decleration 
    private final String[] technicianNames = {"Joe Bloggs", "Jane Doe"};

    //method to display repair report
    public void displayRepairData(double[][] repairsData) {
        System.out.println("TECHNICIAN VEHICLE REPAIR REPORT\n\n");
        System.out.printf("\t\t\t%-20s%-20s%-20s\n", "JAN", "FEB", "MAR");
        System.out.println("-----------------------------------------------------------------------------------");
        for (int i = 0; i < repairsData.length; i++) {
            System.out.printf("%-20s", technicianNames[i]);
            for (int j = 0; j < repairsData[i].length; j++) {
                System.out.printf("R %-18.1f", repairsData[i][j]);
            }
            System.out.println();
        }
    }
    //method to calculate total repairs
    public double calculateTotalRepairs(double[] repairCosts) {
        double totalCost = 0;
        for (double cost : repairCosts) {
            totalCost += cost;
        }
        return totalCost;
    }

    public double calculateTechnicianPay(double amount) {
        return amount * 0.10;
    }
    //method to calculate to top performing technician
    public int findTopTechnician(double[][] repairs) {
        int topTechnician = 0;
        double maxRepair = 0;

        for (int i = 0; i < repairs.length; i++) {
            double totalRepairs = calculateTotalRepairs(repairs[i]);
            if (totalRepairs > maxRepair) {
                maxRepair = totalRepairs;
                topTechnician = i;
            }
        }

        return topTechnician;
    }

    public String getTechnicianName(int index) {
        return technicianNames[index];
    }

    public double RepairCosts(double[] repairCosts) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double TechnicianPay(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int TopTechnician(double[] repairs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
