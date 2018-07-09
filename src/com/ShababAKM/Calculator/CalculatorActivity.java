package com.ShababAKM.Calculator;
import java.util.*;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends Activity {
    /** Called when the activity is first created. */
	private Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btm,btp,btmu,btd,btc,btbs,bteq,btdo,btmp,btmr,btmi;
	private TextView tv;
	private boolean flag = true,flag2 = false;
	SharedPreferences sharedPref;

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
        btdo = (Button)findViewById(R.id.Bdo);
        btc = (Button)findViewById(R.id.Bc);
        btbs = (Button)findViewById(R.id.Bs);
        bteq = (Button)findViewById(R.id.Beq);
        btmp = (Button)findViewById(R.id.Bmp);
        btmr = (Button)findViewById(R.id.Bmr);
        tv = (TextView)findViewById(R.id.scr);
        bt0.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v)
        	{
        	   number(bt0.getText().toString());
        	}
         });
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt1.getText().toString());
         	}
          });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt2.getText().toString());
         	}
          });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt3.getText().toString());
         	}
          });
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt4.getText().toString());
         	}
          });
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt5.getText().toString());
         	}
          });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt6.getText().toString());
         	}
          });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt7.getText().toString());
         	}
          });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt8.getText().toString());
         	}
          });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	number(bt8.getText().toString());
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
                 		flag = true;
                 		flag2 = false;
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
             		flag = true;
             		flag2 = false;
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
             		flag = true;
             		flag2 = false;
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
             		flag = true;
             		flag2 = false;
            	}
         		
         	}
          });
        btdo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	String str = tv.getText().toString();
            	if(flag!=false)
            	{
            		String txt = tv.getText().toString()+ btdo.getText().toString();
             		tv.setText(txt);
             		flag = false;
             		flag2 = false;
            	}
         		
         	}
          });
        btc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
         		String txt = "0";
         		tv.setText(txt);
         	}
          });
        btmp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	if(tv.getText().toString()!="0")
            		writeInMemory(tv.getText().toString());
            	
         	}
          });
        btmr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	showValue(v);
         	}
          });
        btbs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	String str = tv.getText().toString();
            	flag2 = false;
            	//char c = str.charAt(str.length() - 1);
            	if(str.length()-1>0)
            	{
            		String txt = str.substring(0, str.length() - 1);
                 	tv.setText(txt);
            	}
            	else tv.setText("0");
         	}
          });
        
        bteq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
         	{
            	double answer = 0;
            	String str = tv.getText().toString();
            	answer = calc(str);
            	int ans;
            	if(flag2==true)
            		answer=answer+answer;
            	if(answer%1==0)
            		{
            		ans = (int)answer;
            		tv.setText(""+ans);
            		}
            	else	tv.setText(""+answer);
            	flag2=true;
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

    public static Double calc(String expression) {

        if (expression.startsWith("(") && expression.endsWith(")")) {
            return calc(expression.substring(1, expression.length() - 1));
        }
        String[] containerArr = new String[]{expression};
        double leftVal = getNextOperand(containerArr);
        expression = containerArr[0];
        if (expression.length() == 0) {
            return leftVal;
        }
        char operator = expression.charAt(0);
        expression = expression.substring(1);

        while (operator == '*' || operator == '/' || operator == '%') {
            containerArr[0] = expression;
            double rightVal = getNextOperand(containerArr);
            expression = containerArr[0];
            if (operator == '*') {
                leftVal = leftVal * rightVal;
            } 
            else if(operator == "%")
            else {
                leftVal = leftVal / rightVal;
            }
            if (expression.length() > 0) {
                operator = expression.charAt(0);
                expression = expression.substring(1);
            } else {
                return leftVal;
            }
        }
        if (operator == '+') {
            return leftVal + calc(expression);
        } else {
            return leftVal - calc(expression);
        }
    }
    private static double getNextOperand(String[] exp){
        double res;
        if (exp[0].startsWith("(")) {
            int open = 1;
            int i = 1;
            while (open != 0) {
                if (exp[0].charAt(i) == '(') {
                    open++;
                } else if (exp[0].charAt(i) == ')') {
                    open--;
                }
                i++;
            }
            res = calc(exp[0].substring(1, i - 1));
            exp[0] = exp[0].substring(i);
        } else {
            int i = 1;
            if (exp[0].charAt(0) == '-') {
                i++;
            }
            while (exp[0].length() > i && isNumber((int) exp[0].charAt(i))) {
                i++;
            }
            res = Double.parseDouble(exp[0].substring(0, i));
            exp[0] = exp[0].substring(i);
        }
        return res;
    }
    private static boolean isNumber(int c) {
        int zero = (int) '0';
        int nine = (int) '9';
        return (c >= zero && c <= nine) || c =='.';
    }
	private void number(String str)
	{
		String txt;
		if(tv.getText().toString()=="0")
			txt =  str;
		else	txt = tv.getText().toString()+ str;
		tv.setText(txt);
		flag2 = false;
	}
	public void writeInMemory(String v)
    {
    	try{
    		int vi = Integer.parseInt(v);
	    	sharedPref = this.getPreferences(Context.MODE_PRIVATE);
	    	SharedPreferences.Editor editor = sharedPref.edit();
	    	editor.putInt("memory", vi);
	    	editor.commit();
	    	
    	}
    	catch(Exception e){}
    }
	public int readFromMemory()
    {	try{
	    	sharedPref = this.getPreferences(Context.MODE_PRIVATE);
	    	int defaultValue = 0;
	    	int memValue = sharedPref.getInt("memory", defaultValue);
	    	return memValue;
    	}
    	catch(Exception e){
    		Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
    		return -1;
    	}
    }
	public void showValue(View v)
    {
		int memValue = readFromMemory();
    	String txt;
		if(tv.getText().toString()=="0")
			txt = ""+memValue;
		else	txt = tv.getText().toString()+ memValue;
		tv.setText(txt);
    }
	public void clear(View v)
    {
    	String value="0";
    	writeInMemory(value);
    	Toast.makeText(this,"cleared", Toast.LENGTH_SHORT);

    }
}
