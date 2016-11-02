package brunnicolas.reveil;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlarmFragment  extends android.support.v4.app.Fragment{

    public AlarmFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<String> alarms = new ArrayList<>();
        alarms.add("Lundi 8h00");
        alarms.add("Mardi 8h00");
        alarms.add("Mercredi 8h00");
        alarms.add("Jeudi 8h00");
        alarms.add("Vendredi 8h00");
        alarms.add("Samedi 8h00");
        alarms.add("Dimanche 8h00");

        ArrayAdapter<String> mAlarmsAdapter = new ArrayAdapter<String>(this.getActivity(),R.layout.list_item_alarm,R.id.list_item_alarm_textview,alarms);
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        ListView listView = (ListView) rootView.findViewById(R.id.listeview_alarm);
        listView.setAdapter(mAlarmsAdapter);

        return rootView;
    }
}
