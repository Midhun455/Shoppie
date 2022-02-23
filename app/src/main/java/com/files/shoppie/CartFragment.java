package com.files.shoppie;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;


public class CartFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    Toolbar toolbar;
    Spinner spinner;
    String[] quantity = {"Qty", "250", "500", "1Kg", "2Kg"};
    AppCompatButton appCompatButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        toolbar = view.findViewById(R.id.cartToolbar);
        spinner = view.findViewById(R.id.spin);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(getContext(), R.layout.support_simple_spinner_dropdown_item, quantity);
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        appCompatButton = view.findViewById(R.id.appCompatButton);
        appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddressActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
        if (pos == 0) {

        } else {
            Toast.makeText(getContext(), quantity[pos], Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}