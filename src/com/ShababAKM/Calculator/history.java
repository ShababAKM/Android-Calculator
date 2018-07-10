package com.ShababAKM.Calculator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class history extends Activity {
	TextView tv;
	Button back;
	Intent in;
	String s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.phistory);
		tv = (TextView)findViewById(R.id.textView1);
		back = (Button) findViewById(R.id.button1);
		tv.setMovementMethod(new ScrollingMovementMethod());
		in= getIntent();
		s = in.getStringExtra("displayMsg");
		tv.setText(s);
	}
	
	public void goBack(View v)
	{
		Intent in = new Intent(this, CalculatorActivity.class);
		startActivity(in);
	}
	

}
