package io.imagineer.diary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private EditText mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textView);
        mEditText = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);

        View.OnClickListener firstOnClickListener = new View.OnClickListener() {
            @Overrite
            public void onClick(View v) {
                String text = mEditText.getText().toString();
                mTextView.setText(text);
                mEditText.setText("");
            }
        };

        mButton.setOnClickListener(firstOnClickListener);
    }
}
