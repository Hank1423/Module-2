import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(){
        this.randomList = new RandomList();
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
    }

    public void printRandomEvenList(int size, int min, int max){
        System.out.println("Bắt đầu xử lí qua Facade");
        List<Integer> numbers = randomList.generateList(size, min, max);
        System.out.print("Danh sách gốc: ");
        listPrinter.printList(numbers);

        List<Integer> evenNumbers = listFilter.filterOdd(numbers);

        System.out.print("Danh sách số chẵn sau khi lọc: ");
        listPrinter.printList(evenNumbers);

        System.out.println("=== Quy trình kết thúc thành công ===");
    }
}
