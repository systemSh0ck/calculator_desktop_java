package com.shocky.calculator.desktop.View;

import javax.swing.*;

/**
 * Created by bivanovic on 04/10/2016.
 */
public class NumberButton extends JPanel{

    private String numberLabel = "X";
    private int panelWidth = 300;
    private int panelHeight = 300;
    private int panelXOffset = 1;
    private int panelYOffset = 1;
    private int buttonWidth = 200;
    private int buttonHeight = 200;
    private int buttonXOffset = 1;
    private int buttonYOffset = 1;
    private JPanel numberButtonPanel;
    private JButton numberButton;

    public NumberButton() {
        this.numberButtonPanel = new JPanel();
        this.numberButtonPanel.setLayout(null);
        this.numberButton = new JButton(this.getNumberLabel());

        this.numberButtonPanel.setBounds(
                this.getPanelXOffset(),
                this.getPanelYOffset(),
                this.getPanelWidth(),
                this.getPanelHeight()
        );
        this.numberButton.setBounds(
                this.getButtonXOffset(),
                this.getButtonYOffset(),
                this.getButtonWidth(),
                this.getButtonHeight()
        );

        numberButtonPanel.add(numberButton);

    }

    public NumberButton(String numberLabel, int panelWidth, int panelHeight, int panelXOffset, int panelYOffset, int buttonWidth, int buttonHeight, int buttonXOffset, int buttonYOffset) {
        this.numberLabel = numberLabel;
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
        this.panelXOffset = panelXOffset;
        this.panelYOffset = panelYOffset;
        this.buttonWidth = buttonWidth;
        this.buttonHeight = buttonHeight;
        this.buttonXOffset = buttonXOffset;
        this.buttonYOffset = buttonYOffset;
    }

    public int getPanelWidth() {
        return panelWidth;
    }

    public void setPanelWidth(int panelWidth) {
        this.panelWidth = panelWidth;
    }

    public int getPanelHeight() {
        return panelHeight;
    }

    public void setPanelHeight(int panelHeight) {
        this.panelHeight = panelHeight;
    }

    public int getPanelXOffset() {
        return panelXOffset;
    }

    public void setPanelXOffset(int panelXOffset) {
        this.panelXOffset = panelXOffset;
    }

    public int getPanelYOffset() {
        return panelYOffset;
    }

    public void setPanelYOffset(int panelYOffset) {
        this.panelYOffset = panelYOffset;
    }

    public int getButtonWidth() {
        return buttonWidth;
    }

    public void setButtonWidth(int buttonWidth) {
        this.buttonWidth = buttonWidth;
    }

    public int getButtonHeight() {
        return buttonHeight;
    }

    public void setButtonHeight(int buttonHeight) {
        this.buttonHeight = buttonHeight;
    }

    public int getButtonXOffset() {
        return buttonXOffset;
    }

    public void setButtonXOffset(int buttonXOffset) {
        this.buttonXOffset = buttonXOffset;
    }

    public int getButtonYOffset() {
        return buttonYOffset;
    }

    public void setButtonYOffset(int buttonYOffset) {
        this.buttonYOffset = buttonYOffset;
    }

    public String getNumberLabel() {
        return numberLabel;
    }

    public void setNumberLabel(String numberLabel) {
        this.numberLabel = numberLabel;
    }

    public JPanel getNumberButtonPanel() {
        return numberButtonPanel;
    }

    public void setNumberButtonPanel(JPanel numberButtonPanel) {
        this.numberButtonPanel = numberButtonPanel;
    }

    public JButton getNumberButton() {
        return numberButton;
    }

    public void setNumberButton(JButton numberButton) {
        this.numberButton = numberButton;
    }
}
