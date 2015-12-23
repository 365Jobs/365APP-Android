package com.lcujobs.lcujobs;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.lcujobs.lcujobs.dummy.ViewPagerAdapter;


public class MainActivity extends ActionBarActivity implements ActionBar.TabListener {

    private ViewPager mainViewPager;
    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViewPager();
        setUpTabs();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void setUpViewPager() {
        mViewPagerAdapter = new ViewPagerAdapter();

        mainViewPager = (ViewPager)findViewById(R.id.mainViewPager);
        mainViewPager.setAdapter(mViewPagerAdapter);
        mainViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                final android.app.ActionBar actionBar = getActionBar();
                assert actionBar != null;
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                switch(state) {
                    case ViewPager.SCROLL_STATE_IDLE:
                        //TODO
                        break;
                    case ViewPager.SCROLL_STATE_DRAGGING:
                        //TODO
                        break;
                    case ViewPager.SCROLL_STATE_SETTLING:
                        //TODO
                        break;
                    default:
                        //TODO
                        break;
                }
            }
        });
    }


    //初始化tab
    private void setUpTabs() {
        final android.app.ActionBar actionBar = getActionBar();
        for (int i = 0; i < mViewPagerAdapter.getCount(); ++i) {
            actionBar.addTab(actionBar.newTab()
                    .setText(mViewPagerAdapter.getPageTitle(i))
                    .setTabListener((android.app.ActionBar.TabListener) this));
        }
    }



    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
