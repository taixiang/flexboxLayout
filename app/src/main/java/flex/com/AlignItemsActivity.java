package flex.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexboxLayout;

/**
 * @author tx
 * @date 2018/6/6
 */
public class AlignItemsActivity extends Activity implements View.OnClickListener {
    private FlexboxLayout flexboxLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_align_items);
        flexboxLayout = findViewById(R.id.flexLayout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stretch:
                flexboxLayout.setAlignItems(AlignItems.STRETCH);
                break;
            case R.id.flex_start:
                flexboxLayout.setAlignItems(AlignItems.FLEX_START);
                break;
            case R.id.flex_end:
                flexboxLayout.setAlignItems(AlignItems.FLEX_END);
                break;
            case R.id.center:
                flexboxLayout.setAlignItems(AlignItems.CENTER);
                break;
            case R.id.baseline:
                flexboxLayout.setAlignItems(AlignItems.BASELINE);
                break;
            default:
                break;
        }
    }
}
