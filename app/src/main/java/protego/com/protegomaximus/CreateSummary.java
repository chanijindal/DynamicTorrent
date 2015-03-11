package protego.com.protegomaximus;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created by chanijindal on 11/03/15.
 */
public class CreateSummary {

    public static void appendText(String text)
    {
        File SummaryText = new File("sdcard/Summary.txt");


        try
        {
            //BufferedWriter for performance, true to set append to file flag
            SummaryText.createNewFile();
            BufferedWriter buf = new BufferedWriter(new FileWriter(SummaryText,true));
            buf.append(text);
            buf.flush();
            buf.newLine();
            buf.close();
        }
        catch (IOException e)
        {

            e.printStackTrace();
        }
    }
}
