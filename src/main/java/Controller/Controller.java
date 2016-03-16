/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Calculation;
import Model.ClassesInfo;
import Model.LoadFile;
import Model.StandarDeviation;
import java.util.List;

/**
 *
 * @author carolina.caceres
 */
public class Controller {
    
    //Metodo que lee los datos de prueba del archivo.txt
    public List<ClassesInfo> loadClassInfo(String fileName) {
        return LoadFile.loadDataFromFile(fileName);
    }
    
    //Metodo que calcula la regresion lineal para listado de datos de prueba
    public StandarDeviation calculateSizeRange(List<ClassesInfo> classInfoList) {
        StandarDeviation objStandarDeviation = new StandarDeviation();
        objStandarDeviation.setAverage(Calculation.average(classInfoList));
        objStandarDeviation.setVariance(Calculation.variance(classInfoList));
        return objStandarDeviation;
    }
}
