package flex.com;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.flexDirection:
                Intent intent1 = new Intent(this, FlexDirectionActivity.class);
                startActivity(intent1);
                break;
            case R.id.flexWrap:
                Intent intent2 = new Intent(this, FlexWrapActivity.class);
                startActivity(intent2);
                break;
            case R.id.justifyContent:
                Intent intent3 = new Intent(this, JustifyContentActivity.class);
                startActivity(intent3);
                break;
            case R.id.alignItems:
                Intent intent4 = new Intent(this, AlignItemsActivity.class);
                startActivity(intent4);
                break;
            case R.id.alignContent:
                Intent intent5 = new Intent(this, AlignContentActivity.class);
                startActivity(intent5);
                break;
            case R.id.divider:
                Intent intent6 = new Intent(this, DividerActivity.class);
                startActivity(intent6);
                break;
            case R.id.layout_order:
                Intent intent7 = new Intent(this, LayoutOrderActivity.class);
                startActivity(intent7);
                break;
            case R.id.layout_flexGrow:
                Intent intent8 = new Intent(this, LayoutFlexGrowActivity.class);
                startActivity(intent8);
                break;
            case R.id.layout_flexShrink:
                Intent intent9 = new Intent(this, LayoutFlexShrinkActivity.class);
                startActivity(intent9);
                break;
            case R.id.layout_alignSelf:
                Intent intent10 = new Intent(this, LayoutAlignSelfActivity.class);
                startActivity(intent10);
                break;
            case R.id.layout_flexBasisPercent:
                Intent intent11 = new Intent(this, LayoutFlexBasisPercentActivity.class);
                startActivity(intent11);
                break;
            case R.id.recycler:
                Intent intent12 = new Intent(this, FlexRecyclerActivity.class);
                startActivity(intent12);
                break;
            default:
                break;
        }
    }
}
