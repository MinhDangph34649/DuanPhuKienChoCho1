package com.example.duancho.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import fpoly.truongtqph41980.petshop.R;
import com.example.duancho.R;

public class frgNapTien extends Fragment {

    public frgNapTien() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frg_nap_tien, container, false);
    }
}