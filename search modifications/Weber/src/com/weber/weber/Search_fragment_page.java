package com.weber.weber;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Search_fragment_page extends Fragment {
	private FragmentTabHost mTabHost;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View bts = inflater.inflate(R.layout.search_fragment_bottom_tabs,
				container, false);
		mTabHost = (FragmentTabHost) bts.findViewById(android.R.id.tabhost);
		mTabHost.setup(getActivity(), getChildFragmentManager(),
				R.id.realtabcontent);

		mTabHost.addTab(mTabHost.newTabSpec("Results").setIndicator("Results"),
				Fragment_results_search_tab.class, null);
		//
		mTabHost.addTab(mTabHost.newTabSpec("Queries").setIndicator("Queries"),
				Fragment_queries_search_tab.class, null);
		return bts;
	}
}
