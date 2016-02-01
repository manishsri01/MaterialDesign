package com.android.materialdesign.fragment;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.materialdesign.R;

public class CollapsFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		View v = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_collspan,
				container, false);

		CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout)v.findViewById(R.id.collapsing_toolbar);
		collapsingToolbar.setTitle(getResources().getString(R.string.second_activity_text));

		return  v;
	}

}
