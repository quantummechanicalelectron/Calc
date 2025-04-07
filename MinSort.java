public class MinSort extends Parent{

    int[] zahlen = new int[10];

    public void ausführen(){
        for(int i = zahlen.length - 1; i >= 0; i--){
            printIntegerErgebnis(zahlen[i]);
        }
    }
}
