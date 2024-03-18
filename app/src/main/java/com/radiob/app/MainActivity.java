package com.radiob.app;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup radioGroup = findViewById(R.id.radioGroup);
        final CheckBox checkBoxEnjoyed = findViewById(R.id.checkBoxEnjoyed);
        final CheckBox checkBoxPrefer = findViewById(R.id.checkBoxPrefer);
        // Initialize more checkboxes here if needed

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(v -> {
            int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
            RadioButton radioButtonSelected = findViewById(selectedRadioButtonId);

            StringBuilder selections = new StringBuilder();
            selections.append("Selected Rating: ").append(radioButtonSelected.getText()).append("\n");

            if (checkBoxEnjoyed.isChecked()) {
                selections.append("I really enjoyed this lesson\n");
            }
            if (checkBoxPrefer.isChecked()) {
                selections.append("I will prefer this lesson to others\n");
            }
            // Add more checkboxes here if needed

            // Display selected options in Toast
            Toast.makeText(MainActivity.this, selections.toString(), Toast.LENGTH_LONG).show();
        });
    }
}
