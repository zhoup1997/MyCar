package org.zhoup.service.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Utils {


    public  static String md5(String source,String salt,int hashIterations){
        if (source==null){
            return null;
        }

        Md5Hash md5Hash = new Md5Hash(source,salt,hashIterations);

        return  md5Hash.toString();
    }


    public static void main(String[] args) {
        System.out.println(md5("admin","admin",1024));

//        System.out.println(md5("zhangsan","zhangsan",1024));

    }

}
