package com.ShababAKM.Calculator;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends Activity {
    /** Called when the activity is first created. */
	private Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btm,btp,btmu,btd,btc,btbs,bteq;
	private TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
        {
        	setContentView(R.layout.main);
        }
        else if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
        	setContentView(R.layout.landscape);
        }
        bt0 = (Button)findViewById(R.id.B0);
        bt1 = (Button)findViewById(R.id.B1);
        bt2 = (Button)findViewById(R.id.B2);
        bt3 = (Button)findViewById(R.id.B3);
        bt4 = (Button)findViewById(R.id.B4);
        bt5 = (Button)findViewById(R.id.B5);
        bt6 = (Button)findViewById(R.id.B6);
        bt7 = (Button)findViewById(R.id.B7);
        bt8 = (Button)findViewById(R.id.B8);
        bt9 = (Button)findViewById(R.id.B9);
        btm = (Button)findViewById(R.id.Bm);
        btp = (Button)findViewById(R.id.Bp);
        btmu = (Button)findViewById(R.id.Bmu);
        btd = (Button)findViewById(R.id.Bd);
        btc = (Button)findViewById(R.id.Bc);
        btbs = (Button)findViewById(R.id.Bs);
        bteq = (Button)findViewById(R.id.Beq);
        tv = (TextView)findViewById(R.id.scr);
        bt0.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v)
        	{
        		String txt = tv.getText().toString()+ bt0.getText().toString();
        		tv.setText(txt);
        	}
         });
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt1.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt2.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt3.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt4.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt5.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt6.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt7.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt8.getText().toString();
         		tv.setText(txt);
         	}
          });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = tv.getText().toString()+ bt9.getText().toString();
         		tv.setText(txt);
         	}
          });
        btp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	String str = tv.getText().toString();
            	if(str!=null)
            	{
            		char c = str.charAt(str.length() - 1);
                	if(c!='+' &&  c!='-'&& c!='*'&& c!='/')
                	{
                		String txt = tv.getText().toString()+ btp.getText().toString();
                 		tv.setText(txt);
                	}
            	}
         	}
          });
        btm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	String str = tv.getText().toString();
            	char c = str.charAt(str.length() - 1);
            	if(c!='+' &&  c!='-'&& c!='*'&& c!='/')
            	{
            		String txt = tv.getText().toString()+ btm.getText().toString();
             		tv.setText(txt);
            	}
         		
         	}
          });
        btmu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	String str = tv.getText().toString();
            	char c = str.charAt(str.length() - 1);
            	if(c!='+' &&  c!='-'&& c!='*'&& c!='/')
            	{
            		String txt = tv.getText().toString()+ btmu.getText().toString();
             		tv.setText(txt);
            	}
         		
         	}
          });
        btd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	String str = tv.getText().toString();
            	char c = str.charAt(str.length() - 1);
            	if(c!='+' &&  c!='-'&& c!='*'&& c!='/')
            	{
            		String txt = tv.getText().toString()+ btd.getText().toString();
             		tv.setText(txt);
            	}
         		
         	}
          });
        btc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = null;
         		tv.setText(txt);
         	}
          });
        btbs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	String str = tv.getText().toString();
            	if(str!=null)
            	{
            		char c = str.charAt(str.length() - 1);
                	String txt = str.substring(0, str.length() - 1);
             		tv.setText(txt);
            	}
         	}
          });
        bteq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	int answer = 0;
            	String input = tv.getText().toString();
            	if (input.contains("+")) { 
                    String[] numbers = input.split("\\+"); 
                    answer = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]); 
                } else if (input.contains("-")) { 
                    String[] numbers = input.split("-");
                    answer = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
                } else if (input.contains("/")) {
                    String[] numbers = input.split("/");
                    answer = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
                } else if (input.contains("*")) {
                    String[] numbers = input.split("\\*");
                    answer = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
                } 
            	//System.out.println(answer);
            	tv.setText(""+answer);
         		         	}
          });
    }

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	/*public void onsClick(View v)
	{
		String txt = tv.getText().toString()+ bt.getText().toString();
		tv.setText(txt);
	}*/
}
