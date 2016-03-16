/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author carolina.caceres
 */
public class StandarDeviation {
    
    private double verySmall;
    private double small;
    private double medium;
    private double large;
    private double veryLarge;
    private double average;
    private double variance;

    //Obtiene el valor de la variable "VerySmall"
    public double getVerySmall() {
        return Math.pow(Math.E, (this.average - (2 * this.getStandardDeviation())));
    }

    //Asigna valor a la variable "VerySmall"
    public void setVerySmall(double verySmall) {
        this.verySmall = verySmall;
    }

    //Obtiene el valor de la variable "Small"
    public double getSmall() {
        return Math.pow(Math.E, (this.average - this.getStandardDeviation()));
    }
    
    //Asigna valor a la variable "Small("
    public void setSmall(double small) {
        this.small = small;
    }
    
    //Obtiene el valor de la variable "Medium"
    public double getMedium() {
        return Math.pow(Math.E, this.average);
    }
  
    //Asigna valor a la variable "Medium"
    public void setMedium(double medium) {
        this.medium = medium;
    }
 
    //Obtiene el valor de la variable "Large"
    public double getLarge() {
        return Math.pow(Math.E, (this.average + this.getStandardDeviation()));
    }
    
   //Asigna valor a la variable "Large"
    public void setLarge(double large) {
        this.large = large;
    }

    //Obtiene el valor de la variable "VeryLarge"
    public double getVeryLarge() {
        return Math.pow(Math.E, (this.average + (2 * this.getStandardDeviation())));
    }
     
   //Asigna valor a la variable "veryLarge"
    public void setVeryLarge(double veryLarge) {
        this.veryLarge = veryLarge;
    }
    
    //Obtiene el valor de la variable "average"
    public double getAverage() {
        return average;
    }

   //Asigna valor a la variable "average"
    public void setAverage(double average) {
        this.average = average;
    }

   //Obtiene el valor de la variable "variance"
    public double getVariance() {
        return variance;
    }
 
    //Asigna valor a la variable "variance"
    public void setVariance(double variance) {
        this.variance = variance;
    }
    
    // Metodo que retorna la desviacion estandar**
    public double getStandardDeviation() {
        return Math.sqrt(this.variance);
    }
}
