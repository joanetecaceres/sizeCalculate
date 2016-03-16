import Controller.Controller;
import Model.ClassesInfo;
import Model.StandarDeviation;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    get("/size_Calculation_test", (req, res) -> {
        
        final String FILE_NAME_1 = "test1.txt";
        final String FILE_NAME_2 = "test2.txt";
        final String[] FILE_NAMES = {FILE_NAME_1, FILE_NAME_2};
        
        List<ClassesInfo> dataTest;
        Controller controller = new Controller();
        StandarDeviation result = new StandarDeviation();
        String dataString = "<p><br>";
        int count = 1;
        
        for(String fileName : FILE_NAMES) {            
            
            dataTest = controller.loadClassInfo(fileName);
            dataString += String.format("<b>Prueba</b> %d<br><br><table border=\"2\">", count);
            
            for(ClassesInfo classInfo : dataTest) {
                dataString += String.format("<tr><td>%s</td><td>%f</td><td>%f</td></tr>", classInfo.getClassName(), classInfo.getLoc(), classInfo.getNumberOfMethods());
            }
           
            dataString += "</table><br>";
            result = controller.calculateSizeRange(dataTest);
          
            if(count == 1) {
                dataString += String.format("<b><p>VS = %.5g%n LOC/Method<br>S =  %.5g%n LOC/Method<br>M = %.4g%n LOC/Method<br>L = %.4g%n LOC/Method<br>VL = %.4g%n LOC/Method<br></p></b>", result.getVerySmall(), result.getSmall(), result.getMedium(), result.getLarge(), result.getVeryLarge());

            }else {
                dataString += String.format("<b><p>VS = %.5g%n pages/Chapter<br>S =  %.5g%n pages/Chapter<br>M = %.4g%n pages/Chapter<br>L = %.4g%n pages/Chapter<br>VL = %.4g%n pages/Chapter<br></p></b>", result.getVerySmall(), result.getSmall(), result.getMedium(), result.getLarge(), result.getVeryLarge());
 
            }
            count++;
        }
        return dataString;
    });
    
  }

}