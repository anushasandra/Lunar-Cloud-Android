package com.weber.indexpage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.weber.weber.R;

public class fragment_index_search extends FragmentActivity {
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.fragment_index_search);
		ViewPager vp = (ViewPager) findViewById(R.id.viewPager);
		getActionBar().hide();
		vp.setAdapter(new mypageadapter(getSupportFragmentManager()));
	}

	class mypageadapter extends FragmentPagerAdapter {

		public mypageadapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int index) {
			// TODO Auto-generated method stub
			switch (index) {
			case 0:
				return new fragment_search_page();
			case 1:
				return new fragment_sign_in_page();
			case 2:
				return new fragment_add_on_page();

			default:
				return new fragment_search_page();
			}
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 3;
		}

	}
}
