package cn.jhf.dblib.defaut_value;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：foxdb
 * 日    期：2019/3/9
 * 包    名：cn.jhf.dblib.defaut_value
 * 描    述：Som
 * Create by zFox from AndroidStudio3.2
 * ================================================
 */
public class DbLib {

    /**
     * Expression run the method on at present thread;
     */
    public static final int THREAD_NOW = 0;

    /**
     * Expression run the method on android main thread;
     */
    public static final int THREAD_MAIN = 1;

    /**
     * Expression run the method on a new thread;
     */
    public static final int THREAD_NEW = -1;

    /**
     * Expression request after save on db from sqLite
     */
    public static final int REQUEST_SAVE_DB = 0;

    /**
     * Expression request after save on shared_preference
     */
    public static final int REQUEST_SAVE_SHARED_PREFERENCE = 1;

    /**
     * Expression request after do not save
     */
    public static final int REQUEST_SAVE_NO = -1;
}
