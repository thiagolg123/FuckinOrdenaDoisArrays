package br.com.thiago.main;

import java.lang.reflect.Method;

import junit.framework.Assert;

import org.junit.Test;

public class UsantoTesteAnnotation{

    public static int getCountAnnotation(Object a){
        int retorno = 0;
        Class<? extends Object> clazz = a.getClass();
       
       Method[] methods = clazz.getMethods();
       
       for(Method m: methods){
           if(m.isAnnotationPresent(Contador.class)){
               Contador c= m.getAnnotation(Contador.class);
               retorno = c.count();
           }
       }
       return retorno;
    }
    
    @Test
    public void testeAnotJunit() {
        TestaAnnotation test = new TestaAnnotation();
        
        test.a();
        
        int value = getCountAnnotation(test);
        
        Assert.assertEquals(1, value);
    }
}
