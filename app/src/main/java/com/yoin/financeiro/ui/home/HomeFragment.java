package com.yoin.financeiro.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yoin.financeiro.Conciencia;
import com.yoin.financeiro.Despesa;
import com.yoin.financeiro.Planejamento;
import com.yoin.financeiro.R;
import com.yoin.financeiro.receita;

public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton imageButton1 = view.findViewById(R.id.imageButton);
        ImageButton imageButton2 = view.findViewById(R.id.imageButton2);
        ImageButton imageButton3 = view.findViewById(R.id.imageButton3);
        ImageButton imageButton4 = view.findViewById(R.id.imageButton4);


        imageButton1.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), receita.class);
            startActivity(intent);
        });

        imageButton2.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), Despesa.class);
            startActivity(intent);
        });

        imageButton3.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), Conciencia.class);
            startActivity(intent);
        });

        imageButton4.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), Planejamento.class);
            startActivity(intent);
        });
    }

}
