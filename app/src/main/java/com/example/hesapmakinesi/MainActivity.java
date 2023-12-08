package com.example.hesapmakinesi;

import static com.example.hesapmakinesi.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.hesapmakinesi.R;
import org.mariuszgromada.*;
import org.mariuszgromada.math.mxparser.Expression;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    String[] gerial = {""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonLog = findViewById(id.buttonLog);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonSin = findViewById(id.buttonSin);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonCos = findViewById(id.buttonCos);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonX = findViewById(id.buttonX);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button button7 = findViewById(id.button7);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button button8 = findViewById(id.button8);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button button9 = findViewById(id.button9);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonMinus = findViewById(id.buttonMinus);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button button4 = findViewById(id.button4);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button5 = findViewById(id.button5);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button button6 = findViewById(id.button6);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonPlus = findViewById(id.buttonPlus);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button button1 = findViewById(id.button1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button button2 = findViewById(id.button2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button3 = findViewById(id.button3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonEquals = findViewById(id.buttonEquals);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button0 = findViewById(id.button0);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonMultiply = findViewById(id.buttonMultiply);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonDivide = findViewById(id.buttonDivide);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonXSquare = findViewById(id.buttonXSquare);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAC = findViewById(id.buttonAC);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonFactorial = findViewById(id.buttonFactorial);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonSquareRoot = findViewById(id.buttonSquareRoot);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})Button buttonPercent = findViewById(id.buttonPercent);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})TextView sonuc=findViewById(id.sonucText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})TextView sagp=findViewById(id.buttonsagpar);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})TextView solp=findViewById(id.buttonsolpar);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})TextView oncekiv=findViewById(id.geriall);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})TextView sil=findViewById(id.silme);
        int[] numericButtonIds = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9};

        for (int i = 0; i < numericButtonIds.length; i++) {
            final int finalI = i;

            findViewById(numericButtonIds[i]).setOnClickListener(v -> {
                String currentValue = sonuc.getText().toString();
                sonuc.setText(currentValue + String.valueOf(finalI + 1));
            });
        }
        buttonLog.setOnClickListener(View->{
            sonuc.setText(sonuc.getText()+"log2(");
        });
        button0.setOnClickListener(View->sonuc.setText(sonuc.getText()+"0"));
        sagp.setOnClickListener(View->sonuc.setText(sonuc.getText()+")"));
        solp.setOnClickListener(View->sonuc.setText(sonuc.getText()+"("));
        buttonSin.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"sin"));
        buttonCos.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"cos"));
        buttonX.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"*"));
        buttonMinus.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"-"));
        buttonPlus.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"+"));
        buttonMultiply.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"^2"));
        buttonDivide.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"/"));
        buttonXSquare.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"√"));
        buttonAC.setOnClickListener(View-> {
            gerial[0] = sonuc.getText().toString();
            sonuc.setText("");
        });
        buttonFactorial.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"!"));
        buttonSquareRoot.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"^"));
        buttonPercent.setOnClickListener(View-> sonuc.setText(sonuc.getText()+"/100"));
        oncekiv.setOnClickListener(View->{
            sonuc.setText(gerial[0]);

        });
        buttonEquals.setOnClickListener(View->{
            gerial[0] = sonuc.getText().toString();
            String expr=sonuc.getText().toString();
            Expression exp=new Expression(expr);
            String result=String.valueOf(exp.calculate());
            sonuc.setText(result);
        });
        sil.setOnClickListener(v -> {
            String currentText = sonuc.getText().toString();

            if (currentText.length() > 0) {
                String newText = currentText.substring(0, currentText.length() - 1);
                sonuc.setText(newText);
            }
        });
    }

}
