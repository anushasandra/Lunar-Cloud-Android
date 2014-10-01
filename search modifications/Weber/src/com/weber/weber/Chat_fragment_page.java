package com.weber.weber;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Chat_fragment_page extends Fragment {
	String[] name1;
	String[] time1;
	String[] paragraph1;
	int[] flag1;
	ListView list;
	msg_look_adapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View chat = inflater.inflate(R.layout.message_page_tab_s, container,
				false);

		name1 = new String[] { "Anusha", "Ram", "Ashok", "Navya", "Sri",
				"Susmitha", "Sahithya", "priyanka", "Dhepali", "Sahithya" };
		time1 = new String[] { "6:45 am", "7:08 pm", "8:09 am", "9:45 am",
				"1:56 am", "7:12 pm", "7:45 pm", "9:09 am", "10:05 pm",
				"10:05 pm" };
		paragraph1 = new String[] { "hiii hw r u", "iam fine wat abt u",
				"hi,wat ru dg", "helloo iam anusha", " hiii, good mrg",
				"heloooooo", "haiiiiiiii hw  r u ?", "fineeeee",
				"hiiiiiiiiiiiii", "hii, goodnite" };

		flag1 = new int[] { R.drawable.baby, R.drawable.baby, R.drawable.baby1,
				R.drawable.baby4, R.drawable.baby5, R.drawable.baby6,
				R.drawable.baby, R.drawable.baby6, R.drawable.sss,
				R.drawable.sss };
		list = (ListView) chat.findViewById(R.id.list_user_chat_page);
		list.setAdapter(new msg_look_adapter(getActivity(), name1, time1,
				paragraph1, flag1));
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent msgcmt = new Intent(getActivity(), list_comment.class);
				startActivity(msgcmt);
			}
		});
		return chat;
	}
}
