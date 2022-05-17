package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tg1;
ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tg1=(ToggleButton) findViewById(R.id.toggle);
         img=(ImageView) findViewById(R.id.imageView);
         img.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
         tg1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (tg1.isChecked()){
                     img.setImageDrawable(getResources().getDrawable(R.drawable.light_on));

                     Toast.makeText(MainActivity.this, "YOU SWITCHED ON", Toast.LENGTH_SHORT).show();
                 }
                 else {
                     img.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                     Toast.makeText(MainActivity.this, "YOU SWITCHED Off", Toast.LENGTH_SHORT).show();
                 }
             }
         });
    }
}