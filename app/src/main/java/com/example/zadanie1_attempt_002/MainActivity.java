package com.example.zadanie1_attempt_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView invitationText1, enteredText1;            // инициализация текстовых полей
    Button button1;                                    // инициализация кнопки
    String result;                                     // инициализация  строковых переменных

    private static final String TAG = "Zadanie1_Attempt002";  // - where we have to put this line, discuss with Dmitryi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enteredText1 = (TextView) findViewById(R.id.enteredText1);
        button1 = (Button) findViewById(R.id.button1);


        // Ниже обработчик события нажатия кнопки OnClickListener
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                       // enteredText1.setText("Кнопочка нажата");   // это проверка работы, потом закоментируем - работает

                // 1. Записываем значение текста в переменную -   стоп, а надо ли ??? - обсудить с Дмитрием.

                        String result = enteredText1.getText().toString();    // в принципе переменную можно бы ло и не запоминать

                // 2. Выводим Toast с введенным текстом.

                         Toast toast = Toast.makeText(MainActivity.this, enteredText1.getText(), Toast.LENGTH_LONG);
                         toast.show();

                // 3. Записываем Лог

                        Log.d(TAG, "log: Text had been entered ");

            }
        });

    }
}