package pers.springcore.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.springcore.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lsy
 * @Date: 2019/6/1 0:51
 * @Version 1.0
 */
public class TestSpring {

    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentModel studentModel = (StudentModel)context.getBean("studentModel");

        System.out.println(studentModel.toString());
    }

    @Test
    public void testMethod() {
        List<Integer> list = new ArrayList<>(5);
        list.forEach(integer -> {
           list.add(1+1);
        });

        System.out.println(list);
    }
}
