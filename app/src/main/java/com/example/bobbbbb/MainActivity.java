package com.example.bobbbbb;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonSubmit).setOnClickListener( v -> {
                String name = ((EditText)findViewById(R.id.editTextName)).getText().toString().trim();
                String surname = ((EditText)findViewById(R.id.editTextSurname)).getText().toString().trim();
                String email = ((EditText)findViewById(R.id.editTextEmail)).getText().toString().trim();
                String phone = ((EditText)findViewById(R.id.editPhone)).getText().toString().trim();
                String pass = ((EditText)findViewById(R.id.editPass)).getText().toString().trim();
                String check = ((EditText)findViewById(R.id.editPassCheck)).getText().toString().trim();

                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać imię",Toast.LENGTH_SHORT).show();
                }
                else if(surname.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać nazwisko",Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty()){
                    Toast.makeText(MainActivity.this, "Proszę wpisać email",Toast.LENGTH_SHORT).show();
                }
                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this, "Niepoprawny adres email",Toast.LENGTH_SHORT).show();
                }
                else if(phone.length() < 9) {
                    Toast.makeText(MainActivity.this, "Niepoprawny numer telefonu", Toast.LENGTH_SHORT).show(); //if na numer tel
                }
                else if(pass.length() < 6) {
                    Toast.makeText(MainActivity.this, "Hasło za krótkie", Toast.LENGTH_SHORT).show(); //if na numer tel
                }
                else if(!pass.equals(check)) {
                    Toast.makeText(MainActivity.this, "Hasła nie są takie same", Toast.LENGTH_SHORT).show(); //if na numer tel
                }
                else{
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie",Toast.LENGTH_SHORT).show();
                }

        });


    }


}
