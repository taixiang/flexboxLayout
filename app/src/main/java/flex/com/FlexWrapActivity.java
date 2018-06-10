package flex.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayout;

/**
 * @author tx
 * @date 2018/6/6
 */
public class FlexWrapActivity extends Activity implements View.OnClickListener {
    private FlexboxLayout flexboxLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexwrap);
        flexboxLayout = findViewById(R.id.flexLayout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nowrap:
                flexboxLayout.setFlexWrap(FlexWrap.NOWRAP);
                break;
            case R.id.wrap:
                flexboxLayout.setFlexWrap(FlexWrap.WRAP);
                break;
            case R.id.wrap_reverse:
                flexboxLayout.setFlexWrap(FlexWrap.WRAP_REVERSE);
                break;
            default:
                break;
        }
    }
}
