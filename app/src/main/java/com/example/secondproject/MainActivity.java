package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textView1;
    private EditText editText;
    private EditText editText1;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.text_view3);
        textView1 = findViewById(R.id.text_view1);
        editText = findViewById(R.id.edit_text1);
        editText1 = findViewById(R.id.edit_text2);
        textView2 = findViewById(R.id.text_view4);
        textView3 = findViewById(R.id.text_view5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = editText.getText().toString();
                String password = editText1.getText().toString();

                if (isValidCredentials(login, password)) {
                    showToast("Успешно прошли регистрацию!");
                    textView.setAlpha(0);
                    textView1.setAlpha(0);
                    editText.setAlpha(0);
                    editText1.setAlpha(0);
                    textView2.setAlpha(0);
                    textView3.setAlpha(0);
                } else {
                    showToast("Неправильный логин или пароль");
                }
            }
        });
    }

    private boolean isValidCredentials(String login, String password) {
        return login.equals("raimkulovnurislam095@gmail.com") && password.equals("502375939");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
