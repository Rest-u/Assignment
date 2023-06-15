/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encaptulation.LiveCoding;

/**
 *
 * @author Rest.u 22104410119
 */
public class MainKinetic {
    double massa;
    double EK;
    double kecepatan = Math.pow(2, 2);

    public double getMassa() {
        return massa;}

    public void setMassa(double massa) {
        this.massa = massa;}

    public double getEK() {
        return EK = 0.5 * massa * kecepatan;}

    public void setEK(double EK) {
        this.EK = EK;}

    public double getKecepatan() {
        return kecepatan;}

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;}
    
    public static void main(String[] args) {
    MainKinetic kinetic = new MainKinetic();
    kinetic.setMassa(20);
        System.out.println("diket : ");
        System.out.println("kecepatan = 2 m/s ");
        System.out.println("massa = 20 kg ");
        System.out.println("ditanya = Energi Kinetic = 0.5 * m * v = ? ");
    System.out.println("hasilnya adalah : " + kinetic.getEK());
    }
}