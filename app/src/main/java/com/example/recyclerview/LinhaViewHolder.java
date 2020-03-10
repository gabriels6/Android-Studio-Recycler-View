package com.example.recyclerview;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;

public class LinhaViewHolder extends RecyclerView.ViewHolder {

    TextView txtNome;
    TextView txtCel;

    public LinhaViewHolder(@NonNull View itemView) {
        super(itemView);

        txtNome = itemView.findViewById(R.id.txtNome);
        txtCel = itemView.findViewById(R.id.txtCel);

    }
}
