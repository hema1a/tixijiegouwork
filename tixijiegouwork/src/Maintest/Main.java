package Maintest;

import CaseSystemStyle.CasSystemStyle;
import IOPackage.IOTool;
import ObjectStyle.ObjectStyle;
import PipeStyle.PipeStyle;
import ZhuAndZiStyle.ZhuAndZiStyle;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        IOTool IOTool=new IOTool();


        System.out.println("请输入您需要使用的体系结构风格：");
        System.out.println("1--面向对象体系结构风格");
        System.out.println("2--主程序子程序体系结构风格");
        System.out.println("3--事件系统软件体系结构");
        System.out.println("4--管道-过滤软件体系结构");
        int num=scanner.nextInt();



        if(num==1){


            StringBuilder data=  inputCase();
            String fileName="E:\\software\\softwareTest\\work_tixijiegou\\workText\\input.txt";
            ObjectStyle objectStyle= new ObjectStyle(fileName);
            IOTool.writeFile(fileName,data.toString());
            System.out.println("展示面向对象体系结构原理图：");
            displayimg("E:\\software\\softwareTest\\work_tixijiegou\\images\\duixiang.png");
            Thread.sleep(5000);
            objectStyle.displayStyle();
        }else if(num==2){

            StringBuilder data=  inputCase();
            String fileName1="E:\\software\\softwareTest\\work_tixijiegou\\workText\\input1.txt";
            String fileName2="E:\\software\\softwareTest\\work_tixijiegou\\workText\\output1.txt";
            System.out.println("展示主程序子程序体系结构原理图：");
            displayimg("E:\\software\\softwareTest\\work_tixijiegou\\images\\zhu.jpg");
            Thread.sleep(5000);
            ZhuAndZiStyle zhu_ziStyle=new ZhuAndZiStyle();
            IOTool.writeFile(fileName1,data.toString());


            Thread.sleep(5000);
            zhu_ziStyle.display();

        }
        else if(num==3){

            StringBuilder data=  inputCase();
            String fileName1="E:\\software\\softwareTest\\work_tixijiegou\\workText\\input2.txt";
            String fileName2="E:\\software\\softwareTest\\work_tixijiegou\\workText\\output2.txt";

            CasSystemStyle caseSystemStyle=new CasSystemStyle();
            IOTool.writeFile(fileName1,data.toString());
            System.out.println("展示事件系统体系结构原理图：");
            displayimg("E:\\software\\softwareTest\\work_tixijiegou\\images\\case3.png");
            Thread.sleep(5000);
            caseSystemStyle.display();
        }
        else if(num==4){


            StringBuilder data=  inputCase();
            String fileName1="E:\\software\\softwareTest\\work_tixijiegou\\workText\\input3.txt";
            String fileName2="E:\\software\\softwareTest\\work_tixijiegou\\workText\\output3.txt";

            PipeStyle pipeStyle=new PipeStyle();
            IOTool.writeFile(fileName1,data.toString());
            System.out.println("展示管道过滤体系结构原理图：");
            displayimg("E:\\software\\softwareTest\\work_tixijiegou\\images\\pipe.png");
            Thread.sleep(5000);
            pipeStyle.display();
        }



    }
    public static StringBuilder inputCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的案例：");
        String nextLine = scanner.nextLine();
        StringBuilder data=new StringBuilder();
        while (nextLine != null && !nextLine.equals("")) {
            data.append(nextLine).append("\n");
            nextLine = scanner.nextLine();
        }
        return data;
    }

                        public static void displayimg(String name) {

                    // 创建一个 JFrame 对象

                            JFrame frame = new JFrame("Display Image");

                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // 创建一个 JLabel 对象，并设置图片

                            ImageIcon imageIcon = new ImageIcon(name);

                            JLabel label = new JLabel(imageIcon);

                    // 将 JLabel 添加到 JFrame 中

                            frame.getContentPane().add(label, BorderLayout.CENTER);

                    // 设置 JFrame 的大小和可见性

                            frame.setSize(1000, 800);

                            frame.setVisible(true);

                        }


        }

