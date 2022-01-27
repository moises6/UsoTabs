package com.example.tapslayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tapslayout.Controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewpager;
TabItem tab1, tab2, tab3;
PagerController pagerController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewpager = findViewById(R.id.viewpage);

        tab1 = findViewById(R.id.tabla1);
        tab2 = findViewById(R.id.tabla2);
        tab3 = findViewById(R.id.tabla3);

        pagerController = new PagerController(getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setAdapter(pagerController);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerController.notifyDataSetChanged();

                }

                if (tab.getPosition() == 1) {
                    pagerController.notifyDataSetChanged();

                }
                if (tab.getPosition() == 2) {
                    pagerController.notifyDataSetChanged();
                }
            }

                    @Override
                    public void onTabUnselected (TabLayout.Tab tab){

                    }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}