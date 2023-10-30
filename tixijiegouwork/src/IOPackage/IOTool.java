package IOPackage;

import java.io.*;

public class IOTool {


    /**
     * 字符缓冲输入流
     * 读取txt文件内容 并在控制台打印
     */
    public static void tBufferedRead(String Name) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(Name));
        char[] chars = new char[1024];
        int len = 0;
        StringBuilder sb = new StringBuilder();

        while ((len = bufferedReader.read(chars))!=-1){
            sb.append(chars,0,len);
        }
        bufferedReader.close();
        System.out.println(sb.toString());
    }

    //输出流，将控制台内容存进文件
    public static void writeFile(String fileName, String data){
        try{
            File file =new File(fileName);
            //如果文件不存在则创建
            if(!file.exists()){
                file.createNewFile();
            }
            //FileWriter(file,true)，true 表示可以将数据写入文件的末尾而不会替换文件原来的内容
            FileWriter fileWritter = new FileWriter(file,false);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(data);
            //bufferWritter.write("\n");
            bufferWritter.close();
            System.out.println("写入成功");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
