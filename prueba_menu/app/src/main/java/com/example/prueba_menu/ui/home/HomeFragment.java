package com.example.prueba_menu.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.prueba_menu.R;
import com.example.prueba_menu.ui.controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    TabLayout tablayout;
    ViewPager viewPager;
    TabItem tab_bebidas, tab_postres,tab_platillos;
    PagerController pagerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        tablayout = root.findViewById(R.id.tab_layout);
        viewPager = root.findViewById(R.id.view_pager);
        tab_bebidas = root.findViewById(R.id.tab_bebidas);
        tab_postres = root.findViewById(R.id.tab_postres);
        tab_platillos = root.findViewById(R.id.tab_postres);

        pagerAdapter = new PagerController(getActivity().getSupportFragmentManager(), tablayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0){
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 1){
                    pagerAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 2){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
        return root;
    }
}