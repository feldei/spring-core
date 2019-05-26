package pers.springcore;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author: lsy
 * @Date: 2019/5/26 15:05
 * @Version 1.0
 */
public class MyReflection
{
    public static void main(String[] args) throws Exception
    {
        // ���Ҫ���õ���
        Class<MyTest> myTestClass = MyTest.class;
        // ���Ҫ���õķ�����output��Ҫ���õķ������֣�new Class[]{}Ϊ����Ҫ�Ĳ���������������
        Method method = myTestClass.getMethod("output", new Class[]{});
        // �Ƿ�������ΪMyAnnotation��ע��
        if (method.isAnnotationPresent(MyAnnotation.class))
        {
            // ���ע��
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            // ����ע�������
            System.out.println(annotation.hello());
            System.out.println(annotation.world());
        }
        System.out.println("----------------------------------");
        // �������ע�⡣������runtime���͵�
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations)
        {
            // ��������ע�������
            System.out.println(annotation.annotationType().getName());
        }
    }
}
