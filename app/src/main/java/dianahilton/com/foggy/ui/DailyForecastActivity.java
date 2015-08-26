package dianahilton.com.foggy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import dianahilton.com.foggy.R;
import dianahilton.com.foggy.adapters.DayAdapter;
import dianahilton.com.foggy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);

//        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                daysOfTheWeek);
//
//        setListAdapter(adapter);
    }

}
