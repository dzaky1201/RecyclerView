package com.dzaky.cobarecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_HERO = "EXTRA_HERO";
    ImageView ivDetail;
    TextView tvName, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivDetail = findViewById(R.id.dtl_photo);
        tvName=findViewById(R.id.dtl_name);
        tvDescription=findViewById(R.id.dtl_description);
         Hero hero = getIntent().getParcelableExtra(EXTRA_HERO);

         assert hero != null;
        Glide.with(getApplicationContext())
                .load(hero.getPhoto())
                .into(ivDetail);

        tvName.setText(hero.getName());
        tvDescription.setText(hero.getFrom());
    }
}
