package com.example.pleerandroid1;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.pleerandroid1.databinding.FragmentSecondBinding;
import com.example.pleerandroid1.databinding.ItemlogoBinding;

import java.util.ArrayList;

public class AdapterMusic extends RecyclerView.Adapter<AdapterMusic.ViewHolderMusic> {

    private ArrayList<ModelForPlear> data;
    private OnClickListener listener ;

    public AdapterMusic(ArrayList<ModelForPlear> data, OnClickListener listener) {
        this.data = data;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolderMusic onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderMusic(ItemlogoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMusic holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(data.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(data.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    class ViewHolderMusic extends RecyclerView.ViewHolder {
        private ItemlogoBinding binding;


        public ViewHolderMusic(@NonNull ItemlogoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }

        public void bind(ModelForPlear modelForPlear) {

            binding.textForNumber.setText(String.valueOf(modelForPlear.getNumberMusic()));
            binding.musicPerson.setText((CharSequence) modelForPlear.getPersonName());
            binding.musicName.setText(modelForPlear.getMusicName());
            binding.timeMusic.setText(modelForPlear.getTimeMusic());
        }
    }
}
