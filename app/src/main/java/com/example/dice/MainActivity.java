package com.example.dice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private Button roll;
private ImageView diceimageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.button_roll);
        diceimageView = findViewById(R.id.imageView);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNumber = random.nextInt(6) + 1;
                if(randomNumber == 1){
                    diceimageView.setImageResource(R.drawable.dice1);
                }
                else if (randomNumber == 2){
                    diceimageView.setImageResource(R.drawable.dice2);
                }else if (randomNumber == 3){
                    diceimageView.setImageResource(R.drawable.dice3);
                }else if (randomNumber == 4){
                    diceimageView.setImageResource(R.drawable.dice4);
                }else if (randomNumber == 5){
                    diceimageView.setImageResource(R.drawable.dice5);
                }else{
                    diceimageView.setImageResource(R.drawable.dice6);
                }


//                textView.setText(String.valueOf(randomNumber));

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}