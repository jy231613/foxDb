package cn.jhf.dblib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：foxdb
 * 日    期：2019/3/9
 * 包    名：cn.jhf.dblib.annotations
 * 描    述：Request method
 * Create by zFox from AndroidStudio3.2
 * ================================================
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Request {
    /**
     * Is begin?
     * @return true yes
     */
    boolean isBegin() default true;

    /**
     * Request in method , please tell me method`s name
     * @return method name
     */
    String value();

    /**
     * Save on db , sharedPreferences or file
     * value 0:db
     * value 1:shared_preferences
     * value -1:no save,response to ui
     * @return default 1
     */
    int dbType() default 0;
}
