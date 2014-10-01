package com.weber.guest_results;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.weber.weber.R;
import com.weber.weber.list_comment;

public class Guest_results_adapter extends BaseAdapter {
	Context context;
	String[] name;
	String[] time;
	String[] paragraph;
	String[] location;
	int[] flag;
	LayoutInflater inflater;

	public Guest_results_adapter(Context context, String[] name, String[] time,
			String[] location, String[] paragraph, int[] flag) {
		this.context = context;
		this.name = name;
		this.time = time;
		this.location = location;
		this.paragraph = paragraph;
		this.flag = flag;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return name.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		TextView Name;
		TextView time1;
		TextView location1;
		ImageView imgperson;
		TextView paragraph1;
		TextView chat;
		TextView add;

		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View itemView = inflater.inflate(R.layout.guest_results_adapter, null);

		// Locate the TextViews in listview_item.xml
		Name = (TextView) itemView.findViewById(R.id.profile_name_result_page);
		time1 = (TextView) itemView
				.findViewById(R.id.time_textview_of_result_page);
		location1 = (TextView) itemView
				.findViewById(R.id.location_text_size_result_page);
		// Locate the ImageView in listview_item.xml
		imgperson = (ImageView) itemView
				.findViewById(R.id.profile_pic_result_page_id);
		paragraph1 = (TextView) itemView
				.findViewById(R.id.paragraph_text_result_page);
		chat = (TextView) itemView.findViewById(R.id.chat_id_guest_page);
		chat.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "You want to chat with him",
						Toast.LENGTH_LONG).show();
				Intent gue = new Intent(context, list_comment.class);
			}
		});
		add = (TextView) itemView.findViewById(R.id.add_id_guest_page);
		add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Added with you", Toast.LENGTH_LONG)
						.show();
			}
		});

		// Capture position and set to the TextViews
		Name.setText(name[position]);
		time1.setText(time[position]);
		location1.setText(location[position]);
		paragraph1.setText(paragraph[position]);

		// Capture position and set to the ImageView
		imgperson.setImageResource(flag[position]);

		return itemView;
	}

}
