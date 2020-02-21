package utils;

import java.sql.ResultSet;

/**
 * @author xuanyu
 * @date 2020-02-21 11:19 下午
 */
public interface RowMap<T> {
    T rowMapping(ResultSet rs);
}
