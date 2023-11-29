package com.example.applictest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_TRAMES = 4; // Définissez le nombre de trames souhaité
    private static final int NM_CHAMPS = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout = findViewById(R.id.gridLayout);

        // Ajoutez les titres des trames
        for (int i = 1; i <= NUM_TRAMES; i++) {
            // Titre de la trame
            TextView trameTitle = new TextView(this);
            trameTitle.setText("Trame " + i);
            GridLayout.Spec rowSpec = GridLayout.spec(i);
            GridLayout.Spec colSpec = GridLayout.spec(0);
            GridLayout.LayoutParams trameParams = new GridLayout.LayoutParams(rowSpec, colSpec);
            trameTitle.setLayoutParams(trameParams);
            gridLayout.addView(trameTitle);

            // Champs correspondants
            for (int j = 1; j <= NM_CHAMPS; j++) {
                EditText editText = new EditText(this);
                GridLayout.Spec editTextRowSpec = GridLayout.spec(i);
                GridLayout.Spec editTextColSpec = GridLayout.spec(j);
                GridLayout.LayoutParams editTextParams = new GridLayout.LayoutParams(editTextRowSpec, editTextColSpec);
                editText.setLayoutParams(editTextParams);
                editText.setInputType(android.text.InputType.TYPE_CLASS_NUMBER); // ajustez le type si nécessaire
                editText.setHint("Entrez la valeur");
                gridLayout.addView(editText);
            }
        }


    }
}
