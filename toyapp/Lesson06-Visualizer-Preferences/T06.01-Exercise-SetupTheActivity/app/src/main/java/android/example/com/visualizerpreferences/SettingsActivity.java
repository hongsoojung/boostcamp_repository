package android.example.com.visualizerpreferences;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ///????????????????왜하는 거지 // Set the action bar back button to look like an up button
        //http://aroundck.tistory.com/2474
        ActionBar actionBar = this.getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDefaultDisplayHomeAsUpEnabled(true);
        }
    }

    /////////////////////////////?????????????????????
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home :
                // When the home button is pressed, take the user back to the VisualizerActivity
                NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}
