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
        String[] bigger = new String[data.length * 2];
        for(int i = 0; i < data.length; i++){
            bigger[i] = data[i];
        }data = bigger;
        size++;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void clear(){
        String[] temp = new String[10];
        data = temp;
        size = 0;
    }

    public String toString(){
        String temp = "[";
        for(int i = 0; i < size; i++){
            if( i == size - 1){
                temp += data[i]+ "]";
            }
            temp += data[i] + ", ";
        }return temp;
    }

    public boolean contains(String s){
        for(int i = 0; i < data.length; i++){
            if(data[i].equals(s)){
                return true;
            }
        }return false;
    }

    public SuperArray(int initialCapacity){
        data = new String[initialCapacity];
        size = 0;
    }


    public void add(int index, Sting element){
        String temp = "";
        String temp2 = "";
        for(int i = index; i < size; i++){
            if(i == index){
                temp = data[i];
                data[i] = element;
            }else{
                temp2 = data[i];
                data[i] = temp;
                temp = temp2;
            }
        }
    }

    public int indexOf(String s){
        int bruh = -1;
        for(int i = 0; i < size; i++){
            if(data[i].equals(s)){
                bruh = i;
                break;
            }
        }return bruh;
    }

    public String[] toArray(){
        String[] temp = new String[size];
        for(int i = 0; i < size; i++){
            temp[i] = data[i];
        }return temp;
    }



}
