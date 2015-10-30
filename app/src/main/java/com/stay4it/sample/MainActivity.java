package com.stay4it.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.stay4it.sample.db.DBManager;
import com.stay4it.sample.db.UserDAO;
import com.stay4it.sample.model.User;

public class MainActivity extends AppCompatActivity {

    private TextView mDbTestLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDbTestLabel = (TextView)findViewById(R.id.mDbTestLabel);
        testDB();
    }

    private void testDB() {
        DBManager.init(this, "stay4it", "stay4it");
        User user = new User();
        user.id = "1000000";
        user.age = 18;
        user.name = "antush";
        mDbTestLabel.append(user.toString());
        UserDAO.getInstance().addOrUpdate(user);

        User user1 = UserDAO.getInstance().queryById(user.id);
        mDbTestLabel.append("\n");
        mDbTestLabel.append(user1.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
