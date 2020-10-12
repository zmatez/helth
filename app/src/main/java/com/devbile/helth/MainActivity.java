package com.devbile.helth;

import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dLayout;
    private ActionBarDrawerToggle actionBarDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        dLayout = (DrawerLayout) findViewById(R.id.dLayout);
        actionBarDT = new ActionBarDrawerToggle(this, dLayout, R.string.Open, R.string.Close);
        actionBarDT.setDrawerIndicatorEnabled(true);

        dLayout.addDrawerListener(actionBarDT);
        actionBarDT.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int id = Item.getItemId();

                if (id == R.id.myprofile) {
                    Toast.makeText(MainActivity.this, "Mój Profil", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.settings) {
                    Toast.makeText(MainActivity.this, "Ustawienia", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.feedback) {
                    Toast.makeText(MainActivity.this, "Opinie :)", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return actionBarDT.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}