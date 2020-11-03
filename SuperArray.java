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
        if(size == data.length){
            resize();
            data[size-1] = element;
        }else{
            data[size] = element;
            size++;
        }return true;
    }

    public String get(int index){
        return data[index];
    }

    public String set(int index, String element){
        String temp = data[index];
        data[index] = element;
        return temp;
    }

    private void resize(){
        String[] bigger = new String[data.length + 1];
        for(int i = 0; i < data.length; i++){
            bigger[i] = data[i];
        }data = bigger;
        size++;
    }
}