package pers.springcore;

import java.lang.annotation.*;

/**
 * ˮ����ɫע��
 * @author peida
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * ��ɫö��
     * @author peida
     *
     */
    public enum Color{ BULE,RED,GREEN};

    /**
     * ��ɫ����
     * @return
     */
    Color fruitColor() default Color.GREEN;

}
