import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
//    private static final String File_URL = "D:\CODEGYM\MODULE-2\ReadFileExample\src\demo.txt";
    public void readFileText(String filePath){
        try{
            // doc file theo duong dan
            File file = new File(filePath);

            //kiem tra neu file khong ton tai thi nem ra ngoai le
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            //doc tung dong cua file va tien hanh cong tong lai
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            //hien thi ra man hinh tong cac so nguyen tong file
            System.out.println("tong = "+sum);
        }catch (Exception e){
            //truong hop file k ton tai hoac noi dung file co loi thi hien ra thong bao
            System.out.println("file khong ton tai hoac noi dung co loi");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
