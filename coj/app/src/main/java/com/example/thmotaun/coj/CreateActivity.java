package com.example.thmotaun.coj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class CreateActivity extends AppCompatActivity {

    private Button Savebtn;
    private EditText Name;
    private EditText Surname;
    private EditText id_num;
    private EditText phone_num;
    private EditText email;
    private EditText pos_addr;
    private EditText passwrd1;
    private EditText passwrd2;

    String NameInput;
    String SurInput;
    String IDinput;
    String PhoneInput;
    String EmailInput;
    String Address;
    String PassInput;
    String Pass2input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        Savebtn = (Button)findViewById(R.id.create);
        Savebtn.setOnClickListener(new btnlistenersave());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private class btnlistenersave implements View.OnClickListener{
        public void onClick(View v) {


                    Toast.makeText(getApplicationContext(), "Not Connected", Toast.LENGTH_LONG).show();

           /* Name = (EditText)findViewById(R.id.name);
            Surname = (EditText)findViewById(R.id.surname);
            id_num = (EditText)findViewById(R.id.ID);
            phone_num= (EditText)findViewById(R.id.phone);
            email = (EditText)findViewById(R.id.email);
            pos_addr= (EditText)findViewById(R.id.addr);
            passwrd1 = (EditText)findViewById(R.id.password);
            passwrd2 = (EditText)findViewById(R.id.pass_conf);

            try {

                NameInput = Name.getText().toString();
                SurInput = Surname.getText().toString();
                IDinput = id_num.getText().toString();
                PhoneInput = phone_num.getText().toString();
                EmailInput = email.getText().toString();
                Address = pos_addr.getText().toString();
                PassInput = passwrd1.getText().toString();
                Pass2input = passwrd2.getText().toString();

                FileOutputStream outputStream;

                if (!NameInput.isEmpty() && !SurInput.isEmpty() && !IDinput.isEmpty() && !PhoneInput.isEmpty() && !EmailInput.isEmpty() && !Address.isEmpty()) {
                    if (isPasswordValid()) {
                        if (isEmailValid(EmailInput)) {
                            File path = new File(getFilesDir(), "test_folder");
                            if (!path.exists())
                            {
                                path.mkdir();
                            }
                            outputStream = openFileOutput("test.txt", Context.MODE_PRIVATE);
                            String writer = "Name: " + NameInput + "\nSurn: " + SurInput + "\nIDnu: " + IDinput + "\nPhne: " + PhoneInput + "\nMail: " + EmailInput + "\nAddr: " + Address + "\nPass: " + PassInput;
                            outputStream.write(writer.getBytes());
                            outputStream.close();
                        } else
                            Toast.makeText(CreateActivity.this, "Incorrect Email", Toast.LENGTH_LONG).show();
                    } else
                        Toast.makeText(CreateActivity.this, "Password Does Not Match", Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(CreateActivity.this, "Please Fill In All Fields", Toast.LENGTH_LONG).show();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            /* Intent i = new Intent(AddOrModify.this, Frontpage.class);
            startActivity(i);*/
        }
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPasswordValid() {
        return PassInput.length() > 4 && PassInput.equals(Pass2input) && (!PassInput.isEmpty() && !Pass2input.isEmpty());
    }
}

