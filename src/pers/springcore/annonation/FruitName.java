package pers.springcore.annonation;

import java.lang.annotation.*;

/**
 * ˮ������ע��
 * @author peida
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
