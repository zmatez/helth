package com.devbile.helth.utils;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.devbile.helth.MainActivity;
import com.devbile.helth.R;
import com.devbile.helth.workInProgress.WorkInProgress;
import com.devbile.helth.functions.weight.WeightActivity;
import com.google.android.material.navigation.NavigationView;

public class NavBar {
    private DrawerLayout dLayout;
    private ActionBarDrawerToggle actionBarDT;


    public void createNavbar(final AppCompatActivity appCompatActivity){
        dLayout = (DrawerLayout) appCompatActivity.findViewById(R.id.dLayout);
        actionBarDT = new ActionBarDrawerToggle(appCompatActivity, dLayout, R.string.Open, R.string.Close);
        actionBarDT.setDrawerIndicatorEnabled(true);

        dLayout.addDrawerListener(actionBarDT);
        actionBarDT.syncState();

        appCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = (NavigationView) appCompatActivity.findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int id = Item.getItemId();

                if (id == R.id.myprofile) {
                    if(appCompatActivity.getClass() != MainActivity.class) {
                        Intent mainIntent = new Intent(appCompatActivity, MainActivity.class);
                        appCompatActivity.startActivity(mainIntent);
                        appCompatActivity.finish();
                    }
                }
                if (id == R.id.weight) {
                    if(appCompatActivity.getClass() != WeightActivity.class) {
                        Intent mainIntent = new Intent(appCompatActivity, WeightActivity.class);
                        appCompatActivity.startActivity(mainIntent);
                        appCompatActivity.finish();
                    }
                }
                else if (id == R.id.settings) {
                    if(appCompatActivity.getClass() != WorkInProgress.class) {
                        Intent mainIntent = new Intent(appCompatActivity, WorkInProgress.class);
                        appCompatActivity.startActivity(mainIntent);
                        appCompatActivity.finish();
                    }
                }
                else if (id == R.id.feedback) {
                    if(appCompatActivity.getClass() != WorkInProgress.class) {
                        Intent mainIntent = new Intent(appCompatActivity, WorkInProgress.class);
                        appCompatActivity.startActivity(mainIntent);
                        appCompatActivity.finish();
                    }
                }

                return false;
            }
        });
    }

    public boolean onOptionsSelected(MenuItem item){
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return actionBarDT.onOptionsItemSelected(item);
    }
}
