package com.weber.indexpage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.weber.weber.R;

public class fragment_add_on_page extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View addon = inflater.inflate(R.layout.fragment_search_ad_friends,
				container, false);
		return addon;
	}
}
