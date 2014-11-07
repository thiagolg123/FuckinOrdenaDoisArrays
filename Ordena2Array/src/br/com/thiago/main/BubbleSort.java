package br.com.thiago.main;


public class BubbleSort {

    /**
     * @param a
     * @param b
     * @return
     */
    public static int[] ordenaArrays(int[] a, int[] b){
        int[] retorno = {};
        int sizeFull = a.length+b.length;
        int aux = 0;
        
        if(sizeFull != 0){
            retorno = juntaDoisArrays(a, b);
            
            for(int i= (retorno.length-1); i>= 1; i--){
                for(int j=0; j< i; j++){
                   if(retorno[j] > retorno[j+1]){
                       aux = retorno[j];
                       retorno[j] = retorno[j+1];
                       retorno[j+1] = aux;
                   } 
                }
            }
        }    
        return retorno;
    }
    
    
    /**
     * @param a
     * @param b
     * @return
     */
    public static int[] juntaDoisArrays(int[]a, int[]b){
        int sizeBoth = a.length + b.length;
        int[] retorno = new int[sizeBoth];
        int count = 0;
        
        if(sizeBoth != 0){
            for(int i=0; i < a.length; i++){
                retorno[i] = a[i];
                count++;
            }
        
         //ajuntando o segundo array ao primeiro
            for(int j=0; j < b.length; j++){
                retorno[count++]= b[j];
            }
        }
        
        return retorno;
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] a= {1,2,3,4,56,7,8,9,12,2341,412,12,24,4,5,12,35,15,123,56,6,23,6,3,7,7,3,4,5,23,5,2,35,23,25,5,235,256,2,253,5235,325,23,5,25,5,25,3,5,3,2,52,32,12133};
        int[] b= {23,51,12,451,11,1,56,45,45,8,46,9,56,7,9,56,7,94,56,5689,456,84,568,467,84,568,45,684,568,456,845,68,456,845,13,4568,45,68,45,684,5684,564,568,4,48,58,5};
        int[] toShow = ordenaArrays(a, b);
        
        for(int i=0; i<toShow.length; i++){
          System.out.println(toShow[i]);
        }  
    }
}
