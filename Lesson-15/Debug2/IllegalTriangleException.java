public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(){
        super("Ba cạnh nhập vào không tạo thành một tam giác hợp lệ");
    }

    public IllegalTriangleException(String message){
        super(message);
    }
}
