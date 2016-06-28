package com.example.elzatom.actionbartutorial;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
switch (id){
    case R.id.action_second:
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
        break;
    case R.id.action_third:
        Intent intent_third = new Intent(this,ThirdActivity.class);
        startActivity(intent_third);
        break;
    case R.id.action_fourth:
        Intent intent_fourth = new Intent(this,FourthActivity.class);
        startActivity(intent_fourth);
        break;
}
        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    //    @Override
//    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
//System.out.println("elzaaa");
//        switch (itemPosition){
//
//            case 1 :
//                Intent timepicker_intent = new Intent(this,TimePickerActivity.class);
//                startActivityForResult(timepicker_intent, TIME_ACTIVITY_INTENT_REQUEST);
//                break;
//            case 2 :
//                Intent list_intent = new Intent(this,ListFragmentActivity.class);
//                startActivityForResult(list_intent, LIST_ACTIVITY_INTENT_REQUEST);
//                break;
//            case 3 :
//                Intent keyboard_intent = new Intent(this,KeyboardActivity.class);
//                keyboard_intent.putExtra("textfield_data",edittext_data.getText().toString());
//                startActivity(keyboard_intent);
//                break;
//            default:
//                break;
//        }
//        return true;
//    }


}
