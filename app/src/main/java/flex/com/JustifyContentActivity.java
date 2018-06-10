package flex.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.JustifyContent;

/**
 * @author tx
 * @date 2018/6/6
 */
public class JustifyContentActivity extends Activity implements View.OnClickListener{
    private FlexboxLayout flexboxLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justify_content);
        flexboxLayout = findViewById(R.id.flexLayout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.flex_start:
                flexboxLayout.setJustifyContent(JustifyContent.FLEX_START);
                break;
            case R.id.flex_end:
                flexboxLayout.setJustifyContent(JustifyContent.FLEX_END);
                break;
            case R.id.center:
                flexboxLayout.setJustifyContent(JustifyContent.CENTER);
                break;
            case R.id.space_between:
                flexboxLayout.setJustifyContent(JustifyContent.SPACE_BETWEEN);
                break;
            case R.id.space_around:
                flexboxLayout.setJustifyContent(JustifyContent.SPACE_AROUND);
                break;
            default:
                break;
        }
    }
}
