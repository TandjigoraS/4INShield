package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity {


    private TextInputLayout mUsername;
    private TextInputLayout mEmail;
    private TextInputLayout mPassword;
    private TextInputLayout mConfirmPassword;
    private Button mButtonSignIn;
    private String password;
    private static final Pattern EMAIL_ADDRESS
            = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mButtonSignIn = findViewById(R.id.sign_in_button);
        mUsername = findViewById(R.id.sign_in_userNameLyt);
        mPassword = findViewById(R.id.sign_in_passwordLyt);
        mConfirmPassword = findViewById(R.id.sign_in_confirmPasswordLyt);
        mEmail = findViewById(R.id.sign_in_emailLyt);



        mButtonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(confirmInput()){
                    Intent intent = new Intent(SignIn.this, SpaceChose.class);
                    startActivity(intent);
                };

            }
        });

    }

    private boolean validateConfirmPassword() {
        String confirmPassword = mConfirmPassword.getEditText().getText().toString().trim();
        if (confirmPassword.isEmpty() | !confirmPassword.equals(password)) {
            mConfirmPassword.setError("Please enter a identical password");
            return false;
        } else {
            mConfirmPassword.setError(null);
            return true;
        }


    }

    private boolean validatePassword() {
        password = mPassword.getEditText().getText().toString().trim();
        if (password.isEmpty() | password.length()<8) {
            mPassword.setError("Please enter a password of at least 8 character");
            return false;
        } else {
            mPassword.setError(null);
            return true;
        }

    }

    private boolean validateEmail() {
        String email = mEmail.getEditText().getText().toString().trim();
        Matcher matcher = EMAIL_ADDRESS.matcher(email);

        if (email.isEmpty() | !matcher.matches() ) {
            mEmail.setError("Please enter a valid email address");
            return false;
        } else {
            mEmail.setError(null);
            return true;
        }

    }


    private boolean validateUsername() {
        String username = mUsername.getEditText().getText().toString().trim();
        if (username.isEmpty()) {
            mUsername.setError("Please enter a username");
            return false;
        } else {
            mUsername.setError(null);
            return true;
        }

    }


    public boolean confirmInput() {
        if (validateEmail() && validateUsername() && validatePassword() && validateConfirmPassword()){
            return true;
        } else {
            return false;
        }


    }
}