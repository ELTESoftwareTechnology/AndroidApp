package com.damia.blackboxmed;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dataTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner_start = (Spinner) findViewById(R.id.spinner_start);
        Spinner spinner_upload = (Spinner) findViewById(R.id.spinner_upload);
        Spinner spinner_end = (Spinner) findViewById(R.id.spinner_end);

        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_measurements);
        dialog.setTitle("Choose which data to send");

        ArrayAdapter<CharSequence> adapter_start = ArrayAdapter.createFromResource(this,
                R.array.start_array, R.layout.spinner_layout);
        adapter_start.setDropDownViewResource(R.layout.spinner_item);
        spinner_start.setAdapter(adapter_start);

        ArrayAdapter<CharSequence> adapter_end = ArrayAdapter.createFromResource(this,
                R.array.end_array, R.layout.spinner_layout);
        adapter_end.setDropDownViewResource(R.layout.spinner_item);
        spinner_end.setAdapter(adapter_end);

        ArrayAdapter<CharSequence> adapter_upload = ArrayAdapter.createFromResource(this,
                R.array.upload_array, R.layout.spinner_layout);
        adapter_upload.setDropDownViewResource(R.layout.spinner_item);
        spinner_upload.setAdapter(adapter_upload);


        dataTypes = (TextView) findViewById(R.id.data_types_title);
        dataTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                dialog.show();
            }
        });

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            default:
                break;
        }
    }
}
