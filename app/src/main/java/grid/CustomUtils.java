package grid;

import java.util.ArrayList;
import java.util.List;

public class CustomUtils
{
    int currentOffset;

    public CustomUtils()
    {
    }

    //根据元素数目，计算元素所占的列和行的数目
    public List<CustomItem> moarItems(int qty)
    {
        List<CustomItem> items = new ArrayList<>();
        //3张图片时，可以两种布局参考
        if (qty == 3)
        {
            //num=3,column=4
            //            for (int i = 0; i < qty; i++)
            //            {
            //                if (i == 0 || i == 1)
            //                {
            //                    int colSpan = 2;
            //                    int rowSpan = colSpan;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //                else
            //                {
            //                    int colSpan = 4;
            //                    int rowSpan = 2;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //            }
            //第二种情况3,12列
            for (int i = 0; i < qty; i++)
            {
                if (i == 0)
                {
                    int colSpan = 12;
                    int rowSpan = 7;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else if (i == 1 || i == 2)
                {
                    int colSpan = 6;
                    int rowSpan = 5;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
            }
        }
        //num=2,column=4
        if (qty == 2)
        {
            for (int i = 0; i < qty; i++)
            {
                if (i == 0 || i == 1)
                {
                    int colSpan = 4;
                    int rowSpan = 2;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
            }
        }
        //num=4,column=4
        if (qty == 4)
        {
            for (int i = 0; i < qty; i++)
            {
                int colSpan = 2;
                int rowSpan = 2;
                CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                items.add(item);
            }
        } //num=6,column=3
        if (qty == 6)
        {
            for (int i = 0; i < qty; i++)
            {
                if (i == 1)
                {
                    int colSpan = 2;
                    int rowSpan = 2;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else
                {
                    int colSpan = 1;
                    int rowSpan = 1;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
            }
        } //num=1,column=3
        if (qty == 1)
        {
            for (int i = 0; i < qty; i++)
            {
                int colSpan = 3;
                int rowSpan = 3;
                CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                items.add(item);
            }
        }
        //num=5,column=6;
        if (qty == 5)
        {
            //            for (int i = 0; i < qty; i++)
            //            {
            //                if (i == 0 || i == 1)
            //                {
            //                    int colSpan = 3;
            //                    int rowSpan = 3;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //                else
            //                {
            //                    int colSpan = 2;
            //                    int rowSpan = 2;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //            }
            //第二种,5,14
            for (int i = 0; i < qty; i++)
            {
                if (i == 0)
                {
                    int colSpan = 8;
                    int rowSpan = 8;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else if (i == 1 || i == 2)
                {
                    int colSpan = 6;
                    int rowSpan = 4;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else if (i == 3)
                {
                    int colSpan = 6;
                    int rowSpan = 6;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else if (i == 4)
                {
                    int colSpan = 8;
                    int rowSpan = 6;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
            }
        }
        //num=7,column=6;
        if (qty == 7)
        {
            //            for (int i = 0; i < qty; i++)
            //            {
            //                if (i == 6)
            //                {
            //                    int colSpan = 6;
            //                    int rowSpan = 2;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //                else
            //                {
            //                    int colSpan = 2;
            //                    int rowSpan = 2;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //            }
            //第二种
            for (int i = 0; i < qty; i++)
            {
                if (i == 1)
                {
                    int colSpan = 4;
                    int rowSpan = 2;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else if (i == 4)
                {
                    int colSpan = 2;
                    int rowSpan = 4;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else
                {
                    int colSpan = 2;
                    int rowSpan = 2;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
            }
        }
        //num=8,column=6;
        if (qty == 8)
        {
            //            for (int i = 0; i < qty; i++)
            //            {
            //                if (i == 3)
            //                {
            //                    int colSpan = 4;
            //                    int rowSpan = 2;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //                else
            //                {
            //                    int colSpan = 2;
            //                    int rowSpan = 2;
            //                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
            //                    items.add(item);
            //                }
            //            }
            //第二种,8,12
            for (int i = 0; i < qty; i++)
            {
                if (i == 1)
                {
                    int colSpan = 8;
                    int rowSpan = 5;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else if (i == 0)
                {
                    int colSpan = 4;
                    int rowSpan = 5;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
                else
                {
                    int colSpan = 4;
                    int rowSpan = 3;
                    CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                    items.add(item);
                }
            }
        }
        //num=9,column=3;
        if (qty == 9)
        {
            for (int i = 0; i < qty; i++)
            {
                int colSpan = 1;
                int rowSpan = 1;
                CustomItem item = new CustomItem(colSpan, rowSpan, currentOffset + i);
                items.add(item);
            }
        }
        //        currentOffset += qty;
        return items;
    }
}
