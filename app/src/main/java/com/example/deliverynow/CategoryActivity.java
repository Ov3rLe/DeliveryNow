package com.example.deliverynow;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_activity);
    }

    public void click_category_home_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.category_home_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(CategoryActivity.this, HomeActivity.class));
            }
        });
    }

    public void click_category_profile_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.category_profile_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(CategoryActivity.this, LoginActivity.class));
            }
        });
    }

    public void click_category_accept_btn(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.category_accept_btn);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(CategoryActivity.this, AcceptActivity.class));
            }
        });
    }

    public void click_category_1(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.imageView18);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(CategoryActivity.this, AcceptActivity.class));
            }
        });
    }
}
