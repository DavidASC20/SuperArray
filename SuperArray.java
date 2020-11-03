public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray(){
        data = new String[10];
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean add(String element){
        resize();
        data[size] = element;
        return true;
    }

    public String get(int index){
        return data[index];
    }

    public String set(int index, String element){
        data[index] = element;
        return data[index];
    }

    private void resize(){
        String[] bigger = new String[size + 1];
        for(int i = 0; i < data.length + 1; i++){
            bigger[i] = data[i];
        }data = bigger;
        size++;
    }
}
