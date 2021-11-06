package fr.tandjigora.a4inshield;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class SpaceChose extends AppCompatActivity {

    Button mButtonParents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_chose);
        mButtonParents = findViewById(R.id.space_chose_parent_button);

        mButtonParents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpaceChose.this, Bienvenu.class);
                startActivity(intent);
            }
        });

    }
}