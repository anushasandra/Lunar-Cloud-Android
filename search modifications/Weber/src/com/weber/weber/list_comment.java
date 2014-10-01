package com.weber.weber;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class list_comment extends FragmentActivity {
	List<String> li;
	ListView list;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		li = new ArrayList<String>();
		setContentView(R.layout.comment_list_view);
		final Button show = (Button) findViewById(R.id.button1_comment);
		final EditText et = (EditText) findViewById(R.id.editText1_comment);
		list = (ListView) findViewById(R.id.comments_page_data_frag);

		add();

		show.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				li.add(et.getText().toString());
				et.setText(null);
				add();
			}
		});

	}

	private void add() {
		// TODO Auto-generated method stub
		ArrayAdapter<String> adp = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.text_fragment, li);
		list.setAdapter(adp);
	}
}
