package com.files.shoppie;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SearchView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment {
    ViewPager viewPager;
    LinearLayout sliderDots;
    int[] img = {R.drawable.bigbillion, R.drawable.offer};
    CircleIndicator circleIndicator;
    RecyclerView recyclerView, reCycleVIEW;
    List<Fruits> fruitsList = new ArrayList<>();
    List<Offerzone> offerzoneList = new ArrayList<>();
    CustomAdapter customAdapter;
    SearchView searchView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        sliderDots = view.findViewById(R.id.LinearL);
        viewPager = view.findViewById(R.id.viewPager);
        circleIndicator = view.findViewById(R.id.indicator);
        circleIndicator.createIndicators(2, 0);
        circleIndicator.animatePageSelected(0);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext(), img);
        viewPager.setAdapter(viewPagerAdapter);
        circleIndicator.setViewPager(viewPager);
        fruitsList.add(new Fruits("Fruits & Veg", R.drawable.frt));
        fruitsList.add(new Fruits("Meat", R.drawable.meat));
        fruitsList.add(new Fruits("Electronics", R.drawable.elec));
        fruitsList.add(new Fruits("Footwear", R.drawable.fw));
        recyclerView = view.findViewById(R.id.recycleView);
        LinearLayoutManager lm = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(lm);
        customAdapter = new CustomAdapter(getContext(), fruitsList, new CustomAdapter.update() {
            @Override
            public void click(int pos) {
                if (pos == 0) {
                    Intent intent = new Intent(getContext(), FruitsListActivity.class);
                    startActivity(intent);
                }

            }
        });
        recyclerView.setAdapter(customAdapter);
        reCycleVIEW = view.findViewById(R.id.reCycle2);
        offerzoneList.add(new Offerzone(R.drawable.sundayoffer));
        offerzoneList.add(new Offerzone(R.drawable.shoes));
        offerzoneList.add(new Offerzone(R.drawable.led_bulb));
        offerzoneList.add(new Offerzone(R.drawable.season_sale));
        LinearLayoutManager lm2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        reCycleVIEW.setLayoutManager(lm2);
        CustomAdapter2 customAdapter2 = new CustomAdapter2(getContext(), offerzoneList);
        reCycleVIEW.setAdapter(customAdapter2);
        return view;
    }

}