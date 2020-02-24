package com.neuedu.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuanyu
 * @date 2020-02-24 5:39 下午
 */
@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户名
        String username = request.getParameter("username");
        //调用service层判断用户名是否存在

        /*
        * 期望服务器返回的数据格式
        * {"userExsit":true,"msg":"此用户名太受欢迎，请更换一个"}
        * {"userExsit":false,"msg":"此用户名可用"}
        * */
        response.setContentType("text/html;charset=utf-8");
        Map<String, Object> map = new HashMap<String, Object>();
        if ("tom".equals(username)){
            //用户名存在
            map.put("userExsit",true);
            map.put("msg","此用户名太受欢迎，请更换一个");
        }else{
            //用户名不存在
            map.put("userExsit",false);
            map.put("msg","此用户名可用");
        }
        //将map转换为json，并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
