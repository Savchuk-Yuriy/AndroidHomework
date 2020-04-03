package u.savchuk.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private Context context;
    private List<ApiObject> apiObjectList;

    private NewAdapter(Context context, List<ApiObject> apiObjects) {
        this.context = context;
        this.apiObjectList = apiObjects;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        ApiObject apiObject = apiObjectList.get(position);
        holder.title.setText(apiObject.getTitle());
        holder.description.setText(apiObject.getDescription());
    }

    @Override
    public int getItemCount() {
        return apiObjectList.size();
    }
}
