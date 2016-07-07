package grid;

import java.security.GeneralSecurityException;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.chance.swiftpicasso.api.SwiftChanceImpl;
import com.chance.swiftpicasso.tools.CropOperMode;
import com.chance.swiftpicasso.tools.SwiftUnauthorizedException;
import com.chance.ui.R;
import com.chance.ui.home.ChanceApplication;

/**
 * Created by cuter85 on 2016/3/24.
 * Copyright Chance 2011-2015 All Rights Reserved
 */
public class GridAdapter extends BaseAdapter
{
    Context          context;
    List<CustomItem> items;
    LayoutInflater   inflater;
    List<String>     urls;
    private CropOperMode imageCropMode;

    public GridAdapter(Context context, List<String> urls, List<CustomItem> newItems)
    {
        this.context = context;
        this.urls = urls;
        this.items = newItems;
        inflater = LayoutInflater.from(context);
        int size = ((ChanceApplication)context.getApplicationContext()).getWidth()/2;
        this.imageCropMode = new CropOperMode(size, size, 0);
    }

    @Override
    public int getCount()
    {
        return items.size();
    }

    @Override
    public Object getItem(int position)
    {
        return items.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        HoldImageView holdImageView;
        if (convertView == null)
        {
            holdImageView = new HoldImageView();
            convertView = inflater.inflate(R.layout.grid_adapter_item, parent, false);
            holdImageView.imageView = (ImageView) convertView.findViewById(R.id.imageview);
            convertView.setTag(holdImageView);
        }
        else
        {
            holdImageView = (HoldImageView) convertView.getTag();
        }

        String url = urls.get(position);

        if (!url.equals(holdImageView.imageView.getTag()))
        {
            holdImageView.imageView.setTag(url);
            if (urls.size() == 1){
                try
                {
                    SwiftChanceImpl.getSwiftChanceImpl(context).swiftLoadPersonImg(url)
                            .into(holdImageView.imageView);
                }
                catch (SwiftUnauthorizedException | GeneralSecurityException e)
                {
                    e.printStackTrace();
                }
            }else {
                try {
                    SwiftChanceImpl.getSwiftChanceImpl(context).swiftLoadPersonThumbImg(url, imageCropMode)
                            .into(holdImageView.imageView);
                } catch (SwiftUnauthorizedException | GeneralSecurityException e) {
                    e.printStackTrace();
                }
            }
        }
        return convertView;
    }

    class HoldImageView
    {
        TextView textView;
        ImageView imageView;
    }
}
