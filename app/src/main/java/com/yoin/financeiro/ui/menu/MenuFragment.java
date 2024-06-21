package com.yoin.financeiro.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.yoin.financeiro.R;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton imageButton1 = view.findViewById(R.id.imageButton7);
        ImageButton exitButton = view.findViewById(R.id.imageButton8);

        imageButton1.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), CreditosActivity.class);
            startActivity(intent);
        });

        exitButton.setOnClickListener(v -> showExitConfirmationDialog());
    }

    private void showExitConfirmationDialog() {
        new AlertDialog.Builder(requireContext())
                .setTitle("Sair do aplicativo")
                .setMessage("Deseja sair do aplicativo?")
                .setPositiveButton("Sim", (dialog, which) -> exitApp())
                .setNegativeButton("Não", null)
                .show();
    }

    private void exitApp() {
        if (getActivity() != null) {
            getActivity().finishAffinity();
        }
    }
}
