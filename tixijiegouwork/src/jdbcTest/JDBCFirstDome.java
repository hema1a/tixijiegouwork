package jdbcTest;

import java.sql.*;

//第一个JDBC程序
public class JDBCFirstDome {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");//固定写法

        //2.用户信息和
        // urluseUnicode=true&characterEncoding=utf8&useSSL=true
        String ur1="jdbc:mysql://127.0.0.1:3306/testdb";
        String username="root";
        String password="root123";

        //3.连接成功，数据库对象  Connection  代表数据库
        Connection connection=DriverManager.getConnection(ur1,username,password);

        //4.执行SQL的对象
        Statement statement=connection.createStatement();

        //5.执行SQL的对象，去执行SQL，可能存在结果，返回结果信息
        String sql="SELECT * FROM tongxunlu";
        System.out.println("查询");
        ResultSet resultSet=statement.executeQuery(sql);//返回的结果集,结果集中封装了我们全部的查询出来的结果
        System.out.println(resultSet);
//        展示数据
        while (resultSet.next()){
            System.out.println("name="+resultSet.getObject("NAME"));
            System.out.println("number="+resultSet.getObject("number"));
            System.out.println("address="+resultSet.getObject("address"));
            System.out.println("=========================");
        }


        //6.释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
