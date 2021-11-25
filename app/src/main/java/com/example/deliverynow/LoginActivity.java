package com.example.deliverynow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }


    public void click_log_accept_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.log_accept_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LoginActivity.this, AcceptActivity.class));
            }
        });
    }

    public void click_log_catregory_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.log_category_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LoginActivity.this, CategoryActivity.class));
            }
        });
    }

    public void click_log_home_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.log_home_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            }
        });
    }

    public void click_log_reg_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.login_reg_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
            }
        });
    }

    public void click_log_signup_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.login_signup_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(LoginActivity.this, ProfileActivity.class));
            }
        });
    }
}
