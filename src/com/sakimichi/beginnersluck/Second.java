package com.sakimichi.beginnersluck;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Second extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.second);
	Button abby=(Button) findViewById(R.id.button2);
	TextView oink = (TextView) findViewById(R.id.textView1);
	oink.setText(getIntent().getExtras().getString("theText"));
	/*final String input = ((TextView) findViewById(R.id.textView2)).getText().toString();
	abby.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent meme2 = new Intent(Second.this, MainActivity.class);
			meme2.putExtra("aboy", input);
			startActivity(meme2);
			
			
		}
	});*/
	}
	
}
