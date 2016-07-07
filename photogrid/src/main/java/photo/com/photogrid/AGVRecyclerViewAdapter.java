package photo.com.photogrid;

import android.support.v7.widget.RecyclerView;

public abstract class AGVRecyclerViewAdapter<VH extends RecyclerView.ViewHolder>
    extends RecyclerView.Adapter<VH> {
  public abstract PhotoGridItem getItem(int position);
}
