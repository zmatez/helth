package com.devbile.helth.workInProgress;

import android.os.Bundle;
import android.view.MenuItem;
import com.devbile.helth.R;
import com.devbile.helth.utils.NavBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

public class WorkInProgress extends AppCompatActivity {
    private NavBar navBar;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_wip);

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