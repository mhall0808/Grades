/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hallm8
 */
public class CreateCSV {

    private ArrayList<String> gradeItem = new ArrayList<>();

    public CreateCSV(ArrayList<String> item, String savePath) {

        FileWriter writer;

        try {
            gradeItem = item;

            writer = new FileWriter(new File(savePath + "\\Grade Export.csv"));

            writer.append("OrgDefinedId");
            writer.append(',');

            for (String singleItem : gradeItem) {
                writer.append(singleItem);
                writer.append(",");
            }

            writer.append("End-of-Line Indicator");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error!! Unable to write!");
        }

    }

}
