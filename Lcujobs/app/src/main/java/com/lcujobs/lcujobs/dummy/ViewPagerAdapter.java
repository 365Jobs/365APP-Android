package com.lcujobs.lcujobs.dummy;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.lcujobs.lcujobs.CategoryFragment;
import com.lcujobs.lcujobs.JobNewsFragment;
import com.lcujobs.lcujobs.R;

import java.util.List;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class ViewPagerAdapter extends PagerAdapter {

    //两个索引常量
    private static final int TAB_INDEX_ONE = 0;
    private static final int TAB_INDEX_TWO = 1;


    //两个fragment  1.显示所有招聘信息 2.显示信息的所有类别
    private JobNewsFragment allNewsFragment = new JobNewsFragment();
    private CategoryFragment categoryFragment = new CategoryFragment();


    public ViewPagerAdapter() {

        super();
        // TODO Auto-generated constructor stub
    }


    public Fragment getItem(int position) {
        // TODO Auto-generated method stub
        switch (position) {
            case TAB_INDEX_ONE:
                return allNewsFragment;
            case TAB_INDEX_TWO:
                return categoryFragment;
        }
        throw new IllegalStateException("No fragment at position " + position);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return false;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String tabLabel = null;
        Activity activity = new Activity();
        switch (position) {
            case TAB_INDEX_ONE:
                tabLabel = activity.getString(R.string.catTab);
                break;
            case TAB_INDEX_TWO:
                tabLabel = activity.getString(R.string.catTab);
                break;
        }
        return tabLabel;
    }
}
