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
 * 描    述：Expression a db table
 * Create by zFox from AndroidStudio3.2
 * ================================================
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DbTable {

    /**
     * Your db table name
     * @return ""if not set,get your class name into table name
     */
    String name() default "";

    /**
     * Is have system id on db table
     * @return true yes
     */
    boolean isSystemId() default true;

}
