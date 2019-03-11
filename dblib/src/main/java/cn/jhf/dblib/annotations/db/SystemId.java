package cn.jhf.dblib.annotations.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：foxdb
 * 日    期：2019/3/9
 * 包    名：cn.jhf.dblib.annotations.db
 * 描    述：主键id
 * Create by zFox from AndroidStudio3.2
 * ================================================
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SystemId {

    //这个字段不可以是@Useless的;
    //这个字段如果还带有除@Uselessd之外的其他字段,则此字段只表示为主键;
    //这个标记可以是不存在的,但是这样的话系统会默认维护一个主键字段;
    //这个主键默认名为systemId,如果有参数名称为systemId,则会被默认此字段失效,系统会默认维护一个systemId;
    //这个标记是唯一的,如果存在多个,则多个字段不会生效,有且只有一个会生效;

    /**
     * 是否自增
     * @return true yes
     */
    boolean value() default true;
}
