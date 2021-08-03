package ru.brown.chapters.inner_classes.page295_ex2;

public class Prison {
    private static int prisonCounter = 0;
    private String cell = "Cell-1";

    public String getCell() {
        return cell;
    }
    private void announceCell(){
        System.out.println(cell);
    }
    Guard createGuard(){
        return new Guard();
    }
    public void cellChange(){
        Guard guard = createGuard();
        guard.changeCell("Cell-2");
    }

    @Override
    public String toString() {
        return "Prison { " + (prisonCounter++)+" cell=' " + cell + '\'' +'}';
    }

    class Guard{
        private String bat = "wooden stab";
        public String getBat() {
            return bat;
        }
        Prison getPrison(){
            return Prison.this;
        }

        void changeCell(String anotherCell){
            cell = anotherCell;
            announceCell();
        }
    }


}
