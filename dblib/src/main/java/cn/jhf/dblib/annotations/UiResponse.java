package cn.jhf.dblib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者:ZFox
 * 创建:2019/3/8 0008
 * 所属包:cn.jhf.dblib.annotations
 * 描述: Ui response after in db or request http/https
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UiResponse {
    /**
     * Is start?
     * default true
     * @return true:start/false:stop
     */
    boolean value() default true;

    /**
     * The method run on where thread?
     * value 0:Run on you request thread;
     * value 1:Run on main thread;
     * value -1:Run on new son thread;
     * @return Int type
     */
    int runThread() default 1;
}
