package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CongratsWizardEnd_2 extends AppCompatActivity {
    private Button mButtonGoToDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats_wizard_end_2);
        mButtonGoToDashboard = findViewById(R.id.congrats_wizard_end_2_button);
           mButtonGoToDashboard.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(CongratsWizardEnd_2.this, ChildDashboard.class);
                startActivity(intent);
            }
        });

    }


}