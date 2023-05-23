package sg.edu.rp.c346.id22015127.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById((R.id.textView));
        Intent intentReceived = getIntent();
        String mod = intentReceived.getStringExtra("string");
        if (mod == "c346"){
            tvAnswer.setText("Module Code: C346 \n Module Name: Android Programming \n Academic Year: 2020 \n Semester: 1 \n Module Credit: 4 \n Venue: W66M");
        }else{
            tvAnswer.setText("Module Code: C349 \n Module Name: iPad Programming \n Academic Year: 2020 \n Semester: 1 \n Module Credit: 4 \n Venue: W66M");
        }
    }
}