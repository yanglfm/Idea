package DemoDay0912;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MyDocument extends PlainDocument {
    //���ó���
    int length;
    public MyDocument(int length){
        //���췽��
        this.length=length;
    }
    //��д����
    public void insertString(int offs,
                             String str,
                             AttributeSet a)
            throws BadLocationException {

    }
}
