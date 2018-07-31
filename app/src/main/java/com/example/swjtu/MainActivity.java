package com.example.swjtu;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements affairsFragment.OnFragmentInteractionListener, infoFragment.OnFragmentInteractionListener, marketFragment.OnFragmentInteractionListener{

    private TabLayout mTabLayout;//TabLayout
    private ViewPager mViewPager;//ViewPager
    private Toolbar   mToolBar;  //ToolBar
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    List<Fragment> fragments;    //三个Fragments
    List<String>   titles;       //三个Fragments对应的Titles

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initViewPager();
    }


    private void initView() {
        mToolBar = findViewById(R.id.toolbar_main);//获取MainActivity中Toolbar的实例
        setSupportActionBar(mToolBar);//设置mToolbar使其显示
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView)findViewById(R.id.nav_view);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){//如果获取到ActionBar，那么加一个汉堡菜单的按钮
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.baseline_menu_white_24);
        }
        mNavigationView.setCheckedItem(R.id.nav_affairs);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_affairs:
                        break;
                    case R.id.nav_information:
                        break;
                    case R.id.nav_market:
                        break;
                    case R.id.nav_settings:
                        break;
                    case R.id.nav_about:
                        break;
                    default:
                        break;
                }
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }

    private void initViewPager() {
        mTabLayout = findViewById(R.id.tab_layout_main);
        mViewPager = findViewById(R.id.view_pager_main);
        //设置三个Title
        titles = new ArrayList<>();
        titles.add("校园办事");
        titles.add("消息通知");
        titles.add("跳蚤市场");
        //使用三个Title创建对应的Tab
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(1)));
        mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(2)));
        //创建三个Fragments
        fragments = new ArrayList<>();
        fragments.add(new affairsFragment());
        fragments.add(new infoFragment());
        fragments.add(new marketFragment());

        mViewPager.setOffscreenPageLimit(2);

        FragmentAdapter mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        mViewPager.setAdapter(mFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }


    public void onFragmentInteraction(Uri uri){

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Fragment ft = (Fragment) getSupportFragmentManager().findFragmentById(R.id.view_pager_main);
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (((infoFragment)fragments.get(1)).onBack()) {
                return true;
            }
            else {
                System.exit(0);     //退出程序
            }
        }
            return super.onKeyDown(keyCode, event);
    }

    //当创建菜单栏的时候
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_main,menu);//应用Toolbar的样式
        return true;
    }

    //当有项目被选中时
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.but_About:
                Toast.makeText(this,"You clicked About!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }


}
