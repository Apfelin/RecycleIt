package com.example.test.recycleitmockup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddDropoffActivity extends AppCompatActivity {

    EditText metal;
    EditText plastic;
    EditText paper;
    TextView score;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dropoff);

        metal = findViewById(R.id.dropoff_metal_edit);
        plastic = findViewById(R.id.dropoff_plastic_edit);
        paper = findViewById(R.id.dropoff_paper_edit);
        score = findViewById(R.id.dropoff_score_edit);
        submit = findViewById(R.id.dropoff_add);

        metal.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                float before;
                float tmp;
                int res;

                tmp = Float.parseFloat(metal.getText().toString()) * 3;

                if (!TextUtils.isEmpty(score.getText())) {
                    before = Float.parseFloat(score.getText().toString());
                } else {
                    before = 0;
                }
                res = Math.round(tmp + before);
                score.setText(String.valueOf(res));
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {}
        });

        plastic.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                float tmp;
                float before;
                int res;

                tmp = Float.parseFloat(plastic.getText().toString()) * 2;
                if (!TextUtils.isEmpty(score.getText())) {
                    before = Float.parseFloat(score.getText().toString());
                } else {
                    before = 0;
                }
                res = Math.round(tmp + before);
                score.setText(String.valueOf(res));
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {}
        });

        paper.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                float tmp;
                float before;
                int res;

                tmp = Float.parseFloat(paper.getText().toString());
                if (!TextUtils.isEmpty(score.getText())) {
                    before = Float.parseFloat(score.getText().toString());
                } else {
                    before = 0;
                }
                res = Math.round(tmp + before);
                score.setText(String.valueOf(res));
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {}
        });

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.personal_stats, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
