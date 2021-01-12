package com.demo.tab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MyTabLayout mTab;
    private ViewPager mVp;
    private ArrayList<Fragment> fragments;
    private Button mData;
    private ArrayList<String> strings;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mTab = (MyTabLayout) findViewById(R.id.tab);
        mVp = (ViewPager) findViewById(R.id.vp);

        strings = new ArrayList<>();
        fragments = new ArrayList<>();


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments, strings);
        mVp.setAdapter(viewPagerAdapter);
        mTab.setViewPager(mVp);


        mData = (Button) findViewById(R.id.data);
        mData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.data:
                /**
                 * 模拟网络请求
                 */
                // TODO 21/01/12
                strings.add("asdadad");
                fragments.add(new MyFragment());
                strings.add("是");
                fragments.add(new MyFragment());
                strings.add("打火锅服服帖帖一人一套");
                fragments.add(new MyFragment());
                strings.add("萨达萨达更好");
                fragments.add(new MyFragment());
                strings.add("是啥");
                fragments.add(new MyFragment());
                strings.add("矮冬瓜");
                fragments.add(new MyFragment());
                strings.add("恢复");
                fragments.add(new MyFragment());
                strings.add("规范化凤凰股份");
                fragments.add(new MyFragment());
                strings.add("萨瓦");
                fragments.add(new MyFragment());


                mTab.notifyDataSetChanged();
                viewPagerAdapter.notifyDataSetChanged();

                break;
            default:
                break;
        }
    }
}