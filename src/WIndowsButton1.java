/**
 * Created by IntelliJ IDEA.
 * User: 1
 * Date: 13.11.12
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
// предлагаю ввести переписку
//яяяяяяяяяяяяяяяяяяяяяяяя

class FlyObj{
    int X;
    int Y;
    int R;

}

//ввод коментария 30.11.2012

class MyPanel extends JPanel{
    Set <FlyObj>flyObjList;
    int x =0;
    public void paint(Graphics g) {
        
        for(FlyObj rr:flyObjList){
            g.fillOval(rr.X, rr.Y, rr.R, rr.R);

        }

        
        /*g.clearRect(10,20,100,200);
        if (x == 0) g.fillOval(10,20,100,200);
        x++; */
    }
        }

public class WIndowsButton1 {
    
    public static void main (String args[]){
       
        final Set<FlyObj> flyObjList= new HashSet();
        JFrame AWind=new JFrame("Окно");
        AWind.setSize(1000,500);

        final MyPanel APanel = new MyPanel();
        APanel.flyObjList=flyObjList;

        JTextArea oneTextArea=new JTextArea(2,5);


       // AWind.add(APanel);
        //AWind.add(oneTextArea);
        //oneTextArea.setLineWrap(true);

        JButton ABut = new JButton("Кнопка");
        ABut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                               
                FlyObj radian = new FlyObj();
                radian.R=10;
                radian.X=20;
                radian.Y=50;
                flyObjList.add(radian);
            }
        });

        APanel.add(ABut);

        AWind.setVisible(true);


    }


}
