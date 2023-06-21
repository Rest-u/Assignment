/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encaptulation.LiveCoding;

/**
 *
 * @author Rest.u 22104410119
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encaptulation.LiveCoding;

/**
 *
 * @author Rest.u 22104410119
 */
import java.util.Scanner;

public class MainKinetic {
    double massa, kecepatan;
    
    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double EK(){
    double energiKinetik = 0.5 * massa * Math.pow(kecepatan, 2);
    return energiKinetik;
}
    
    public static void main(String[] args) {
        MainKinetic kinetic = new MainKinetic();
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ditanya =");
            System.out.println("EK = 0.5 * m * v = ?");
            System.out.println("Diketahui= ");
            
            System.out.println("massa benda (kg)= ");
            double massa = scanner.nextDouble();
            kinetic.setMassa(massa);
            
            System.out.println("kecepatan benda (m/s) = ");
            double kecepatan = scanner.nextDouble();
            kinetic.setKecepatan(kecepatan);
            
            double EK = kinetic.EK();
            
            System.out.println("Jawaban = ");
            System.out.println("Energi kinetik : "+ EK +" Joule");
        }
    }
