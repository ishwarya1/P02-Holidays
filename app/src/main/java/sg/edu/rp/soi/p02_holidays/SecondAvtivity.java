package sg.edu.rp.soi.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SecondAvtivity extends AppCompatActivity {

    ListView myList;
    ArrayList<Holiday> listData;
    HolidayAdapter holidayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_second);
        myList=findViewById(R.id.myList);

        loadValues();



        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {


                Toast.makeText(SecondAvtivity.this, listData.get(pos).getName()+" "+listData.get(pos).getDate(), Toast.LENGTH_SHORT).show();


            }
        });

    }

    private void loadValues() {
        listData=new ArrayList<>();
        listData.add(new Holiday("New Year's Day","1 January 2020",R.drawable.new_year));
        listData.add(new Holiday("Chinese New Year","25 January 2020 26 January 2020",R.drawable.cny));
        listData.add(new Holiday("Good Friday","10 April 2020",R.drawable.good_friday));
        listData.add(new Holiday("Labour Day","1 May 2020",R.drawable.labour_day));
        listData.add(new Holiday("Vesak Day","7 May 2020",R.drawable.vesak_day));
        listData.add(new Holiday("Hari Raya Puasa","24 May 2020",R.drawable.hari_raya_puasa));
        listData.add(new Holiday("Hari Raya Haji","31 July 2020",R.drawable.hari_raya_aji));
        listData.add(new Holiday("National Day","9 August 2020",R.drawable.national_day));
        listData.add(new Holiday("Deepavali","14 November 2020",R.drawable.deepavali));
        listData.add(new Holiday("Christmas Day","25 December 2020",R.drawable.christmas));

        holidayAdapter=new HolidayAdapter(SecondAvtivity.this,listData);
        myList.setAdapter(holidayAdapter);


    }
}
