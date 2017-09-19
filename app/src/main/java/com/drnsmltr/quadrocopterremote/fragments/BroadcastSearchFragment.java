package com.drnsmltr.quadrocopterremote.fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.drnsmltr.quadrocopterremote.activities.MainActivity;
import com.reiss.yanneck.quadcopterremote.R;
import com.drnsmltr.quadrocopterremote.networking.UDPNetworkDiscovery;

import java.net.SocketTimeoutException;
import java.util.ArrayList;


/**
 * Fragment for the broadcast search
 */

public class BroadcastSearchFragment extends ListFragment implements AdapterView.OnItemClickListener
{
    private static final String TAG = BroadcastSearchFragment.class.getSimpleName();

    ArrayList<String> _listItems = new ArrayList<>();
    ArrayAdapter<String> _adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_broadcastsearch, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);


        _adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                _listItems);
        setListAdapter(_adapter);
        getListView().setOnItemClickListener(this);

        //startBroadcastSearch();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        //Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();


        // fetches the value from the item
        String host = parent.getAdapter().getItem(position).toString();
        ((MainActivity) getActivity()).connect(host);
        ((MainActivity) getActivity()).openConnectionFragment();
    }

    public void startBroadcastSearch()
    {
        Thread.UncaughtExceptionHandler exceptionHandler = new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread th, Throwable ex) {
                System.out.println("Uncaught exception: " + ex);
            }
        };

        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    UDPNetworkDiscovery networkManager = new UDPNetworkDiscovery();
                    networkManager.search(getContext(), 15000, _adapter);
                } catch (SocketTimeoutException e) {

                    Log.d(TAG, "SocketException wurde gecatched");
                    Toast.makeText(getActivity(), "No available Simulator", Toast.LENGTH_LONG);
                    ((MainActivity) getActivity()).openConnectionFragment();
                }
            }
        });
        thread.setUncaughtExceptionHandler(exceptionHandler);
        thread.run();


    }

}
