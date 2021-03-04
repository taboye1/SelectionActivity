package temple.edu.selectionactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.GridView;
import android.widget.TextView;


import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity {

    Spinner spinner;
    //ImageView imageView;
    //TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_selection);

        getSupportActionBar().setTitle("Selection");
        spinner = findViewById(R.id.spinner);
        

        String[] cityName = {"Miami", "Philadelphia", "Texas", "New York", "Los Angeles"};
        int[] cityCode = {R.drawable.miami, R.drawable.philadelphia, R.drawable.texas, R.drawable.new_york, R.drawable.los_angeles};
        ImageAdapter imageAdapter = new ImageAdapter(SelectionActivity.this, cityName, cityCode);


        spinner.setAdapter(imageAdapter);


        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                Intent intent = new Intent(SelectionActivity.this, DisplayActivity.class);
                intent.putExtra("cityCode", cityCode[i]);
                intent.putExtra("cityName", cityName[i]);
                startActivity(intent);
            }
        });
    }
}
