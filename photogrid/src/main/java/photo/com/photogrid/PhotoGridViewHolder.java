package photo.com.photogrid;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class PhotoGridViewHolder<VH extends RecyclerView.ViewHolder>
    extends RecyclerView.ViewHolder {
  final VH wrappedViewHolder;

  public PhotoGridViewHolder(VH wrappedViewHolder) {
    super(wrappedViewHolder.itemView);
    this.wrappedViewHolder = wrappedViewHolder;
  }

  public PhotoGridViewHolder(View view) {
    super(view);
    wrappedViewHolder = null;
  }
}
