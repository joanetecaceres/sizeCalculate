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
public class ClassesInfo {
    
    private String className;
    private double loc;
    private double numberOfMethods;

    
    public ClassesInfo() {
    }
    
    public ClassesInfo(String className, double loc, double numberOfMethods) {
        this.className = className;
        this.loc = loc;
        this.numberOfMethods = numberOfMethods;
    }
 
    //Metodo que obtiene el valor de la propiedad "getClassName"
    public String getClassName() {
        return className;
    }
     
    //Metodo que asigna valor a la propiedad "setClassName"
    public void setClassName(String className) {
        this.className = className;
    }
            
    //Metodo que obtiene el valor de la propiedad "getLoc"
    public double getLoc() {
        return loc;
    }

    //Metodo que asigna valor a la propiedad "setLoc"
    public void setLoc(double loc) {
        this.loc = loc;
    }

    //Metodo que obtiene el valor de la propiedad "getNumberOfMethods"
    public double getNumberOfMethods() {
        return numberOfMethods;
    }

    //Metodo que asigna valor a la propiedad "setNumberOfMethods"
    public void setNumberOfMethods(double numberOfMethods) {
        this.numberOfMethods = numberOfMethods;
    }
     
    //Metodo que calcula el logaritmo natural de las lineas de codigo y numero de lineas de codigo por metodo   
    public double naturalLogarithmOfLocPerMethod() {
        return Math.log(this.loc / this.numberOfMethods);
    }
}
