package com.example.deliverynow;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AcceptActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accept_activity);
    }

    public void click_accept_home_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.accept_home_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(AcceptActivity.this, HomeActivity.class));
            }
        });
    }

    public void click_accept_category_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.accept_category_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(AcceptActivity.this, CategoryActivity.class));
            }
        });
    }

    public void click_accept_profile_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.accept_profile_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(AcceptActivity.this, LoginActivity.class));
            }
        });
    }
}
