package com.example.custom_simple_toast;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void simpleToastFunction(View view) {
        Toast.makeText(MainActivity.this, "this is simple Toast", Toast.LENGTH_LONG).show();
        textView.setText("this is simple Toast");
    }

    public void CustomToastFunction(View view) {

        View view1 = ((LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.message, null);
        LinearLayout layout = view1.findViewById(R.id.layout);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view1);
        toast.show();

        textView.setText("this is custom Toast");

    }
}
