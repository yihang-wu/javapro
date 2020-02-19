package neuedu.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//.FIELD只能加在属性上  TYPE只能加在类上 METHOD只能加在方法上
@Retention(RetentionPolicy.RUNTIME)//整个运行当中都效
public @interface Colum {
    /*
    * */
    String value();
}
