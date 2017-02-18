package hw1.android.csulb.edu.hw1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.LinkedHashSet;

public class OrderActivity2 extends AppCompatActivity {

    RadioButton selectedButton;
    RadioGroup tortillaGroup;
    LinkedHashSet itemSet;
    Item item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);

        tortillaGroup = (RadioGroup) findViewById(R.id.radiogroup_tortilla);
        itemSet = (LinkedHashSet) getIntent().getSerializableExtra("itemSet");
        item = new Item(null, null);
    }

    protected void startOrder3Activity(View view){
        selectedButton = (RadioButton) findViewById(tortillaGroup.getCheckedRadioButtonId());

        if (itemSet.contains(item)) {
            itemSet.remove(item);
        }
        item.setItem_name(selectedButton.getText());
        itemSet.add(item);
        startNextActivity();
    }

    protected void startNextActivity() {
        Intent intent = new Intent(getApplicationContext(), OrderActivity3.class);
        intent.putExtra("itemSet", itemSet);
        startActivity(intent);
    }
}
