package com.shocky.calculator.desktop.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bivanovic on 03/10/2016.
 */
public class Window extends JFrame {

    private int windowWidth;
    private int windowHeight;

    private String windowTitle;

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    public Window(){
        this.setWindowHeight(600);
        this.setWindowWidth(450);
        this.setWindowTitle("Calculator");

        JFrame mainWindow = new JFrame(this.getWindowTitle());
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(this.getWindowWidth(), this.getWindowHeight());
        mainWindow.setVisible(true);
    }

    public Window(int windowHeight, int windowWidth, String windowTitle) {
        this.setWindowWidth(windowWidth);
        this.setWindowHeight(windowHeight);
        this.setWindowTitle(windowTitle);

        JFrame mainWindow = new JFrame(this.getWindowTitle());
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(this.getWindowWidth(), this.getWindowHeight());
        mainWindow.setVisible(true);
    }

    //TODO
}
