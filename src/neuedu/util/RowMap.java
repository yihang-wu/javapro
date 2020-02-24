package neuedu.util;

import java.sql.ResultSet;

public interface RowMap<T> {
    T rowMaping(ResultSet resultSet);//从数据库中取出，赋值到 T 对象中
}
