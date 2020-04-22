package u.savchuk.retroexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    //ArrayList<ApiObject> apiObjectsList = new ArrayList<>();
    private ApiObject apiObjectList;

    public RecyclerViewAdapter(Context context, ApiObject apiObjects) {
        this.context = context;
        this.apiObjectList = apiObjects;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ApiObject apiObject = apiObjectList;
        holder.userId.setText(apiObject.getUserId());
        holder.id.setText(apiObject.getId());
        holder.title.setText(apiObject.getTitle());
        holder.completed.setText(apiObject.getCompleted());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView userId, id, title, completed;

        public MyViewHolder(View itemView) {
            super(itemView);
            userId = itemView.findViewById(R.id.userId);
            id = itemView.findViewById(R.id.id);
            title = itemView.findViewById(R.id.title);
            completed = itemView.findViewById(R.id.completed);
        }
    }
}
