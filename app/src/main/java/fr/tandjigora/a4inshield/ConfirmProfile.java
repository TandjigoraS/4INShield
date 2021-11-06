package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmProfile extends AppCompatActivity {

   private Button mButtonContinue;
    private Button mButtonAddNewProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_profile);

        mButtonContinue = findViewById(R.id.confirm_profile_continue_button);
        mButtonAddNewProfile = findViewById(R.id.confirm_profile_add_new_profile_button);

        mButtonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmProfile.this, AddChild.class);
                startActivity(intent);
            }
        });

        mButtonAddNewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmProfile.this, AddProfile.class);
                startActivity(intent);
            }
        });
    }
}