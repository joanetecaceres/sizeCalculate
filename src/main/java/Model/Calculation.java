/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author carolina.caceres
 */
public class Calculation {
     
    //Metodo que calcula el promedio
    public static double average(List<ClassesInfo> classInfoList) {
        double sumatoria = 0.0;
        for(ClassesInfo element : classInfoList) {
            sumatoria += element.naturalLogarithmOfLocPerMethod();
        }
        double listSize = (double)classInfoList.size();
        double average = sumatoria / listSize;
        return average;
    }
    
    //Metodo que calcula la varianza
    public static double variance(List<ClassesInfo> classInfoList) {
        double sumatoria = 0.0;
        double average = average(classInfoList);
        for(ClassesInfo element : classInfoList) {
            sumatoria += Math.pow((element.naturalLogarithmOfLocPerMethod() - average), 2.0);
        }
        double listSize = (double)classInfoList.size();
        double variance = sumatoria / (listSize - 1);
        return variance;
    }
}
