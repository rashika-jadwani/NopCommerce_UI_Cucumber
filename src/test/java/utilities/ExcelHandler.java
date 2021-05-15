package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ExcelHandler {

    public ExcelHandler(String fileName){
        try{FileInputStream fis = new FileInputStream(fileName);}
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public ArrayList<ArrayList<String>> getDataFromExcel(){

        return null;
    }

}
