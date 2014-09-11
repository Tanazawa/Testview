package testview.com.example.testview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class TestViewActivity extends Activity implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view);
        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        myTextView.setText("こんにちは");

        Button myButton1 = (Button) findViewById(R.id.button1);
        myButton1.setOnClickListener(this);

        Button myButton2 = (Button)findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TestViewActivity.this, "myButton2がクリックされました", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick(View v) {
        Toast.makeText(TestViewActivity.this, "myButton1がクリックされました", Toast.LENGTH_SHORT).show();
    }

    public void onButton3Click(View v){
        Toast.makeText(TestViewActivity.this, "myButton3がクリックされました", Toast.LENGTH_SHORT).show();
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.test_view, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }


}
