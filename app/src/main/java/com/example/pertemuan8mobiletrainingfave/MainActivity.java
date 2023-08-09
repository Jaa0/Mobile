package com.example.pertemuan8mobiletrainingfave;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pertemuan8mobiletrainingfave.fragments.CharacterFragment;
import com.example.pertemuan8mobiletrainingfave.fragments.FavoriteFragment;
import com.example.pertemuan8mobiletrainingfave.fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    Button btn_login,btn_regis,btn_register;
    BottomNavigationView bottomNavigationView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn_login = findViewById(R.id.btn_login);
    btn_regis = findViewById(R.id.btn_regis);
    btn_register= findViewById(R.id.btn_register);
    bottomNavigationView = findViewById(R.id.bottom_nav);
    initBottomNavigationView();
    btn_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            Toast.makeText(getApplicationContext(), "Pindah ke halaman login", Toast.LENGTH_SHORT)
                    .show();
            startActivity(intent);
        }
    });

        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                Toast.makeText(getApplicationContext(), "Pindah ke halaman Register", Toast.LENGTH_SHORT)
                        .show();
                startActivity(intent);
            }
        });

        }
        private void initBottomNavigationView(){
            bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    if ( item.getItemId()== R.id.home){
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeFragment()).commit();
                        return true;
                    } else if (item.getItemId() == R.id.characters){
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new CharacterFragment()).commit();
                        return true;
                    } else if (item.getItemId() == R.id.favorite) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new FavoriteFragment()).commit();
                        return true;
                    }
                    return false;
                }
            });
            bottomNavigationView.setSelectedItemId(R.id.home);

    }

}