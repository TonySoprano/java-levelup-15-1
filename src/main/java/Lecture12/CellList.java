package Lecture12;

/**
 * Created by roman on 04.08.15.
 */
public class CellList <T> {
    private  int index;
    private CellList prevCell;  // ссылка на предыдущую ячейку или null
    public CellList nextCell;  // ссылка на следующую ячейку или null
    private T data;             // данные одной ячейки
//    private int index;

    //... тут конструктора и методы get/set для работы с полями
    CellList(T data, CellList prevCell, CellList nextCell, int index)
    {
        this.data = data;
        this.nextCell = nextCell;
        this.prevCell = prevCell;
        this.index = index;
    }
    public void setNextCell(CellList nextCell) {

        this.nextCell = nextCell;
    }
    public int getIndex(CellList cell){
        return cell.index;
    }
    public T getElement(CellList cell){
        return (T) cell.data;
    }
    public CellList findNextCell(CellList cell){
        return cell.nextCell;
    }

}

