package hw1.android.csulb.edu.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import hw1.android.csulb.edu.hw1.Extras.FunctionProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import hw1.android.csulb.edu.hw1.Extras.FunctionProvider.*;

public class OrderActivity3 extends AppCompatActivity {

    private static final int FILLING_ITEMS = 10;
    CheckBox[] fillings = new CheckBox[FILLING_ITEMS];
    LinkedHashSet itemSet;
    RelativeLayout fillings_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order3);
        itemSet = (LinkedHashSet) getIntent().getSerializableExtra("itemSet");
        fillings_layout = (RelativeLayout) findViewById(R.id.fillings);
    }
    protected void startOrder4Activity(View view) {
        FunctionProvider.retrieveCheckboxes(fillings_layout, fillings, getApplicationContext());
        FunctionProvider.addDataToItemSet(fillings, itemSet);
        startNextActivity();
    }

    private void startNextActivity() {
        Intent intent = new Intent(getApplicationContext(),OrderActivity4.class);
        intent.putExtra("itemSet", itemSet);
        startActivity(intent);
    }
}
