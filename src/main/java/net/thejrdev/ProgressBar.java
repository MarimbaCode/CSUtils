package net.thejrdev;

public class ProgressBar {

    private char openChar;
    private char closeChar;
    private char fillChar;
    private char emptyChar;
    private byte length;

    public ProgressBar() {
        this.fillChar = '|';
        this.emptyChar = '-';
        this.openChar = '[';
        this.closeChar = ']';
        this.length = 100;
    }
    public ProgressBar(char fillChar, char emptyChar) {
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.openChar = '[';
        this.closeChar = ']';
        this.length = 100;
    }
    public ProgressBar(char fillChar, char emptyChar, byte length) {
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.length = length;
        this.openChar = '[';
        this.closeChar = ']';
    }
    public ProgressBar(char openChar, char closeChar, char fillChar, char emptyChar) {
        this.openChar = openChar;
        this.closeChar = closeChar;
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.length = 100;
    }
    public ProgressBar(char openChar, char closeChar, char fillChar, char emptyChar, byte length) {
        this.openChar = openChar;
        this.closeChar = closeChar;
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.length = length;
    }

    public char getOpenChar() {
        return openChar;
    }
    public void setOpenChar(char openChar) {
        this.openChar = openChar;
    }
    public char getCloseChar() {
        return closeChar;
    }
    public void setCloseChar(char closeChar) {
        this.closeChar = closeChar;
    }
    public char getFillChar() {
        return fillChar;
    }
    public void setFillChar(char fillChar) {
        this.fillChar = fillChar;
    }
    public char getEmptyChar() {
        return emptyChar;
    }
    public void setEmptyChar(char emptyChar) {
        this.emptyChar = emptyChar;
    }
    public byte getLength() {
        return length;
    }
    public void setLength(byte length) {
        this.length = length;
    }

    public String createBar(byte part, byte total){
        return createBar(((double)part) / (double)total);
    }
    public String createBar(short part, short total){
        return createBar(((double)part) / (double)total);
    }
    public String createBar(int part, int total){
        return createBar(((double)part) / (double)total);
    }
    public String createBar(long part, long total){
        return createBar(((double)part) / (double)total);
    }
    public String createBar(float part, float total){
        return createBar(part/total);
    }
    public String createBar(double part, double total){
        return createBar(part/total);
    }

    protected String createBar(double progress){
        StringBuilder builder = new StringBuilder();
        int repeats = (int)(progress * length);
        builder.append(openChar)
                .append(String.valueOf(fillChar).repeat(repeats))
                .append(String.valueOf(emptyChar).repeat(100 - repeats))
                .append(closeChar);
        return builder.toString();
    }

}
