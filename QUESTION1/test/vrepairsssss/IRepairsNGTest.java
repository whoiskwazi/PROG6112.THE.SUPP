/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package vrepairsssss;

import vehiclerepairs.IRepairs;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import vehiclerepairs.Repairs;

/**
 *
 * @author ntokozoshinga
 */
public class IRepairsNGTest {
    
    public IRepairsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @Test
    public void testRepairCosts() {
        Repairs repairs = new Repairs();
        double[] repairCosts = {8000, 2500, 5000};
        double result = repairs.calculateTotalRepairs(repairCosts);
        assert result == 15500 : "Test Failed: Expected 15500, but got " + result;
    }

    @Test
    public void testTechnicianPay() {
        Repairs repairs = new Repairs();
        double result = repairs.calculateTechnicianPay(15500);
        assert result == 1550 : "Test Failed: Expected 1550, but got " + result;
    }

    @Test
    public void testTopTechnician() {
         
        Repairs repairs = new Repairs();
        double[][] repairsData = {
                {8000, 2500, 5000},
                {7000, 2200, 5600}
        };
        int result = repairs.findTopTechnician(repairsData);
        assert result == 0 : "Test Failed: Expected 0, but got " + result;
    
    }

//    public class IRepairsImpl implements IRepairs {
//
//        @Override
//        public double RepairCosts(double[] repairCosts) {
//            return 0.0;
//        }
//
//        @Override
//        public double TechnicianPay(double amount) {
//            return 0.0;
//        }
//
//        @Override
//        public int TopTechnician(double[] repairs) {
//            return 0;
//        }
//    }
    
}
