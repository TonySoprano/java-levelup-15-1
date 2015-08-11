package Lecture12;

/**
 * Created by roman on 04.08.15.
 */
public class MyList <T>{
    public CellList firstCell;    // ссылка на первую ячейку в списке
    private CellList currentCell;  // ссылка на активную ячейку
    private CellList lastCell;     // ссылка на последнюю ячейку в списке
    public int size;

    //... тут конструктора и методы add/remove и get/set
    public void add(T data) {
        CellList cell = new CellList(data,lastCell, null,size);
        if (size ==0){
            currentCell = firstCell = lastCell = cell;
        }
        else{
            lastCell = cell;
            currentCell.setNextCell(cell);
            currentCell = cell;
        }
        size++;
    }
    public int getFirstCellIndex(){
        return lastCell.getIndex(firstCell);
    }
    public T getElement(){
        return (T) lastCell.getElement(firstCell);
    }
    public T getElement(CellList cell){
        return (T) cell.getElement(cell);
    }
    public T getElement(int index){
        CellList cell = firstCell;
        T element = null;
        do {
            if (cell.getIndex(cell) == index) {
                element = getElement(cell);
                break;
            } else cell = cell.findNextCell(cell);
        }
        while (!cell.equals(null));
        return element;
    }
    public int findElement(T element){

            CellList cell = firstCell;
             int tr = -1;
        for (int i = 0; i < size; i++) {

            if (element.equals(getElement(cell))) {
                tr= cell.getIndex(cell);
                break;
            } else {

                cell = cell.findNextCell(cell);
            }
        }
        return  tr;
    }
//    public int getIndex(){
//    return  getIndex(firstCell);
//
//    }

//    public int getIndex(CellList firstCell) {
//        return  getIndex(firstCell);
//    }
    // ну и т. д.

}