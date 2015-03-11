package protego.com.protegomaximus;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateLogFile {

public static StringBuilder logData= new StringBuilder();

    public static boolean makeFile(String filename,String text) {

        //SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        //String path = GlobalVariables.chosen_Dir;
        File logFile = new File("sdcard/"+filename);

        try {
            logFile.createNewFile();

            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile(),true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(text);
            bufferedWriter.close();
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;


        }
    }
}
