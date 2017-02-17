package hw1.android.csulb.edu.hw1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void startOrderActivity(View view){
        Intent intent = new Intent(getApplicationContext(), OrderActivity1.class);
        startActivity(intent);
    }

}
