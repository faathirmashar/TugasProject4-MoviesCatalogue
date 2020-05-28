package com.faathir.tugasproject4.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.faathir.tugasproject4.R;
import com.faathir.tugasproject4.adapter.CastAndCrewAdapter;
import com.faathir.tugasproject4.repository.MovieRepository;

public class Detail extends AppCompatActivity {
    private Intent intent;
    private ImageView img_detail;
    private TextView title_detail, genre_detail, time_detail, director_detail, year_detail, description_detail;
    private RecyclerView recyclerView;
    private CastAndCrewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Detail Movie");

        recyclerView = findViewById(R.id.detail_recycler);
        adapter = new CastAndCrewAdapter();
        adapter.init(this, MovieRepository.getInstance().getData().get(position).getCastAndCrews());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        img_detail = findViewById(R.id.img_detail);
        title_detail = findViewById(R.id.title_detail);
        genre_detail = findViewById(R.id.genre_detail);
        time_detail = findViewById(R.id.time_detail);
        director_detail = findViewById(R.id.director_detail);
        year_detail = findViewById(R.id.year_detail);
        description_detail = findViewById(R.id.description_detail);

        Glide.with(this)
                .load(MovieRepository.getInstance().getData().get(position).getImgUrl())
                .into(img_detail);

        title_detail.setText(MovieRepository.getInstance().getData().get(position).getTitle());
        genre_detail.setText(MovieRepository.getInstance().getData().get(position).getGenre());
        time_detail.setText(MovieRepository.getInstance().getData().get(position).getTime());
        director_detail.setText(MovieRepository.getInstance().getData().get(position).getDirector());
        year_detail.setText(MovieRepository.getInstance().getData().get(position).getYear());
        description_detail.setText(MovieRepository.getInstance().getData().get(position).getDetail());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
