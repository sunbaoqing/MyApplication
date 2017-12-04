package comth.text.baoqi.myapplication.db;

import java.io.Serializable;

/**
 * Created by baoqi on 2017/5/3.
 */

public class MyDBData implements Serializable {
    private Long tid;//主键
    private String time;//
    private String type;//
    private String text;//
    private String obj;//

    public MyDBData() {
    }

    public MyDBData(Long tid, String time, String type, String text, String obj) {
        this.tid = tid;
        this.time = time;
        this.type = type;
        this.text = text;
        this.obj = obj;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }
}
