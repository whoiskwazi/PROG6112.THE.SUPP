/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vehiclerepairs;

/**
 *
 * @author ntokozoshinga
 */
public interface IRepairs {
    
    double RepairCosts(double[] repairCosts);
    double TechnicianPay(double amount); 
    int TopTechnician(double[] repairs);
    
}
