package ObjectStyle;

import java.io.*;
import IOPackage.IOTool;
import IOPackage.Input;
import IOPackage.Output;

public class ObjectStyle {
    IOTool IOTool=new IOTool();
    String fileName = null;
    public ObjectStyle(String fileName){
        this.fileName=fileName;
    }
    public void displayStyle() throws Exception {
        Input input = new Input();
        input.input(fileName);

        mShift shift = new mShift(input.getLineTxt());
        shift.shift();
        mAlpha alphabetizer = new mAlpha(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        System.out.println("展示面向对象体系风格案例：");
        System.out.println("展示面向对象体系风格的输入内容：");
        IOTool.tBufferedRead("E:\\software\\softwareTest\\work_tixijiegou\\workText\\input.txt");
        output.output("E:\\software\\softwareTest\\work_tixijiegou\\workText\\output.txt");
        System.out.println("展示面向对象体系风格的结果：");
        IOTool.tBufferedRead("E:\\software\\softwareTest\\work_tixijiegou\\workText\\output.txt");
        System.out.println("面向对象体系结构风格展示完毕");
    }




}
