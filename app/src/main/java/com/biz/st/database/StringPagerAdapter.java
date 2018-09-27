package com.biz.st.database;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.biz.st.database.StringFragment;

import java.util.List;

public class StringPagerAdapter extends FragmentStatePagerAdapter {

    List<String> pageList;

    public StringPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public StringPagerAdapter(FragmentManager fm, List<String> pageList) {
        super(fm);
        this.pageList = pageList;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return pageList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return new StringFragment();
    }

    @Override
    public int getCount() {
        return pageList.size();
    }
}
