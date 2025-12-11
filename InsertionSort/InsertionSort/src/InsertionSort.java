import java.util.Arrays;

public class InsertionSort {

    public void sort(int[] arr){
        int n = arr.length;

        for(int i = 1; i<n ; i++){
            int temp=arr[i];//el primer elemento de la parte desordenada(comparativo)
            int j = i-1;
            while(j>=0 && arr[j]>temp){//recorrer la parte ordenada(fin-inicio)
                //recorrer la derecha los elementos mayores al temporal
                arr[j+1]=arr[j];
                j--;

            }
            //insertar el elemento en su posicion correcta
            arr[j+1]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }

}
