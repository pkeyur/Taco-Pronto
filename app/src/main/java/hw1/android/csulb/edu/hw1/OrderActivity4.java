package hw1.android.csulb.edu.hw1;

import android.Manifest;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import hw1.android.csulb.edu.hw1.Extras.FunctionProvider;

import static hw1.android.csulb.edu.hw1.Extras.Constants.XML_FILEPATH;
import static java.security.AccessController.getContext;

public class OrderActivity4 extends AppCompatActivity {

    private static final int BEVERAGE_ITEMS = 4;

    private RelativeLayout beverages_layout;
    LinkedHashSet itemSet;
    CheckBox[] beverages = new CheckBox[BEVERAGE_ITEMS];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order4);

        beverages_layout = (RelativeLayout) findViewById(R.id.beverages);
        itemSet = (LinkedHashSet) getIntent().getSerializableExtra("itemSet");
    }

    protected void placeTheOrder(View view) {
        FunctionProvider.retrieveCheckboxes(beverages_layout, beverages, getApplicationContext());
        FunctionProvider.addDataToItemSet(beverages, itemSet);
        Intent intent = new Intent(getApplicationContext(), ConfirmationActivity.class);
        intent.putExtra("itemSet",itemSet);
        startActivity(intent);
    }
}
