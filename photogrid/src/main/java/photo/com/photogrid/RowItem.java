package photo.com.photogrid;

final class RowItem {
  private final PhotoGridItem item;
  private final int index;

  RowItem(int index, PhotoGridItem item) {
    this.item = item;
    this.index = index;
  }

  PhotoGridItem getItem() {
    return item;
  }

  int getIndex() {
    return index;
  }
}
