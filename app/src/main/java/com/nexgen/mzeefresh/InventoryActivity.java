package com.nexgen.mzeefresh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inventory);
        EditText editTextItemName = findViewById(R.id.editTextItemName);
        EditText editTextQuantity = findViewById(R.id.editTextQuantity);
        Button buttonSaveItem = findViewById(R.id.buttonSaveItem);

        buttonSaveItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = editTextItemName.getText().toString();
                String itemQty = editTextQuantity.getText().toString();

                if(!itemName.isEmpty() && !itemQty.isEmpty()){
                    // Mock SQLite insertion for portfolio demonstration
                    android.widget.Toast.makeText(InventoryActivity.this, "Item Saved: " + itemName, android.widget.Toast.LENGTH_SHORT).show();
                    editTextItemName.setText("");
                    editTextQuantity.setText("");
                } else {
                    android.widget.Toast.makeText(InventoryActivity.this, "Please fill in all fields", android.widget.Toast.LENGTH_SHORT).show();
                }
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}