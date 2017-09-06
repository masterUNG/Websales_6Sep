package pneumax.websales.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import pneumax.websales.R;

/**
 * Created by masterung on 9/6/2017 AD.
 */

public class AppointmentAdapter extends BaseAdapter {

    private Context context;
    private String[] dateAppointStrings, timeAppointStrings, nameAppointStrings;

    public AppointmentAdapter(Context context,
                              String[] dateAppointStrings,
                              String[] timeAppointStrings,
                              String[] nameAppointStrings) {
        this.context = context;
        this.dateAppointStrings = dateAppointStrings;
        this.timeAppointStrings = timeAppointStrings;
        this.nameAppointStrings = nameAppointStrings;
    }

    @Override
    public int getCount() {
        return nameAppointStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.listview_appointment, viewGroup, false);

        //Initial View
        TextView dateTextView = view1.findViewById(R.id.txtDateApp);
        TextView timeTextView = view1.findViewById(R.id.txtTimeApp);
        TextView nameTextView = view1.findViewById(R.id.txtNameApp);

        //Show View
        dateTextView.setText(dateAppointStrings[i]);
        timeTextView.setText(timeAppointStrings[i]);
        nameTextView.setText(nameAppointStrings[i]);

        return view1;
    }
}   // Main Class
