package com.example.debilproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private EditText TicketNumber;

    private final PiterAlgorithm algorithm = new PiterAlgorithm();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("" + R.id.result + " " + R.id.checkTicketNumber + " "
                + R.id.textView + " " + R.id.ticketNumber);
        txtResult = findViewById(R.id.result);
        Button btnCheckTicket = findViewById(R.id.checkTicketNumber);
        TicketNumber = findViewById(R.id.ticketNumber);

        btnCheckTicket.setOnClickListener(listener);
    }

    private final View.OnClickListener listener = new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View view) {
            String number = TicketNumber.getText().toString();
            if (algorithm.isHappyTicketPiter(number)) {
                txtResult.setText(" Это счастливый билет! ");
            } else {
                int newHappyNumber = algorithm.nextHappyInt(number);
                txtResult.setText(" Это новый счастливый билет! " + newHappyNumber);
            }

        }
    };


}