package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CongratsWizardEnd extends AppCompatActivity {


    private Button mButtonAnotherChild;
    private Button mButtonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats_wizard_end);

        mButtonAnotherChild = findViewById(R.id.congrats_wizard_end_add_another_child_button);
        mButtonContinue = findViewById(R.id.congrats_wizard_end_continue_button);

        mButtonAnotherChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CongratsWizardEnd.this, AddChild.class);
                startActivity(intent);
            }
        });

        mButtonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CongratsWizardEnd.this, CongratsWizardEnd_2.class);
                startActivity(intent);
            }
        });
    }


}