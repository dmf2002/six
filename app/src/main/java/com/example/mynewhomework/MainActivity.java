package com.example.mynewhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BlankFragment blankFragment=new BlankFragment();
    private BlankFragment2 blankFragment2=new BlankFragment2();
    private ViewPager viewPager;
    private List<View> list=new ArrayList<>();
     private  List<String> mTitle=new ArrayList<>();
    public VpAdapter vpAdapter=new VpAdapter(list,mTitle);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.vp_demo);

        mTitle.add("页面一");
        mTitle.add("页面二");
         list.add(LayoutInflater.from(this).inflate(R.layout.fragment_blank,null,false));
         list.add(LayoutInflater.from(this).inflate(R.layout.fragment_blank2,null,false));
         viewPager.setAdapter(vpAdapter);
    }
}