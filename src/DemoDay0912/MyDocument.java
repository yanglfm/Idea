package DemoDay0912;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MyDocument extends PlainDocument {
    //设置长度
    int length;
    public MyDocument(int length){
        //构造方法
        this.length=length;
    }
    //重写方法
    public void insertString(int offs,
                             String str,
                             AttributeSet a)
            throws BadLocationException {

    }
}
