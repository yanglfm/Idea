package JDBCDao;

public class TimeTest {

    public static java.sql.Date convertToSqlDate(java.util.Date date){
        java.sql.Date sqlDate = null;
        sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
}
