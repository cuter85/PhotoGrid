package photo.com.photogrid;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

interface AGVBaseAdapter<T extends RecyclerView.ViewHolder> {
  int getActualItemCount();
  PhotoGridItem getItem(int position);
  void notifyDataSetChanged();
  int getItemViewType(int actualIndex);
  PhotoGridViewHolder<T> onCreateAsymmetricViewHolder(int position, ViewGroup parent, int viewType);
  void onBindAsymmetricViewHolder(PhotoGridViewHolder<T> holder, ViewGroup parent, int position);
}
