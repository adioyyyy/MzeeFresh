package com.nexgen.mzeefresh;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_history);
        ListView listViewOrders = findViewById(R.id.listViewOrders);

// Sample history data for portfolio display
        String[] sampleOrders = {
                "Order #1001 - Fresh Tomatoes (50 kg) - Delivered",
                "Order #1002 - Organic Apples (30 kg) - Inspection Passed",
                "Order #1003 - Fresh Milk (100 L) - In Transit",
                "Order #1004 - Bananas (20 boxes) - Delivered"
        };

        android.widget.ArrayAdapter<String> adapter = new android.widget.ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                sampleOrders
        );

        listViewOrders.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}