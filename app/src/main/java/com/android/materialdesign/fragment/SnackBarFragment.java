package com.android.materialdesign.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.materialdesign.R;

public class SnackBarFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		final View v = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_snackbar,
				container, false);

		FloatingActionButton fab = (FloatingActionButton)v.findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(v.findViewById(R.id.coordinatorLayout), "I am a Snackbar", Snackbar.LENGTH_LONG).setAction("Action", new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Toast.makeText(getActivity(), "Snackbar Action", Toast.LENGTH_LONG).show();
					}
				}).show();
			}
		});

		return  v;
	}

}
