package com.thjava.helloworld.controller;


import com.thjava.helloworld.model.Model;
import com.thjava.helloworld.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controller implements ActionListener { 
    
    // ประกาศตัวแปร  
    private Model m;
    private View v;
    
    // constructor  
    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;
        v.setVisible(true); 
        
        // set action commands
        v.getBtnEnter().setActionCommand("Enter");
        v.getBtnClear().setActionCommand("Clear");
        v.getRandom().setActionCommand("show");
        // ดักฟังเหตุการณ์บนหน้าจอ   
        v.getBtnEnter().addActionListener(this);    
        v.getBtnClear().addActionListener(this);
        v.getRandom().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();  
        
        if(command.equals("Enter")) {
            String [] has = {"","","","",""};
            //System.out.println("Enter...");
            has[0] = v.getTxtName2().getText();
            has[1] = v.getTxtName3().getText();
            has[2] = v.getTxtName4().getText();
            has[3] = v.getTxtName5().getText();
            has[4] = v.getTxtName6().getText();
            //System.out.println(name);   
            if(!has.equals("")) {
                m.sethashtag(has);  
                // ล้างค่าใน Text Field
                //v.getTxtName2().setText("");
                //v.getTxtName3().setText(""); 
                //v.getTxtName4().setText(""); 
                //v.getTxtName5().setText(""); 
                //v.getTxtName6().setText(""); 
                //สุ่ม Account
                m.random();
                JOptionPane.showMessageDialog(v, "gen Account finish", "แจ้งเตือน", 2);
            } 
            else {
                // กรณีไม่กรอกข้อมูลเข้ามา
                JOptionPane.showMessageDialog(v, "กรุณากรอกชื่อ", "แจ้งเตือน", 2);    
            }
        }
        
        if(command.equals("Clear")) {
            //System.out.println("Clear..."); 
                v.getTxtName2().setText("");
                v.getTxtName3().setText(""); 
                v.getTxtName4().setText(""); 
                v.getTxtName5().setText(""); 
                v.getTxtName6().setText("");   
        }
        
        if(command.equals("show")){
            String[] acc = m.showAcc();
            v.showResult(acc);
            
        }
        
    }
}


