package codepath.apps.tipcalculator;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculator extends Activity {
	TextView tvTip;
    Double amount;
	EditText tempbill;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		tvTip = (TextView) findViewById(R.id.tvTip);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}
 
	public void calculate20percent(View v) {
	   EditText tempbill = (EditText) findViewById(R.id.etbill);
	   amount = Double.valueOf(tempbill.getText().toString());
	    amount = (double) (amount * .2);
	    tvTip.setText( String.format( "Tip is:   $ %.2f", amount ) );
	}
	
	public void calculate10percent(View v) {
		EditText tempbill = (EditText) findViewById(R.id.etbill);
	    amount = Double.valueOf(tempbill.getText().toString());
	    amount = (double) (amount * .1);
	    tvTip.setText( String.format( "Tip is:   $%.2f", amount ) );
	}
	
	public void calculate15percent(View v) {
		EditText tempbill = (EditText) findViewById(R.id.etbill);
	    amount = Double.valueOf(tempbill.getText().toString());
	    amount = (double) (amount * .15);
	    tvTip.setText( String.format( "Tip is:   $%.2f", amount ) );
	}
}
