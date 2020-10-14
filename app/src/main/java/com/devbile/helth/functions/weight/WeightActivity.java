package com.devbile.helth.functions.weight;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.devbile.helth.MainActivity;
import com.devbile.helth.R;
import com.devbile.helth.utils.NavBar;

public class WeightActivity extends AppCompatActivity {

    private NavBar navBar;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_weight);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navBar = new NavBar();
        navBar.createNavbar(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return navBar.onOptionsSelected(item) || super.onOptionsItemSelected(item);
    }
}