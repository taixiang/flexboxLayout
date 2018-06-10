package flex.com;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;

/**
 * Created by tx on 2018/6/10.
 */

public class FlexRecyclerActivity extends Activity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flex_recyclerview);
        recyclerView = findViewById(R.id.recyclerView);
        FlexboxLayoutManager manager = new FlexboxLayoutManager(this);
        manager.setFlexDirection(FlexDirection.ROW);
        manager.setFlexWrap(FlexWrap.WRAP);
        recyclerView.setLayoutManager(manager);
        MyAdapter adapter = new MyAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    private class MyAdapter extends RecyclerView.Adapter<Holder>{

        private Context context;

        public MyAdapter(Context context) {
            this.context = context;
        }

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.flex_item_view,null);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.tv.setText(position+"");
        }

        @Override
        public int getItemCount() {
            return 20;
        }
    }

    private class Holder extends RecyclerView.ViewHolder{
        private TextView tv;
        public Holder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
        }
    }

}
