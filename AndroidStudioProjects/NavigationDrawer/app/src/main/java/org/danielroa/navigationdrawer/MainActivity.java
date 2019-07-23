package org.danielroa.navigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] titles = {"White", "Black", "Purple"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renderLayout();

        displayView(0);
    }

    private void renderLayout() {

        final DrawerLayout drawer = findViewById(R.id.drawer);
        final ListView lvDrawer = findViewById(R.id.lvDrawer);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                titles
        );

        lvDrawer.setAdapter(adapter);

        lvDrawer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {

                drawer.closeDrawer(lvDrawer);

                displayView(pos);
            }
        });

    }

    private void displayView(int pos) {

        Fragment fragment = null;

        switch (pos) {
            case 0:
                fragment = new WWhiteFragment();
                break;

            case 1:
                fragment = new BBlackFragment();
                break;

        case 2:
        fragment = new PurpleFragment();
        break;
    }

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flContent, fragment)
                .commit();
    }
}
