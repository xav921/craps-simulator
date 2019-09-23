package com.example.crapssimulator;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView tally = findViewById(R.id.tally);
    tally.setText("This will be my win/loss tally line.");
    ListView rolls = findViewById(R.id.rolls);
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dummy_rolls));
    rolls.setAdapter(adapter);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.options, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    boolean handled = true;
    switch (item.getItemId()) {
      case R.id.run:
        Toast.makeText(this, getString(R.string.run_toast), Toast.LENGTH_LONG).show();
        break;
      case R.id.reset:
        Toast.makeText(this, getString(R.string.reset_toast), Toast.LENGTH_LONG).show();
        break;
      default:
        handled = super.onOptionsItemSelected(item);
    }
    return handled;
  }
}
