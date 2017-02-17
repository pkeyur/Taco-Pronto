package hw1.android.csulb.edu.hw1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Queue;


public class OrderActivity1 extends AppCompatActivity{

    Item item;
    RadioButton selectedButton;
    RadioGroup sizeGroup;
    LinkedHashSet itemSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order1);

        sizeGroup = (RadioGroup) findViewById(R.id.radiogroup_size);
        itemSet = new LinkedHashSet();
    }

    protected void startOrder2Activity(View view){
        selectedButton = (RadioButton) findViewById(sizeGroup.getCheckedRadioButtonId());
        if(!itemSet.isEmpty()) {
            itemSet.clear();
        }
        Item item = new Item(selectedButton.getText(), null);
        itemSet.add(item);
        Intent intent = new Intent(getApplicationContext(), OrderActivity2.class);
        try {
            intent.putExtra("itemSet", itemSet);
            startActivity(intent);
        }
        catch (Exception e) {e.printStackTrace();}

    }
}
