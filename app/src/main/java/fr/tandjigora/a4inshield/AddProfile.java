package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddProfile extends AppCompatActivity {

    private Button mButtonNext;
    private Button mButtonSkip;
    private TextInputLayout mSocialNetworkPlatform;
    private TextInputLayout mSocialNetworkName;
    private TextInputLayout mSocialNetworkURL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);
        mSocialNetworkName = findViewById(R.id.socialNetworkNameLyt);
        mSocialNetworkPlatform = findViewById(R.id.socialNetworkPlatformLyt);
        mSocialNetworkURL = findViewById(R.id.socialNetworkUrlLyt);

        mButtonNext = findViewById(R.id.add_profile_next_button);
        mButtonSkip = findViewById(R.id.add_profile_skip_button);

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (confirmInput()) {
                    Intent intent = new Intent(AddProfile.this, ConfirmProfile.class);
                    startActivity(intent);
                }
            }
        });

        mButtonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddProfile.this, ConfirmProfile.class);
                startActivity(intent);
            }
        });
    }


    private boolean validateSocialNetworkPlatform() {
        String socialNetworkPlatform = mSocialNetworkPlatform.getEditText().getText().toString().trim();
        if (socialNetworkPlatform.isEmpty()) {
            mSocialNetworkPlatform.setError("Please enter a social network platform");
            return false;
        } else {
            mSocialNetworkPlatform.setError(null);
            return true;
        }


    }

    private boolean validateSocialNetworkName() {
        String socialNetworkName = mSocialNetworkName.getEditText().getText().toString().trim();
        if (socialNetworkName.isEmpty()) {
            mSocialNetworkName.setError("Please enter a name social network");
            return false;
        } else {
            mSocialNetworkName.setError(null);
            return true;
        }

    }

    private boolean validateSocialNetworkURL() {
        String socialNetworkURL = mSocialNetworkURL.getEditText().getText().toString().trim();
        Matcher matcher = Patterns.WEB_URL.matcher(socialNetworkURL);

        if (socialNetworkURL.isEmpty() | !matcher.matches() ) {
            mSocialNetworkURL.setError("Please enter a url social network");
            return false;
        } else {
            mSocialNetworkURL.setError(null);
            return true;
        }

    }

    public boolean confirmInput() {
        if (validateSocialNetworkName() && validateSocialNetworkPlatform() && validateSocialNetworkURL()){
            return true;
        } else {
            return false;
        }


    }
}