package Lecture12a;

/**
 * Created by roman on 04.08.15.
 */
public class CellList <T> {
//    private  int index;
    public CellList prevCell;  // ссылка на предыдущую ячейку или null
    public CellList nextCell;  // ссылка на следующую ячейку или null
    private T data;             // данные одной ячейки
//    private int index;

    //... тут конструктора и методы get/set для работы с полями
    CellList(T data, CellList prevCell, CellList nextCell)
    {
        this.data = data;
        this.nextCell = nextCell;
        this.prevCell = prevCell;
    }
    public void setNextCell(CellList nextCell) {

        this.nextCell = nextCell;
    }

    public T getElement(CellList cell){
        return (T) cell.data;
    }
    public CellList findNextCell(CellList cell){
        return cell.nextCell;
    }

}

