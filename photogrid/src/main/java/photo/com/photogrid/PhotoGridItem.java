package photo.com.photogrid;

import android.os.Parcelable;

public interface PhotoGridItem extends Parcelable {
  int getColumnSpan();
  int getRowSpan();
}
