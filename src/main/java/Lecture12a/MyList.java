package Lecture12a;

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
        CellList cell = new CellList(data,lastCell, null);
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
    public void add(int index,T data){
        int indexInner =0;
        CellList cellBuffer = firstCell;
        do {
            indexInner++;
            cellBuffer = cellBuffer.nextCell;
        }while (indexInner<index);
        CellList cell = new CellList(data,cellBuffer.prevCell, cellBuffer);
        cellBuffer.prevCell.nextCell = cell;
        cellBuffer.prevCell = cell;
        //cell.nextCell = cellBuffer;
        size++;

    }
    public Integer getIndex(CellList cell){
        Integer index = null;
        CellList cellBuffer = firstCell;
        do{
            cellBuffer = cellBuffer.nextCell;
            index++;
        }
        while (cellBuffer.equals(cell));
        return index;
    }

    public T getElement(int index){
        CellList cell = firstCell;
        T element = null;
        int i = 0;
        do {
            element =(T) cell.getElement(cell);
            cell = cell.findNextCell(cell);
            i++;
        }
        while (i <= index);
        return  element;
    }
    public void rmIndex(int index){
        int indexInner =0;
        CellList cellBuffer = firstCell;
        do {
            indexInner++;
            cellBuffer = cellBuffer.nextCell;
        }while (indexInner<index);
        cellBuffer.prevCell.nextCell = cellBuffer.nextCell;
        cellBuffer.nextCell.prevCell = cellBuffer.prevCell;
    }
//    public T getElement(){
//
//        return (T) lastCell.getElement(firstCell);
//    }
//    public T getElement(CellList cell){
//
//        return (T) cell.getElement(cell);
//    }

//    public int findElement(T element){
//
//            CellList cell = firstCell;
//             int tr = -1;
//        for (int i = 0; i < size; i++) {
//
//            if (element.equals(getElement(cell))) {
//                tr= cell.getIndex(cell);
//                break;
//            } else {
//
//                cell = cell.findNextCell(cell);
//            }
//        }
//        return  tr;
//    }
//    public int getIndex(){
//    return  getIndex(firstCell);
//
//    }

//    public int getIndex(CellList firstCell) {
//        return  getIndex(firstCell);
//    }
    // ну и т. д.

}