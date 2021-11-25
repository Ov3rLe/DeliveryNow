package com.example.deliverynow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_activity);
    }


    public void click_reg_log_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.reg_log_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        });
    }

    public void click_reg_home_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.reg_home_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(RegistrationActivity.this, HomeActivity.class));
            }
        });
    }

    public void click_reg_accept_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.reg_accept_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(RegistrationActivity.this, AcceptActivity.class));
            }
        });
    }

    public void click_reg_category_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.reg_category_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(RegistrationActivity.this, CategoryActivity.class));
            }
        });
    }

    public void click_reg_signyp_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.reg_signup_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(RegistrationActivity.this, ProfileActivity.class));
            }
        });
    }
}
