package com.example.deliverynow;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class HomeActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    public void click_home_category_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.home_category_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(HomeActivity.this, CategoryActivity.class));
            }
        });
    }

    public void click_home_accept_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.home_accept_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(HomeActivity.this, AcceptActivity.class));
            }
        });
    }

    public void click_home_profile_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.home_ptofile_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
    }

    public void click_btn_comment(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.btn_comment);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(HomeActivity.this, SupportCommActivity.class));
            }
        });
    }

    public void click_btn_support(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.btn_support);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(HomeActivity.this, SupportCommActivity.class));
            }
        });
    }
}
