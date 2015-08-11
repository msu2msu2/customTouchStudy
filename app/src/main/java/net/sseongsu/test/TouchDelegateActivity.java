/*
 * Copyright (c) 2012 Wireless Designs, LLC
 *
 * See the file license.txt for copying permission.
 */
package net.sseongsu.test;

import android.app.Activity;
import android.os.Bundle;

import net.sseongsu.test.widget.TouchDelegateLayout;

public class TouchDelegateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TouchDelegateLayout layout = new TouchDelegateLayout(this);
		setContentView(layout);
	}
}
