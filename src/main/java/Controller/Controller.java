/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Calculation;
import Model.ClassesInfo;
import Model.LoadData;
import Model.SizeRange;
import java.util.List;

/**
 *
 * @author carolina.caceres
 */
public class Controller {
    
    public List<ClassesInfo> loadClassInfo(String fileName) {
        return LoadData.loadDataFromFile(fileName);
    }
    
    public SizeRange calculateSizeRange(List<ClassesInfo> classInfoList) {
        SizeRange sizeRange = new SizeRange();
        sizeRange.setAverage(Calculation.average(classInfoList));
        sizeRange.setVariance(Calculation.variance(classInfoList));
        return sizeRange;
    }
}
