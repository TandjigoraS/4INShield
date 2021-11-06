package fr.tandjigora.a4inshield;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class AddChild extends AppCompatActivity {

    private TextInputLayout mFirstName;
    private TextInputLayout mLastName;
    private TextInputLayout mGender;
    private TextInputLayout mBirthDate;

    private Button mButtonSkip;
    private Button mButtonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child);

        mFirstName = findViewById(R.id.add_child_firstNameLyt);
        mGender = findViewById(R.id.add_child_genderLyt);
        mLastName = findViewById(R.id.add_child_lastNameLyt);
        mBirthDate = findViewById(R.id.add_child_BirthAgeLyt);
        mButtonSkip = findViewById(R.id.add_child_skip_button);
        mButtonNext = findViewById(R.id.add_child_next_button);



        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(confirmInput()){
                    Intent intent = new Intent(AddChild.this, CongratsWizardEnd.class);
                    startActivity(intent);
                }

            }
        });

        mButtonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    Intent intent = new Intent(AddChild.this, CongratsWizardEnd.class);
                    startActivity(intent);


            }
        });

    }

    private boolean validateFirstName() {
        String firstName = mFirstName.getEditText().getText().toString().trim();
        if (firstName.isEmpty()) {
            mFirstName.setError("Please enter a first name");
            return false;
        } else {
            mFirstName.setError(null);
            return true;
        }


    }

    private boolean validateLastName() {
        String lastName = mLastName.getEditText().getText().toString().trim();
        if (lastName.isEmpty()) {
            mLastName.setError("Please enter a last name");
            return false;
        } else {
            mLastName.setError(null);
            return true;
        }


    }

    private boolean validateGender() {
        String genderMale = "Male";
        String genderFemale = "Female";

        String gender = mGender.getEditText().getText().toString().trim();
        if (gender.equals(genderMale) | gender.equals(genderFemale) ) {
            mGender.setError("Please enter Male or Female");
            return false;
        } else {
            mLastName.setError(null);
            return true;
        }


    }



    private boolean validateBirthAge() {
        String birthDate = mBirthDate.getEditText().getText().toString().trim();
        if (birthDate.isEmpty()) {
            mBirthDate.setError("Please enter a valide birth date");
            return false;
        } else {
            mBirthDate.setError(null);
            return true;
        }

    }


    public boolean confirmInput() {
        if (validateFirstName() && validateLastName() && validateGender() && validateBirthAge()){
            return true;
        } else {
            return false;
        }


    }

}