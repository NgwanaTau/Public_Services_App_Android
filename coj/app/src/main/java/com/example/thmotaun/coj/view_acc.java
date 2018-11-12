package com.example.thmotaun.coj;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by thmotaun on 2017/11/11.
 */

public class view_acc extends AppCompatActivity {

    private EditText Name;
    private EditText Surname;
    private EditText id_num;
    private EditText phone_num;
    private EditText email;
    private EditText pos_addr;
    private EditText passwrd1;

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
        setContentView(R.layout.view_acc);

        File file = new File("test_folder", "test.txt");
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String readin;
            while ((line = br.readLine()) != null) {
                readin = line.substring(4);
                text.append(readin);
                text.append('\n');
            }
            br.close();
        }
        catch (IOException e) {

        }

        final Button button = (Button) findViewById(R.id.button13);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Not Connected", Toast.LENGTH_LONG).show();
            }
        });
        /*Toast.makeText(view_acc.this, text, Toast.LENGTH_LONG).show();
        Name = (EditText)findViewById(R.id.name);
        Name.setText("", TextView.BufferType.EDITABLE);
        Surname = (EditText)findViewById(R.id.surname);
        Surname.setText("", TextView.BufferType.EDITABLE);
        id_num = (EditText)findViewById(R.id.id_num);
        id_num.setText("", TextView.BufferType.EDITABLE);
        phone_num = (EditText)findViewById(R.id.phone);
        phone_num.setText("Google is your friend.", TextView.BufferType.EDITABLE);
        email = (EditText)findViewById(R.id.email);
        email.setText("Google is your friend.", TextView.BufferType.EDITABLE);
        pos_addr = (EditText)findViewById(R.id.addr);
        pos_addr.setText("Google is your friend.", TextView.BufferType.EDITABLE);
        passwrd1 = (EditText)findViewById(R.id.pass);
        passwrd1.setText("Google is your friend.", TextView.BufferType.EDITABLE);*/
    }
}
