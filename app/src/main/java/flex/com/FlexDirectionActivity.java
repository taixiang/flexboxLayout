package flex.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayout;

/**
 * @author tx
 * @date 2018/6/5
 */
public class FlexDirectionActivity extends Activity implements View.OnClickListener {
    private FlexboxLayout flexboxLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flex_direction);
        flexboxLayout = findViewById(R.id.flexLayout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.row:
                flexboxLayout.setFlexDirection(FlexDirection.ROW);
                break;
            case R.id.row_reverse:
                flexboxLayout.setFlexDirection(FlexDirection.ROW_REVERSE);
                break;
            case R.id.column:
                flexboxLayout.setFlexDirection(FlexDirection.COLUMN);
                break;
            case R.id.column_reverse:
                flexboxLayout.setFlexDirection(FlexDirection.COLUMN_REVERSE);
                break;
            default:
                break;
        }
    }
}
