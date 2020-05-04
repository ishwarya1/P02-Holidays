package sg.edu.rp.soi.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class HolidayAdapter extends BaseAdapter {
    Context context;
    ArrayList<Holiday> listData;

    public HolidayAdapter(Context context, ArrayList<Holiday> listData) {
        this.context=context;
        this.listData=listData;
    }


    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View myview;

        if (convertView==null)
        {
            myview=new View(context);
            LayoutInflater lf= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            myview=lf.inflate(R.layout.list_item,null);

            TextView tvName=myview.findViewById(R.id.tvName);
            ImageView imgIcon=myview.findViewById(R.id.imgIcon);

            Holiday ldata=listData.get(position);
            tvName.setText(ldata.getName()+"\n"+ldata.getDate());
            imgIcon.setBackgroundResource(ldata.getRes());

            return myview;

        }else
        {
            return myview=convertView;
        }

    }
}
