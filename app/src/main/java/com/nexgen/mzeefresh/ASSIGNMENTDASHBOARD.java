package com.nexgen.mzeefresh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ASSIGNMENTDASHBOARD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assignmentdashboard);
        Button buttonDeliveries = findViewById(R.id.buttonDeliveries);
        Button buttonInventory = findViewById(R.id.buttonInventory);
        Button buttonInspection = findViewById(R.id.buttonInspection);
        Button buttonHistory = findViewById(R.id.buttonHistory);

        buttonDeliveries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ASSIGNMENTDASHBOARD.this, DeliveriesActivity.class));
            }
        });

        buttonInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ASSIGNMENTDASHBOARD.this, InventoryActivity.class));
            }
        });

        buttonInspection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ASSIGNMENTDASHBOARD.this, QualityActivity.class));
            }
        });

        buttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ASSIGNMENTDASHBOARD.this, HistoryActivity.class));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}