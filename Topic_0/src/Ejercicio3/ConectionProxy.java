package Ejercicio3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConectionProxy implements java.lang.reflect.InvocationHandler {

    private Object obj;

    public static Object newInstance(Object obj){

        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new ConectionProxy(obj));

    }

    private ConectionProxy(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result;

        try{

            System.out.println("Antes de llamar al metodo: " + method.getName());
            result = method.invoke(obj, args);

        }catch (InvocationTargetException e){

            throw e.getTargetException();

        }catch (Exception e){

            throw new RuntimeException(e.getMessage());

        }finally {

            System.out.println("Despues de la llamada al metodo: " + method.getName());

        }

        return result;

    }
}
