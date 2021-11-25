package com.example.deliverynow;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SupportCommActivity extends AppCompatActivity
{
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.support_comment_activity);
        }


    public void click_btn_back(View view)
    {
        ImageView button = (ImageView) findViewById(R.id.btn_back);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(SupportCommActivity.this, HomeActivity.class));
            }
        });
    }
}
