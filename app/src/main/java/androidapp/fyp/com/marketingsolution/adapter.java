package androidapp.fyp.com.marketingsolution;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.brandViewHolder> {

    List<brands> brands;

    adapter(List<brands> brands) {
        this.brands = brands;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public brandViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_layout_file, viewGroup, false);
        brandViewHolder bvh = new brandViewHolder(v);
        return bvh;
    }

    @Override
    public void onBindViewHolder(brandViewHolder brandViewHolder, int i) {
        brandViewHolder.brand_Name.setText(brands.get(i).name);
        brandViewHolder.brand_desc.setText(brands.get(i).desc);
        brandViewHolder.brand_Photo.setImageResource(brands.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return brands.size();
    }

    public static class brandViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView brand_Name;
        TextView brand_desc;
        ImageView brand_Photo;

        brandViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            brand_Name = (TextView) itemView.findViewById(R.id.brand_name);
            brand_desc = (TextView) itemView.findViewById(R.id.brand_info);
            brand_Photo = (ImageView) itemView.findViewById(R.id.brand_photo);
        }
    }
}
