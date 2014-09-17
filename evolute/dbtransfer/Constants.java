package pt.evolute.dbtransfer;

/*
 * Constants.java
 *
 * Created on February 7, 2005, 12:01 AM
 */

/**
 *
 * @author  lflores
 */
public interface Constants
{
    public static String URL_DB_SOURCE = "URL_DB_SOURCE";
    public static String USER_DB_SOURCE = "USER_DB_SOURCE";
    public static String PASSWORD_DB_SOURCE = "PASSWORD_DB_SOURCE";
    public static String SCHEMA_DB_SOURCE = "SCHEMA_DB_SOURCE";

    public static String[] SOURCE_PROPS = { URL_DB_SOURCE, USER_DB_SOURCE, PASSWORD_DB_SOURCE, SCHEMA_DB_SOURCE };

    public static String URL_DB_DESTINATION = "URL_DB_DESTINATION";
    public static String USER_DB_DESTINATION = "USER_DB_DESTINATION";
    public static String PASSWORD_DB_DESTINATION = "PASSWORD_DB_DESTINATION";
    public static String SCHEMA_DB_DESTINATION = "SCHEMA_DB_DESTINATION";

    public static String DESTINATION_PROPS[] = { URL_DB_DESTINATION, USER_DB_DESTINATION, PASSWORD_DB_DESTINATION, SCHEMA_DB_DESTINATION };

    public static String ANALYSE = "ANALYSE";

    public static String ONLY_NOT_EMPTY = "ONLY_NOT_EMPTY";

    public static String TRANSFER = "TRANSFER";
    public static String TRANSFER_THREADS = "TRANSFER.THREADS";
    public static String TRANSFER_ESCAPE_UNICODE = "TRANSFER.ESCAPE_UNICODE";
    public static String TRANSFER_CHECK_DEPS = "TRANSFER.CHECK_DEPS";

    public static String CONSTRAIN = "CONSTRAIN";

    public static String DIFF = "DIFF";
    public static String DIFF_COMMENT = "DIFF.COMMENT";

    public static final String DEBUG = "DEBUG";
}

