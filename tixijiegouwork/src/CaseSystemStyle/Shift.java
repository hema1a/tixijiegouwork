package CaseSystemStyle;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Shift implements Observer {
    private ArrayList<String> kwicList = new ArrayList<String>();
    private ArrayList<String> lineTxt;

    public Shift( ArrayList<String> lineTxt) {
        this.lineTxt = lineTxt;
    }

    public ArrayList<String> getKwicList() {
        return kwicList;
    }


    public ArrayList<String> getLineTxt() {
        return lineTxt;
    }

    @Override
    public void toDo() {
        //锟斤拷取每锟斤拷锟斤拷锟绞ｏ拷锟斤拷锟斤拷tokens
        Iterator<String> it = lineTxt.iterator();
        while (it.hasNext()) {
            StringTokenizer token = new StringTokenizer(it.next());
            ArrayList<String> tokens = new ArrayList<String>();
            int i = 0;
            //循锟斤拷锟斤拷拥锟斤拷锟�
            int count = token.countTokens();
            while (i < count) {
                tokens.add(token.nextToken());
                i++;
            }

            //display(tokens);
            //锟叫革拷锟斤拷锟斤拷锟斤拷剩锟斤拷锟斤拷细谋锟斤拷锟绞贾碉拷锟斤拷锟斤拷锟絣oop实锟斤拷位锟狡★拷
            for (i = 0; i < count; i++) {
                StringBuffer lineBuffer = new StringBuffer();
                int index = i;
                for (int f = 0; f < count; f++) {
                    //锟斤拷头锟斤拷锟斤拷位锟斤拷
                    if (index >= count)
                        index = 0;
                    //锟斤拷锟斤拷StringBuffer
                    lineBuffer.append(tokens.get(index));
                    lineBuffer.append(" ");
                    index++;
                }
                String tmp = lineBuffer.toString();
                kwicList.add(tmp);
            }
        }

    }

}