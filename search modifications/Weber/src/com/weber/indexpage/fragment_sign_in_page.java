package com.weber.indexpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.weber.weber.R;
import com.weber.weber.Weber;

public class fragment_sign_in_page extends Fragment {
	private Button sign, signup;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View search = inflater.inflate(R.layout.fragment_search_sign_in,
				container, false);
		sign = (Button) search.findViewById(R.id.sign_signin);
		sign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent sear = new Intent(getActivity(), Weber.class);
				startActivity(sear);
			}
		});

		return search;
	}
}
