package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {
    private View view;
    private TextView text_view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
        view = findViewById(R.id.root);
        text_view = findViewById(R.id.tv_center);
        text_view.setText(String.valueOf(getAllChildViewCount(view)));
    }

    public int getAllChildViewCount(View view) {
        //todo 补全你的代码
        //递归
        int count = 0;
        if (null == view) {
            return 0;
        }
        if (view instanceof ViewGroup) {
            count++;
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                View _view = ((ViewGroup) view).getChildAt(i);
                if (_view instanceof ViewGroup) { count += getAllChildViewCount(view); }
                else { count++; }
            }
        }
        return count;
    }
}
