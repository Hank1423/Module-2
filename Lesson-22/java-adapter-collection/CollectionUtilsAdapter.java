import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.codegym.CollectionUtils;

public class CollectionUtilsAdapter implements CollectionOperations{
    private CollectionUtils collectionUtils;

    public CollectionUtilsAdapter(){
        this.collectionUtils = new CollectionUtils();
    }

    @Override
    public int findMax(Set<Integer> numbers){
        System.out.println("Tiếp nhận một tập hợp");
        List<Integer> numberList = new ArrayList<>(numbers);
        System.out.println("Đã chuyển đổi thành công");
        return collectionUtils.findMax(numberList);
    }
}
