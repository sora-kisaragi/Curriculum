import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBAccess {
    /** ドライバーのクラス名 */
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";
    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "postgres";
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // データベースに接続する準備
            Class.forName(POSTGRES_DRIVER);
            //接続先の情報
            connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);

        // forName()で例外発生
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        // getConnection()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    // データベースを切断
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}