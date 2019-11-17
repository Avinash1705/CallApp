package com.example.call;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Navbar extends AppCompatActivity {
    DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mtoggle;
    NavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);
        mdrawerlayout=findViewById(R.id.drawer);
        mtoggle=new ActionBarDrawerToggle(this,mdrawerlayout,R.string.open,R.string.close);
        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nv=findViewById(R.id.navigation);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId() ;
                if(id==R.id.achieved_calls){
                    startActivity(new Intent(Navbar.this,AchievedCalls.class));

                }
                if(id==R.id.admin)
                {
                    startActivity(new Intent(Navbar.this,Admin.class));
                }

                return false;
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mtoggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    }

