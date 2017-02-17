package hw1.android.csulb.edu.hw1.Extras;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.LinkedHashSet;

import hw1.android.csulb.edu.hw1.Item;

/**
 * Created by KEYUR on 14-02-2017.
 */

public class FunctionProvider {

    public static void retrieveCheckboxes(RelativeLayout layout, CheckBox[] item_array, Context context) {
        LinearLayout fillings_col1 = (LinearLayout) layout.getChildAt(0);
        LinearLayout fillings_col2 = (LinearLayout) layout.getChildAt(1);
        for(int i=0; i<fillings_col1.getChildCount();i++) {
            if(fillings_col1.getChildCount() == fillings_col2.getChildCount()) {
                item_array[i] = (CheckBox) fillings_col1.getChildAt(i);
                item_array[i + fillings_col1.getChildCount()] = (CheckBox) fillings_col2.getChildAt(i);
            }
            else {
                Toast.makeText(context, "Restart Application", Toast.LENGTH_LONG).show();
            }
        }
    }

    public static void addDataToItemSet(CheckBox[] item_array, LinkedHashSet itemSet) {
        for(int i=0; i<item_array.length; i++) {
            if(item_array[i].isChecked()){
                itemSet.add(new Item(item_array[i].getText(), null));
            }
        }
    }
}
