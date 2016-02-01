package com.android.materialdesign.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.materialdesign.R;

public class FloatingFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		View v = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_floating,
				container, false);
		FloatingActionButton fab = (FloatingActionButton)v.findViewById(R.id.fab);

		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(getActivity(),"work in progress..",Toast.LENGTH_SHORT).show();
			}
		});

		return  v;
	}

}
