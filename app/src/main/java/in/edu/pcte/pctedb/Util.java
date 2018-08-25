package in.edu.pcte.pctedb;

public class Util {

    public static int DB_VERSION = 1;
    public static String DB_NAME = "PCTE.db";

    public static String CREATE_TAB_QUERY="" +
            "create table User(" +
            "_ID int primary key auto_increment," +
            "email varchar(256)," +
            "password varchar(256)" +
            ")";

}
