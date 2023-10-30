package PipeStyle;

import IOPackage.IOTool;

import java.io.File;
import java.io.IOException;

public class PipeStyle {
    public static  void display() throws Exception {
        File inFile = new File("E:\\software\\softwareTest\\work_tixijiegou\\workText\\input3.txt");
        File outFile = new File("E:\\software\\softwareTest\\work_tixijiegou\\workText\\output3.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

        System.out.println("开始展示管道-过滤体系结构风格案例：");
        System.out.println("展示管道-过滤体系风格的输入内容：");
        IOTool.tBufferedRead("E:\\software\\softwareTest\\work_tixijiegou\\workText\\input3.txt");
        System.out.println("展示管道-过滤体系风格的输出结果：");
        IOTool.tBufferedRead("E:\\software\\softwareTest\\work_tixijiegou\\workText\\output3.txt");
        System.out.println("管道-过滤体系结构风格展示完毕。");
    }
}
