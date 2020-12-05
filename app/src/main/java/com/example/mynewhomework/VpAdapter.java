package com.example.mynewhomework;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class VpAdapter extends PagerAdapter {
    private List<View> list;
    private List<String>  mTitle;
    public VpAdapter(List<View> list,List<String> mTitle) {
        this.list=list;this.mTitle=mTitle;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
    @Override
    public Object instantiateItem(ViewGroup container,int position) {
         container.addView(list.get(position));
         return list.get(position);
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container,int position,@NonNull Object object) {
        container.removeView(list.get(position));
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
 }
