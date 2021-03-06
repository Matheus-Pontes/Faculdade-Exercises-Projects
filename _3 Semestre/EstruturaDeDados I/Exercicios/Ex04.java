public class Ex04 
{
    public static void main(String[] args) 
    {
        String arrayA[] = { "Angola", "Chile", "Grécia", "Itália", "Moçambique", "Portugal", "Rússia", "Suécia" };
        
        String arrayB[] = { "Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia", "Uruguai" };
        
        String arraysContate[] = new String[arrayA.length + arrayB.length];
        String arrayAux[] = new String[arrayA.length + arrayB.length];

        System.arraycopy(arrayA, 0, arraysContate, 0, arrayA.length);
        System.arraycopy(arrayB, 0, arraysContate, arrayA.length, arrayB.length);

        mergeSort(arraysContate, arrayAux, 0, arraysContate.length - 1);

        for(var valor : arraysContate) 
            System.out.print(" | " + valor);
    }

    public static void mergeSort(String[] array, String[] arrayAux, int start, int end) 
    {
        if(start < end) 
        {
            int middle = (start + end) / 2;
            mergeSort(array, arrayAux, start, middle);
            mergeSort(array, arrayAux, middle + 1, end);
            mergeArray(array, arrayAux, start, middle, end);
        }
    }

    public static void mergeArray(String[] array, String[] arrayAux, int start, int middle, int end) 
    {

        for (int i=start; i <= end; i++) 
        {
            arrayAux[i] = array[i];
        }
        
        int topleft = start;
        int topRight = middle + 1;

        for(int k=start; k <= end; k++) 
        {
            if (topleft > middle) 
            {
                array[k] = arrayAux[topRight];
                topRight++;
            }
            else if (topRight > end) 
            {
                array[k] = arrayAux[topleft];
                topleft++;
            }
            else if (arrayAux[topleft].compareToIgnoreCase(arrayAux[topRight]) > 0) 
            {
                array[k] = arrayAux[topleft];
                topleft++;
            }
            else 
            {
                array[k] = arrayAux[topRight];
                topRight++;  
            }
        }
    }
}
