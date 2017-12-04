package comth.text.baoqi.myapplication;

import android.view.View;
import android.widget.TextView;

import comth.text.baoqi.myapplication.base.BaseActivity;
import comth.text.baoqi.myapplication.db.DataCategoryDao;
import comth.text.baoqi.myapplication.view.CustomRoundView;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private CustomRoundView icon;
    private TextView nameTV, readTV;

    @Override
    protected int getViewID() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        icon = (CustomRoundView) findViewById(R.id.icon_cv);
        nameTV = (TextView) findViewById(R.id.name_tv);
        findViewById(R.id.write_rl).setOnClickListener(this);
        findViewById(R.id.read_rl).setOnClickListener(this);

        setTitle("首页");

        readTV = (TextView) findViewById(R.id.read_item_tv);

        readTV.setText(getDao().queryBuilder().where(DataCategoryDao.Properties.Type.eq("read")).list().size() + "");
    }

    @Override
    protected void initData() {
        nameTV.setText("据说名字越长越屌");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.write_rl:

                break;
            case R.id.read_rl:

                break;
        }
    }
}
