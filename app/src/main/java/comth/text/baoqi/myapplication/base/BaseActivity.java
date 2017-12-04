package comth.text.baoqi.myapplication.base;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import comth.text.baoqi.myapplication.db.DaoMaster;
import comth.text.baoqi.myapplication.db.DaoSession;
import comth.text.baoqi.myapplication.db.DataCategoryDao;

/**
 * Created by baoqi on 2017/5/18.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected SQLiteDatabase db;
    protected DaoMaster daoMaster;
    protected DaoSession daoSession;
    protected DataCategoryDao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActionBar bar = getSupportActionBar();
//        bar.setTitle("你好");
//        bar.setIcon(R.mipmap.icon);
//        bar.setLogo(R.mipmap.logo);
//        bar.setDisplayUseLogoEnabled(true);
//        bar.setDisplayShowHomeEnabled(true);
        ii("onCreate");
        if (getViewID() != 0) {
            setContentView(getViewID());
        }
        init();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ii("onDestroy");
    }

    protected DataCategoryDao getDao() {
        String name = getClass().getName();
        try {
            if (dao == null) {
                DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "my-db", null);
                db = devOpenHelper.getWritableDatabase();
                daoMaster = new DaoMaster(db);
                daoSession = daoMaster.newSession();
                dao = daoSession.getDataDao();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dao;
    }

    protected abstract int getViewID();

    protected abstract void init();

    protected abstract void initData();

    protected void ii(String msg) {
        Log.i(getClass().getName(), msg);
    }
}
