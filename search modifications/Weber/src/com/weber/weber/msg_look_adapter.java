package com.weber.weber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class msg_look_adapter extends BaseAdapter {
	Context context;
	String[] name1;
	String[] time1;
	String[] paragraph1;
	int[] flag1;
	LayoutInflater inflater;

	public msg_look_adapter(Context context, String[] name1, String[] time1,
			String[] paragraph1, int[] flag1) {
		this.context = context;
		this.name1 = name1;
		this.time1 = time1;
		this.paragraph1 = paragraph1;
		this.flag1 = flag1;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return name1.length;
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

		TextView Name1;
		TextView time2;
		ImageView imgperson2;
		TextView paragraph2;

		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View itemView = inflater.inflate(R.layout.msg_look, null);

		Name1 = (TextView) itemView
				.findViewById(R.id.msg_profile_name_result_page);
		time2 = (TextView) itemView
				.findViewById(R.id.msg_time_textview_of_result_page);

		// Locate the ImageView in listview_item.xml
		imgperson2 = (ImageView) itemView
				.findViewById(R.id.msg_profile_pic_result_page_id);
		paragraph2 = (TextView) itemView
				.findViewById(R.id.msg_paragraph_text_result_page);

		// Capture position and set to the TextViews
		Name1.setText(name1[position]);
		time2.setText(time1[position]);
		paragraph2.setText(paragraph1[position]);

		// Capture position and set to the ImageView
		imgperson2.setImageResource(flag1[position]);

		return itemView;
	}

}
