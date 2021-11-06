package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bienvenu extends AppCompatActivity {

    private Button mButtonBievenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenu);
        mButtonBievenu = findViewById(R.id.bienvenu_button_start);

        mButtonBievenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bienvenu.this, AddDevice.class);
                startActivity(intent);
            }
        });
    }
}