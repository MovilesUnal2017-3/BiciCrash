package unal.edu.co.bicicrash.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.SupportMapFragment;


public class BiciMapFragment extends SupportMapFragment {


    public BiciMapFragment() {
        // Required empty public constructor
    }

    public static BiciMapFragment newInstance() {
        return new BiciMapFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = super.onCreateView(inflater, container, savedInstanceState);

        return root;
    }

}
