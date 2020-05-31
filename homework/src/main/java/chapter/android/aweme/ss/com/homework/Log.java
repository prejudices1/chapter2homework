package chapter.android.aweme.ss.com.homework;

import android.app.Application;
//将信息保存在information里
public class Log extends Application {

    private String information;

    public String getInformation(){
        return information;
    }

    public void setInformation(String info){
        this.information = info;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        information = "";
    }
}

