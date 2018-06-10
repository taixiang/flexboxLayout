package flex.com;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.android.flexbox.AlignContent;
import com.google.android.flexbox.FlexboxLayout;

/**
 * @author tx
 * @date 2018/6/7
 */
public class AlignContentActivity extends Activity implements View.OnClickListener {
    private FlexboxLayout flexboxLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_align_content);
        flexboxLayout = findViewById(R.id.flexLayout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stretch:
                flexboxLayout.setAlignContent(AlignContent.STRETCH);
                break;
            case R.id.flex_start:
                flexboxLayout.setAlignContent(AlignContent.FLEX_START);
                break;
            case R.id.flex_end:
                flexboxLayout.setAlignContent(AlignContent.FLEX_END);
                break;
            case R.id.center:
                flexboxLayout.setAlignContent(AlignContent.CENTER);
                break;
            case R.id.space_between:
                flexboxLayout.setAlignContent(AlignContent.SPACE_BETWEEN);
                break;
            case R.id.space_around:
                flexboxLayout.setAlignContent(AlignContent.SPACE_AROUND);
                break;
            default:
                break;
        }
    }
}
