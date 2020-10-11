package com.example.madt0621;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spCounterSelection;
    private EditText txtEnteredText;
    private TextView tvCharsCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtEnteredText = findViewById(R.id.txtEnteredText);
        this.tvCharsCount = findViewById(R.id.tvCharsCount);
        this.spCounterSelection = findViewById(R.id.spCounterSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCounterSelection.setAdapter(adapter);
        //this.tvMain = findViewById(R.id.tvMainLabel);
    }

    public void onBtnCountCharsClick(View view) {
        String spinnerSelection = spCounterSelection.getSelectedItem().toString();
        String charSelectionOption = getResources().getString(R.string.selection_chars);

        if(spinnerSelection.equalsIgnoreCase(charSelectionOption)) {
            String userEnteredText = this.txtEnteredText.getText().toString();
            int enteredTextLengthInChars = TextCounter.getCharsCount(userEnteredText);
            this.tvCharsCount.setText(String.valueOf(enteredTextLengthInChars));
        }
        else{
            Toast.makeText(this,"Not implemented", Toast.LENGTH_LONG).show();
        }
    }
}