package at.technikumwien.birthdaynotifier;

/**
 * Created by Alex on 20.03.17.
 */


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MessageActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        String message = getIntent().getStringExtra("message");

        TextView textView = (TextView) findViewById(R.id.message);
        textView.setText(message);
    }


}
