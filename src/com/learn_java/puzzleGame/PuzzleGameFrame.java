package com.learn_java.puzzleGame;

import javax.swing.*;

public class PuzzleGameFrame extends JFrame {
    
    public PuzzleGameFrame() {
        //初始化窗口
        initGameFrame();
        //初始化菜单
        initJMenuBar();
        //初始化图片
        initPicture();
        setVisible(true);
    }

    private void initPicture() {
        ImageIcon imageIcon = new ImageIcon("E:\\java\\JavaSE\\image\\赫卡蒂.png");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,105,105);//这里使用循环摆放图片
        this.getContentPane().add(label);
//        setLayout(null);
    }

    private void initJMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        //
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        //
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");
        //
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        //
        menuBar.add(functionJMenu);
        menuBar.add(aboutJMenu);
        //
        this.setJMenuBar(menuBar);
    }

    private void initGameFrame() {
        setTitle("Puzzle Game V1.0");//设置标题
        setSize(603,680);//设置窗体大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭
        setLocationRelativeTo(null);//窗体位置居中

    }

}
