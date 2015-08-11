/*
 * Copyright (c) 2012 Wireless Designs, LLC
 *
 * See the file license.txt for copying permission.
 */
package net.sseongsu.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import net.sseongsu.test.widget.TouchForwardLayout;

public class TouchForwardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TouchForwardLayout layout = new TouchForwardLayout(this);
		
		Button button = new Button(this);
		button.setText("You Can't Miss Me!");
		button.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Toast.makeText(getBaseContext(), "button", Toast.LENGTH_SHORT).show();

				return true;
			}
		});
		
		FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT, Gravity.CENTER);
		layout.addView(button, lp);
		setContentView(layout);
	}
}
