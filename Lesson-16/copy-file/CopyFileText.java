import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText{
    public void CopyFileText (String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()){
            System.err.println("File nguồn không tồn tại or file bị lỗi!");
            return;
        }

        if(targetFile.exists()){
            System.err.println("File đích không tồn tại hoặc file bị lỗi");
            return;
        }

        int characterCount = 0;

        try (FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(targetFile);){


            int c;
            while ((c = reader.read()) != -1){
                writer.write(c);
                characterCount++;
            }

            System.out.println("Sao chép thành công");
            System.out.println("Đã sao chép tệp từ: " + sourcePath + " -> " + targetPath);
            System.out.println("Tổng số ký tự đã sao chép: " + characterCount);
        } catch (IOException e){
            System.err.println("Đã xảy ra lỗi trong quá trình sao chép tệp: " + e.getMessage());
        }
    }
}
