package com.yoin.financeiro.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.yoin.financeiro.R;

public class CreditosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
    }

    public void openMenuFragment(View view) {

        Intent intent = new Intent(this, MenuFragment.class);
        startActivity(intent);
    }
}
