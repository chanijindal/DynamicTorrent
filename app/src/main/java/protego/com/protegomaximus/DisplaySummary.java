package protego.com.protegomaximus;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by chanijindal on 10/03/15.
 */
public class DisplaySummary extends ActionBarActivity {

    TextView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_summary);

        summary = (TextView) findViewById(R.id.summaryText);


        String out = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader("sdcard/Summary.txt"));

            try {
                String line;
                while((line = reader.readLine())!=null)
                {
                    out = out + line + "\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            out = "Summary could not be generated";
            e.printStackTrace();
        }

        summary.setText(out);

    }



}
