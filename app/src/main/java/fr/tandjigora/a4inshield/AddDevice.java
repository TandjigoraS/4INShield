package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddDevice extends AppCompatActivity {

    private Button mButtonSkip;
    private Button mButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_device);

        mButtonSkip = findViewById(R.id.add_device_skip_button);
        mButtonNext = findViewById(R.id.add_device_next_button);

        mButtonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddDevice.this, AddProfile.class);
                startActivity(intent);
            }
        });

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddDevice.this, AddProfile.class);
                startActivity(intent);
            }
        });
    }

}