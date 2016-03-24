package customview.example.com.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import customview.example.com.customview.widget.CountView;
import customview.example.com.customview.widget.TitleViewCombox;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.count_view)
    CountView countView;
    @Bind(R.id.titleview_combox)
    TitleViewCombox titleViewCombox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

}
