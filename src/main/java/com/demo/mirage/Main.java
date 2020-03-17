package com.demo.mirage;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.yoloho.enhanced.common.util.HttpClientUtil;
import com.yoloho.enhanced.common.util.aes.AESUtil;

public class Main {
    public static void main(String[] args) {
        // link example: http://somehost.com/some/path/page.html?data=b3afdf5f9696fa108ff35b9dd0011dc5c8269423eee8e5efbebb841e1d1d4344d59ba7911127b2998433302d756e306b
        String data = "b3afdf5f9696fa108ff35b9dd0011dc5c8269423eee8e5efbebb841e1d1d4344d59ba7911127b2998433302d756e306b";
        String cryptKey = "239iodusfg9idsg9fg";
        String decoded = AESUtil.decrypt(data, cryptKey);
        Map<String, String> paramMap = HttpClientUtil.splitKeyValuePairString(decoded);
        System.out.println("Decode as: " + decoded);
        System.out.println("Parameters: " + JSON.toJSONString(paramMap, true));
    }
}
