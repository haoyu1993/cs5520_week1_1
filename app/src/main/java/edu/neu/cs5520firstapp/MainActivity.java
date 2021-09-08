package edu.neu.cs5520firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.Button_1);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "\r\r\r\r\r\r\r\r\r\r\r\r Haoyu Zhang \n zhang.hao.yu@foxmail.com", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 800);
                toast.show();

            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.discover:
                Toast.makeText(this,"Find your Friends",Toast.LENGTH_LONG).show();
                break;
            case R.id.Message:
                Toast.makeText(this,"Type your Message",Toast.LENGTH_LONG).show();
                break;
            case R.id.Friends:
                Toast.makeText(this,"Friends",Toast.LENGTH_LONG).show();
                break;
            case R.id.Profile:
                Toast.makeText(this,"Haoyu Zhang",Toast.LENGTH_LONG).show();
                break;
            case R.id.Group:
                Toast.makeText(this,"Studying Group",Toast.LENGTH_LONG).show();
                break;
            case R.id.Notifications:
                Toast.makeText(this,"To Do Lists",Toast.LENGTH_LONG).show();
                break;
            case R.id.Menu:
                Toast.makeText(this,"Menu",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }

}