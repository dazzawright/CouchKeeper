package com.bintonet.couchkeeper.dummy;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent extends AsyncTask<Void, Void, String[]>{

    private final String LOG_TAG = DummyContent.class.getSimpleName();

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Item 1"));
        addItem(new DummyItem("2", "Item 2"));
        addItem(new DummyItem("3", "Item 3"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    protected String[] doInBackground(String... params) {

        return new String[0];
    }

    @Override
    protected String[] doInBackground(Void... params) {

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        String wantedJsonStr = null;
        String api_key = "4d81f4f4eb211c427e0d5c9d51c7198b";
        String host_address = "https//bintonet.duckdns.org";
        String server_port = "5000";
        String api_call = "media.list";
        String status_param = "active";

        Log.v(LOG_TAG, "Built URI " + api_key);
        return new String[0];
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
