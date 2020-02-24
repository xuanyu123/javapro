package com.neuedu.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neuedu.domain.Person;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuanyu
 * @date 2020-02-24 4:22 下午
 */
public class JacksonTest {
    //java对象转换为json
    @Test
    public void test1() throws Exception {
        //创建Person对象
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(23);
        person.setGender("man");
        //创建Jackson的核心对象，ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //转换
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
        mapper.writeValue(new File("a.txt"),person);

    }

    @Test
    public void test2() throws Exception {
        //创建Person对象
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(23);
        person.setGender("man");
        person.setBirthday(new Date());

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }
    @Test
    public void test3() throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age",12);
        map.put("gender","man");

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }
    @Test
    public void test4() throws IOException {
        //初始化化json字符串
        String json = "{\"gender\":\"man\",\"name\":\"zhangsan\",\"age\":12}";
        //创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
        //转换为Java对象   Person对象
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
