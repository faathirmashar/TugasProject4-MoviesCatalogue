package com.faathir.tugasproject4.helper;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.faathir.tugasproject4.R;

public class CastAndCrewViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView textView;
    public CastAndCrewViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.cast_and_crew_img);
        textView = itemView.findViewById(R.id.cast_and_crew_title);
    }
}
