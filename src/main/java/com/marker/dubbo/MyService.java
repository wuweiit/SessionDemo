package com.marker.dubbo;

/**
 * Created by Administrator on 2016/8/24.
 */
public class MyService implements IService {


    @Override
    public String sayHello(String str) {
        return str;
    }
}
