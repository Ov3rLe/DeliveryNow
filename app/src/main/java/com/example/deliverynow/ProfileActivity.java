package com.example.deliverynow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
    }

    public void click_profile_home_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.profile_home_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ProfileActivity.this, HomeActivity.class));
            }
        });
    }

    public void click_profile_category_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.profile_category_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ProfileActivity.this, CategoryActivity.class));
            }
        });
    }

    public void click_profile_accept_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.profile_accept_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(ProfileActivity.this, AcceptActivity.class));
            }
        });
    }
}
