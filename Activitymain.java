package com.example.pr13;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
          MenuItem item1=menu.add(0,0,0,"File");
          MenuItem item2=menu.add(0,1,1,"Edit");
          MenuItem item3=menu.add(0,2,2,"View");
          MenuItem item4=menu.add(0,3,3,"Settings");
          MenuItem item5=menu.add(0,3,3,"Help");
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()==0)
        {
            Toast.makeText(getApplicationContext(),"File is selected",Toast.LENGTH_LONG).show();;
        }
        if(item.getItemId()==1)
        {
            Toast.makeText(getApplicationContext(),"Edit is selected",Toast.LENGTH_LONG).show();;
        }
        if(item.getItemId()==2)
        {
            Toast.makeText(getApplicationContext(),"View is selected",Toast.LENGTH_LONG).show();;
        }
        if(item.getItemId()==3)
        {
            Toast.makeText(getApplicationContext(),"Settings is selected",Toast.LENGTH_LONG).show();;
        }
        if(item.getItemId()==4)
        {
            Toast.makeText(getApplicationContext(),"Help is selected",Toast.LENGTH_LONG).show();;
        }
        return true;
    }
}
