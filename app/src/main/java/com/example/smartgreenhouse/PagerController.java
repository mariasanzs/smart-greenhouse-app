package com.example.smartgreenhouse;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerController extends FragmentStateAdapter {
    int numoftabs = 3;

    public PagerController(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return  new SensorFragment();
            case 1:
                return new ActuatorFragment();
            case 2:
                return new StatisticsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return numoftabs;
    }
}
