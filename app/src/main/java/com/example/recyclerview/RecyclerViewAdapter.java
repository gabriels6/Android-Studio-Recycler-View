package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<LinhaViewHolder> {

    private List<Contato> contato;

    public RecyclerViewAdapter(List <Contato> contato){
        this.contato = contato;
    }

    @Override
    public void onBindViewHolder(@NonNull LinhaViewHolder linhaViewHolder, int i) {
        if((contato != null) && (contato.size() != 0)){
            Contato itens = contato.get(i);

            linhaViewHolder.txtNome.setText(itens.getNome());
            linhaViewHolder.txtCel.setText(itens.getCel());

        }
    }


    @NonNull
    @Override
    public LinhaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.lista_contato, viewGroup, false);
        LinhaViewHolder viewHolder = new LinhaViewHolder(view);

        //retorna a tela montada
        return viewHolder;
    }




    @Override
    public int getItemCount() {
        return contato.size();
    }
}
