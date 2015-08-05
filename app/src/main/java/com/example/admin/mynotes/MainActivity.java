package com.example.admin.mynotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabH = (TabHost) findViewById(R.id.tabHost);
        tabH.setup();
        TabHost.TabSpec tabS = tabH.newTabSpec("list");
        tabS.setContent(R.id.listTab);
        tabS.setIndicator("My Notes");
        tabH.addTab(tabS);

        tabS = tabH.newTabSpec("newnote");
        tabS.setContent(R.id.addingTab);
        tabS.setIndicator("Add New Note");
        tabH.addTab(tabS);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
