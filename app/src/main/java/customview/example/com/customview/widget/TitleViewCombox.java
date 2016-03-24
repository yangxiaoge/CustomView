package customview.example.com.customview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import customview.example.com.customview.R;

/**
 * Description:
 * Author: 0027008122 [yang.jianan@zte.com.cn]
 * Time: 2016/3/24 17:06
 * Version: 1.0
 */
public class TitleViewCombox extends FrameLayout {
    private Button mButton;
    private TextView mTextView;

    public TitleViewCombox(final Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.title_combox, this);
        mButton = (Button) findViewById(R.id.button_left);
        mTextView = (TextView) findViewById(R.id.title_text);
        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "点击成功!", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setTitleText(String text) {
        mTextView.setText(text);
    }

    public void setButtonText(String text) {
        mButton.setText(text);
    }
}
