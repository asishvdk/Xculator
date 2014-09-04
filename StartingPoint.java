package com.teczoz.calculator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class StartingPoint extends ActionBarActivity implements
		View.OnClickListener {

	Button op, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, bequal, bplus,
			bminus, binto, bby, clear;
	int press = 0, operation_id = 0, done = 0, time = 0, decimal = 0, x = 10;
	double b = 0, a = 0, ans = 0;
	String answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		set();
		try {
			b0.setOnClickListener(this);
			b1.setOnClickListener(this);
			b2.setOnClickListener(this);
			b3.setOnClickListener(this);
			b4.setOnClickListener(this);
			b5.setOnClickListener(this);
			b6.setOnClickListener(this);
			b7.setOnClickListener(this);
			b8.setOnClickListener(this);
			b9.setOnClickListener(this);
			bdot.setOnClickListener(this);
			bequal.setOnClickListener(this);
			bplus.setOnClickListener(this);
			bminus.setOnClickListener(this);
			binto.setOnClickListener(this);
			bby.setOnClickListener(this);
			clear.setOnClickListener(this);
		} catch (Exception e) {

		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.starting_point, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void set() {
		// TODO Auto-generated method stub

		b0 = (Button) findViewById(R.id.b0);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);
		bdot = (Button) findViewById(R.id.bdot);
		bequal = (Button) findViewById(R.id.bequal);
		bplus = (Button) findViewById(R.id.bplus);
		bminus = (Button) findViewById(R.id.bminus);
		binto = (Button) findViewById(R.id.binto);
		bby = (Button) findViewById(R.id.bby);
		clear = (Button) findViewById(R.id.clear);
		op = (Button) findViewById(R.id.op);
		String answer = op.getText().toString();
		ans = Double.parseDouble(answer);
		op.setText("");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		// VAR Process
		if (press == 0 && done != 0) {
			press = 1;
			done = 0;
		}
		if (press == 1 && done != 0) {
			press = 0;
			done = 0;
		}
		// clicks
		if (press == 0) {
			switch (v.getId()) {
			case R.id.b1:
				a = (a * 10) + 1;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b2:
				a = (a * 10) + 2;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b3:
				a = (a * 10) + 3;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b4:
				a = (a * 10) + 4;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b5:
				a = (a * 10) + 5;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b6:
				a = (a * 10) + 6;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b7:
				a = (a * 10) + 7;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b8:
				a = (a * 10) + 8;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b9:
				a = (a * 10) + 9;
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b0:
				a = (a * 10);
				answer = String.valueOf(a);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.bplus:
				if (time == 0)
					operation_id = 1;
				if (operation_id == 1)
					ans += a;
				if (operation_id == 2)
					ans -= a;
				if (operation_id == 3)
					ans *= a;
				if (operation_id == 4)
					ans /= a;
				operation_id = 1;
				done = 1;
				time = 1;
				a = 0;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("+");
				break;
			case R.id.bminus:
				if (time == 0)
					operation_id = 2;
				if (operation_id == 1)
					ans += a;
				if (operation_id == 2) {
					if (time == 0)
						ans = a;
					else
						ans -= a;
				}
				if (operation_id == 3)
					ans *= a;
				if (operation_id == 4)
					ans /= a;
				operation_id = 2;
				done = 1;
				time = 1;
				a = 0;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("-");
				break;
			case R.id.binto:
				if (time == 0) {
					operation_id = 3;
					ans = 1;
				}
				if (operation_id == 1)
					ans += a;
				if (operation_id == 2)
					ans -= a;
				if (operation_id == 3)
					ans *= a;
				if (operation_id == 4)
					ans /= a;
				operation_id = 3;
				done = 1;
				time = 1;
				a = 0;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("*");
				break;
			case R.id.bby:
				if (time == 0) {
					operation_id = 4;
					ans = 1;
				}
				if (operation_id == 1)
					ans += a;
				if (operation_id == 2)
					ans -= a;
				if (operation_id == 3)
					ans *= a;
				if (operation_id == 4) {
					if (time == 0)
						ans = a;
					else
						ans /= a;
				}
				a = 0;
				operation_id = 4;
				done = 1;
				time = 1;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("/");
				break;
			case R.id.bdot:
				if (a == 0) {
					ans *= ans;
					answer = String.valueOf(ans);
					answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
					op.setText(answer);
				} else {
					a *= a;
					answer = String.valueOf(a);
					answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
					op.setText(answer);
				}
				break;
			case R.id.bequal:
				op.setText("");
				if (operation_id == 1)
					ans += a;
				if (operation_id == 2)
					ans -= a;
				if (operation_id == 3)
					ans *= a;
				if (operation_id == 4)
					ans /= a;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				a = 0;
				b = 0;
				press = 0;
				done = 0;
				operation_id = 0;
				break;
			case R.id.clear:
				a = 0;
				b = 0;
				ans = 0;
				press = 0;
				operation_id = 0;
				done = 0;
				time = 0;
				op.setText("");
				break;
			default:
				break;
			}
		}
		if (press == 1) {
			switch (v.getId()) {
			case R.id.b1:
				b = (b * 10) + 1;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b2:
				b = (b * 10) + 2;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b3:
				b = (b * 10) + 3;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b4:
				b = (b * 10) + 4;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b5:
				b = (b * 10) + 5;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b6:
				b = (b * 10) + 6;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b7:
				b = (b * 10) + 7;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b8:
				b = (b * 10) + 8;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b9:
				b = (b * 10) + 9;
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.b0:
				b = (b * 10);
				answer = String.valueOf(b);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				break;
			case R.id.bplus:
				if (operation_id == 1)
					ans += b;
				if (operation_id == 2)
					ans -= b;
				if (operation_id == 3)
					ans *= b;
				if (operation_id == 4)
					ans /= b;
				b = 0;
				operation_id = 1;
				done = 1;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("+");
				break;
			case R.id.bminus:
				if (operation_id == 1)
					ans += b;
				if (operation_id == 2)
					ans -= b;
				if (operation_id == 3)
					ans *= b;
				if (operation_id == 4)
					ans /= b;
				b = 0;
				operation_id = 2;
				done = 1;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("-");
				break;
			case R.id.binto:
				if (operation_id == 1)
					ans += b;
				if (operation_id == 2)
					ans -= b;
				if (operation_id == 3)
					ans *= b;
				if (operation_id == 4)
					ans /= b;
				b = 0;
				operation_id = 3;
				done = 1;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("*");
				break;
			case R.id.bby:
				if (operation_id == 1)
					ans += b;
				if (operation_id == 2)
					ans -= b;
				if (operation_id == 3)
					ans *= b;
				if (operation_id == 4)
					ans /= b;
				b = 0;
				operation_id = 4;
				done = 1;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				op.append("/");
				break;
			case R.id.bdot:
				if (b == 0) {
					ans *= ans;
					answer = String.valueOf(ans);
					answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
					op.setText(answer);
				} else {
					b *= b;
					answer = String.valueOf(b);
					answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
					op.setText(answer);
				}
				break;
			case R.id.bequal:
				op.setText("");
				if (operation_id == 1)
					ans += b;
				if (operation_id == 2)
					ans -= b;
				if (operation_id == 3)
					ans *= b;
				if (operation_id == 4)
					ans /= b;
				answer = String.valueOf(ans);
				answer = answer.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				op.setText(answer);
				a = 0;
				b = 0;
				done = 0;
				press = 0;
				operation_id = 0;
				break;
			case R.id.clear:
				a = 0;
				b = 0;
				ans = 0;
				press = 0;
				operation_id = 0;
				done = 0;
				time = 0;
				op.setText("");
				break;
			default:
				break;
			}
		}
	}
}
