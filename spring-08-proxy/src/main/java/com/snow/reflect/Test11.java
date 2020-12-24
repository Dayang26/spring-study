package com.snow.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author Snow
 * @create 2020-12-24 15:51
 */
public class Test11 {
    public void test01(Map<String, User> map, List<User> list) {
        System.out.println("test01");
    }

    public Map<String, User> test02() {
        System.out.println("test02");
        return null;
    }


    public static void main(String[] args) throws NoSuchMethodException {
        //通过反射获取类、又通过类获取类的方法
        Method test01 = Test11.class.getMethod("test01", Map.class, List.class);
        //获取方法的参数
        Type[] genericParameterTypes = test01.getGenericParameterTypes();
        //遍历参数
        for (Type genericParameterType : genericParameterTypes) {
            //输出参数
            System.out.println(genericParameterType);
            //如果
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }
    }
}
