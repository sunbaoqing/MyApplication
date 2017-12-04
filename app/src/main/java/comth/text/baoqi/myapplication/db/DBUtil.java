package comth.text.baoqi.myapplication.db;

import java.util.List;

/**
 * Created by baoqi on 2017/5/18.
 */

public class DBUtil {
    public List<MyDBData> getAllData(DataCategoryDao dao, String name) throws Exception {
        List<MyDBData> myDBDatas = dao.queryBuilder().list();
        return myDBDatas;
    }
}
