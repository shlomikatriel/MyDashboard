package com.katriel.mydashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initializeControls();
	}

	private void initializeControls(){

		initializeListeners();
	}

	private void initializeListeners(){

	}
}
