package com.weber.weber;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Fragment_results_search_tab extends Fragment {
	public Button getconnect;
	String[] name;
	String[] time;
	String[] location;
	String[] paragraph;

	int[] flag;
	public ListView list;
	Post_page_adapter adapter;
	public EditText search_box;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View qu = inflater.inflate(R.layout.fragment_user_search_page_tab,
				container, false);
		name = new String[] { "Rahul", "Karhik", "Srujan", "Dheepak", "Sri",
				"Susmitha", "Sahithya", "Rakesh", "Dhepali" };
		time = new String[] { "6:45", "7:08", "8:09", "9:45", "1:56", "7:12",
				"7:45", "9:09", "10:05" };
		location = new String[] { "Miyapur", "hydernagar", "nizampet",
				"kphpcolony", "htechcity", "bachupally", "jntu hyd",
				"nizampet", "kukatpally" };
		paragraph = new String[] {
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing" };
		flag = new int[] { R.drawable.image8, R.drawable.image5,
				R.drawable.image4, R.drawable.image2, R.drawable.image1,
				R.drawable.image7, R.drawable.image3, R.drawable.image9,
				R.drawable.sss };
		list = (ListView) qu
				.findViewById(R.id.list_of_items_data_for_results_search);
		search_box = (EditText) qu.findViewById(R.id.search_user_edit_text);
		getconnect = (Button) qu.findViewById(R.id.getconected);
		getconnect.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s1 = search_box.getText().toString();
				list.setAdapter(new Post_page_adapter(getActivity(), name,
						time, location, paragraph, flag));
			}
		});
		/*
		 * String s1 = search_box.getText().toString(); Intent search_item = new
		 * Intent(getActivity(), Fragment_queries_search_tab.class);
		 * search_item.putExtra("si", s1); startActivity(search_item); return
		 * qu;
		 */
		return qu;
	}
}
