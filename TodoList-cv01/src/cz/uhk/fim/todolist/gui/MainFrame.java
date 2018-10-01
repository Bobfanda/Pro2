package cz.uhk.fim.todolist.gui;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }

    private void init() {
        setTitle("Todo List App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,400);
        setLocationRelativeTo(null);
    }

}
