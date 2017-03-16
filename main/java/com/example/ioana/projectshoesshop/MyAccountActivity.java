package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nikoleta on 3/12/2017.
 */

public class MyAccountActivity extends AppCompatActivity{

    private Button contactsButton;
    private Button homeButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);

        contactsButton = (Button) this.findViewById(R.id.contacts_account);
        homeButton = (Button) this.findViewById(R.id.home_account);
        settingsButton = (Button) this.findViewById(R.id.settings_account);

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAccountActivity.this, ContactsActivity.class);
                MyAccountActivity.this.startActivity(intent);
                finish();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAccountActivity.this, HomeActivity.class);
                MyAccountActivity.this.startActivity(intent);
                finish();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAccountActivity.this, SettingsActivity.class);
                MyAccountActivity.this.startActivity(intent);
                finish();
            }
        });
    }
}
