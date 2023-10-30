package CaseSystemStyle;


import java.util.LinkedList;
import java.util.List;

public class Subject {


    private List<Observer> vector = new LinkedList<>();



    public void addObserver(Observer observer) {
        vector.add(observer);
    }

    //删锟斤拷一锟斤拷锟桔诧拷锟斤拷
    public void deleteObserver(Observer observer) {
        vector.remove(observer);
    }


    public void notifyAllObserver() {
        for(Observer observer : vector) {
            observer.toDo();
        }
    }


    public void notifyOneObserver(int i) {
        vector.get(i).toDo();
    }

}
