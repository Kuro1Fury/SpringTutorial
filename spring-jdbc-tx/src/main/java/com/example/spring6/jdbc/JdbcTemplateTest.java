package com.example.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations="classpath:beans.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Select: return object
    @Test
    public void testSelectObject() {
        // Approach 1: use RowMapper
//        String sql = "SELECT * FROM t_emp WHERE id=?";
//        Emp empResult = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
//            Emp emp = new Emp();
//            emp.setId(rs.getInt("id"));
//            emp.setName(rs.getString("name"));
//            emp.setAge(rs.getInt("age"));
//            emp.setGender(rs.getString("gender"));
//            return emp;
//        }, 2);
//        System.out.println(empResult);

        // Approach 2: use BeanPropertyRowMapper
        String sql = "SELECT * FROM t_emp WHERE id=?";
        Emp empResult = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println(empResult);
    }

    // Select: return list
    @Test
    public void testSelectList() {
        String sql = "SELECT * FROM t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

    // Select: return single value
    @Test
    public void testSelectSingleValue() {
        String sql = "SELECT count(*) from t_emp";
        Long count = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(count);
    }

    // Add, Update, Delete
    @Test
    public void testUpdate() {
        // 1. Add
        // Step 1. Create SQL statement
//        String sql = "INSERT INTO t_emp VALUES(NULL, ?, ?, ?)";

        // Step 2. Call jdbcTemplate.update() method and pass SQL statement and parameters
        // Advanced:
//        Object[] params = {"Allan", 20, "male"};
//        int rows = jdbcTemplate.update(sql, params);
        // Basic:
//        int rows = jdbcTemplate.update(sql, "Allan", 20, "male");
//        System.out.println(rows);


        // 2. Update
//        String sql = "UPDATE t_emp set name=? where id=?";
//        int rows = jdbcTemplate.update(sql, "William", 1);
//        System.out.println(rows);


        // 3. Delete
        String sql = "DELETE FROM t_emp WHERE id=?";
        int rows = jdbcTemplate.update(sql, 1);
        System.out.println(rows);

    }
}
