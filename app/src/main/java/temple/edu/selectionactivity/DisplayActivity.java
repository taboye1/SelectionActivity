package temple.edu.selectionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class DisplayActivity extends AppCompatActivity {

    ////private RelativeLayout rootLayout;
    //private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        getSupportActionBar().setTitle("Display");
    }
}
        /*rootLayout = findViewById(R.id.displayCity);
        findViewById(R.id.closeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        int cityCode = intent.getIntExtra("cityCode",0);
        String cityName = intent.getStringExtra("cityName");

        ImageView imageView = findViewById(R.id.cityImage);
        imageView.setImageResource(cityCode);

    }
}*/

