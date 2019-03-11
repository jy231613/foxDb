package cn.jhf.dblib.annotations.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/13
 * 包    名：com.qb.wxbase.create.sql.note
 * 描    述：此注解标识参数是无用的,不会被在数据库中创建字段
 * Create by Administrator from AndroidStudio3.2
 * ================================================
 */
@Retention(RetentionPolicy.RUNTIME)//生命周期一直存在
@Target( { ElementType.FIELD})//应用于参数
public @interface Useless {
    //优先级最高,一个字段只要标记了Useless字段,其他标记自动失效
    //系统会判断当前字段是无用的,不用做处理
}
