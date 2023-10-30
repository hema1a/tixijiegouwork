package CaseSystemStyle;


import IOPackage.IOTool;

public class CasSystemStyle {
    public static void display() throws Exception {
        //创建主题
        KWICSubjects kwicSubject = new KWICSubjects();
        String fileName1="E:\\software\\softwareTest\\work_tixijiegou\\workText\\input2.txt";
        String fileName2="E:\\software\\softwareTest\\work_tixijiegou\\workText\\output2.txt";
        //创建观察者
        Input input = new Input(fileName1);
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(alphabetizer.getKwicList(), fileName2);

        // 将观察者加入主题
        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);
        // 逐步调用各个观察者
        kwicSubject.startKWIC();

        System.out.println("开始展示事件系统体系结构风格案例：");
        System.out.println("展示事件系统体系风格的输入内容：");
        IOTool.tBufferedRead(fileName1);
        System.out.println("展示事件系统体系风格的输出结果：");
        IOTool.tBufferedRead(fileName2);
        System.out.println("事件系统体系结构风格展示完毕。");
    }
}
