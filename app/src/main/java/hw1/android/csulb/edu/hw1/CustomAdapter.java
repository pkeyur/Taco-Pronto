package hw1.android.csulb.edu.hw1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Created by KEYUR on 16-02-2017.
 */

public class CustomAdapter extends BaseAdapter {
    private LinkedHashSet<Item> itemSet;
    private ArrayList<String> item_names = new ArrayList<String>();
    private ArrayList<Double> item_prices = new ArrayList<Double>();;
    Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context, LinkedHashSet<Item> itemSet) {

        this.context = context;
        this.itemSet = itemSet;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        fillDataInArrays(itemSet);
    }

    @Override
    public int getCount() {
        return item_names.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.row_item, parent, false);
        }

        ViewHolder holder = new ViewHolder();
        holder.row_itemname = (TextView) convertView.findViewById(R.id.row_itemname);
        holder.row_itemprice = (TextView) convertView.findViewById(R.id.row_itemprice);
        convertView.setTag(holder);

        holder.row_itemname.setText(item_names.get(position));
        holder.row_itemprice.setText(String.valueOf(item_prices.get(position)));
        return convertView;
    }

    // View lookup cache
    private static class ViewHolder {
        TextView row_itemname;
        TextView row_itemprice;
    }

    void fillDataInArrays(LinkedHashSet itemSet) {
        for (Object object : itemSet) {
            Item item = (Item) object;
            try{
            item_names.add(item.getItem_name());
            item_prices.add(item.getItem_price());
            }
            catch(Exception e) {
            e.printStackTrace();}
        }
    }


}
