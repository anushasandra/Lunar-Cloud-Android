package com.weber.weber;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:

			return new PostFragment();
		case 1:

			return new Search_fragment_page();
		case 2:

			return new Chat_fragment_page();
		case 3:

			return new NotificationsFragment();
		case 4:

			return new ProfileFragment();

		case 5:
			return new SettingFragment();
		}
		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 6;
	}

}
