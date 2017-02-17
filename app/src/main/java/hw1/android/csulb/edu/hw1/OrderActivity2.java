package hw1.android.csulb.edu.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OrderActivity2 extends AppCompatActivity {

    RadioButton selectedButton;
    RadioGroup tortillaGroup;
    LinkedHashSet itemSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);

        tortillaGroup = (RadioGroup) findViewById(R.id.radiogroup_tortilla);
        itemSet = (LinkedHashSet) getIntent().getSerializableExtra("itemSet");
    }

    protected void startOrder3Activity(View view){
        selectedButton = (RadioButton) findViewById(tortillaGroup.getCheckedRadioButtonId());
        itemSet.add(new Item(selectedButton.getText(), null));
        Intent intent = new Intent(getApplicationContext(), OrderActivity3.class);
        intent.putExtra("itemSet",itemSet);
        startActivity(intent);
    }
}
