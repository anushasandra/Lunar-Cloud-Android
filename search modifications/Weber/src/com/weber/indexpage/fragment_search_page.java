package com.weber.indexpage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.weber.guest_results.Guest_results_fragments;
import com.weber.weber.R;

public class fragment_search_page extends Fragment {
	public Button go;
	int position = 0;
	EditText et;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View searchresult = inflater.inflate(R.layout.fragment_search,
				container, false);
		go = (Button) searchresult.findViewById(R.id.button2);
		et = (EditText) searchresult.findViewById(R.id.search_bar);
		go.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final Dialog status = new Dialog(getActivity());
				status.setContentView(R.layout.customdialog);
				// status.setFeatureDrawableResource(set_position,
				// R.drawable.noti_dialog_icon);
				status.setTitle("Select Way of Showing Results");
				status.show();
				Button b = (Button) status.findViewById(R.id.ok_button);
				b.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						et.setText("");
						// TODO Auto-generated method stub
						String s1 = et.getText().toString();
						Intent go1 = new Intent(getActivity(),
								Guest_results_fragments.class);
						go1.putExtra("key", s1);
						startActivity(go1);
					}
				});

			}
		});

		return searchresult;
	}
}
