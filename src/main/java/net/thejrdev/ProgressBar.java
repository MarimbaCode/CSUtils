package net.thejrdev;

public class ProgressBar {

    private char openChar;
    private char closeChar;
    private char fillChar;
    private char emptyChar;
    private byte length;

    /**Creates a new progress bar with default values
     *
     */
    public ProgressBar() {
        this.fillChar = '|';
        this.emptyChar = '-';
        this.openChar = '[';
        this.closeChar = ']';
        this.length = 100;
    }

    /**Creates a new progress bar with user specified values
     *
     * @param fillChar The char representing a filled spot in the progress bar
     * @param emptyChar The char representing an empty spot in the progress bar
     */
    public ProgressBar(char fillChar, char emptyChar) {
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.openChar = '[';
        this.closeChar = ']';
        this.length = 100;
    }

    /**Creates a new progress bar with user specified values
     *
     * @param fillChar The char representing a filled spot in the progress bar
     * @param emptyChar The char representing an empty spot in the progress bar
     * @param length The length of the progress bar
     */
    public ProgressBar(char fillChar, char emptyChar, byte length) {
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.length = length;
        this.openChar = '[';
        this.closeChar = ']';
    }

    /**Creates a new progress bar with user specified values
     *
     * @param openChar The char representing the left border of the progress bar
     * @param closeChar The char representing the right border of the progress bar
     * @param fillChar The char representing a filled spot in the progress bar
     * @param emptyChar The char representing an empty spot in the progress bar
     */
    public ProgressBar(char openChar, char closeChar, char fillChar, char emptyChar) {
        this.openChar = openChar;
        this.closeChar = closeChar;
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.length = 100;
    }

    /**Creates a new progress bar with user specified values
     *
     * @param openChar The char representing the left border of the progress bar
     * @param closeChar The char representing the right border of the progress bar
     * @param fillChar The char representing a filled spot in the progress bar
     * @param emptyChar The char representing an empty spot in the progress bar
     * @param length The length of the progress bar
     */
    public ProgressBar(char openChar, char closeChar, char fillChar, char emptyChar, byte length) {
        this.openChar = openChar;
        this.closeChar = closeChar;
        this.fillChar = fillChar;
        this.emptyChar = emptyChar;
        this.length = length;
    }

    /**Gets the character representing the left border of the progress bar
     *
     * @return The char representing the left border of the progress bar
     */
    public char getOpenChar() {
        return openChar;
    }
    /**Sets the character representing the left border of the progress bar
     *
     * @param openChar The char representing the left border of the progress bar
     */
    public void setOpenChar(char openChar) {
        this.openChar = openChar;
    }
    /**Gets the character representing the right border of the progress bar
     *
     * @return The char representing the right border of the progress bar
     */
    public char getCloseChar() {
        return closeChar;
    }
    /**Sets the character representing the right border of the progress bar
     *
     * @param closeChar The char representing the right border of the progress bar
     */
    public void setCloseChar(char closeChar) {
        this.closeChar = closeChar;
    }
    /**Gets the character representing a filled spot in the progress bar
     *
     * @return The char representing a filled spot in the progress bar
     */
    public char getFillChar() {
        return fillChar;
    }
    /**Sets the character representing a filled spot in the progress bar
     *
     * @param fillChar the char representing a filled spot in the progress bar
     */
    public void setFillChar(char fillChar) {
        this.fillChar = fillChar;
    }
    /**Gets the character representing an empty spot in the progress bar
     *
     * @return The char representing an empty spot in the progress bar
     */
    public char getEmptyChar() {
        return emptyChar;
    }
    /**Sets the character representing an empty spot in the progress bar
     *
     * @param emptyChar The char used to represent an empty spot in the progress bar
     */
    public void setEmptyChar(char emptyChar) {
        this.emptyChar = emptyChar;
    }
    /**Gets the length of the progress bar
     *
     * @return The current length of the progress bar
     */
    public byte getLength() {
        return length;
    }
    /**Changes the length of the progress bar
     *
     * @param length New length of the progress bar
     */
    public void setLength(byte length) {
        this.length = length;
    }

    /**Creates a progress bar filled to a specific progress
     *
     * @param part A byte representing the progress (EX: 25.0)
     * @param total A byte representing the total amount of progress needed to complete the bar (EX: 100.0)
     * @return A progress bar filled to a specific point
     */
    public String createBar(byte part, byte total){
        return createBar(((double)part) / (double)total);
    }
    /**Creates a progress bar filled to a specific progress
     *
     * @param part A short representing the progress (EX: 25.0)
     * @param total A short representing the total amount of progress needed to complete the bar (EX: 100.0)
     * @return A progress bar filled to a specific point
     */
    public String createBar(short part, short total){
        return createBar(((double)part) / (double)total);
    }
    /**Creates a progress bar filled to a specific progress
     *
     * @param part An integer representing the progress (EX: 25.0)
     * @param total An integer representing the total amount of progress needed to complete the bar (EX: 100.0)
     * @return A progress bar filled to a specific point
     */
    public String createBar(int part, int total){
        return createBar(((double)part) / (double)total);
    }
    /**Creates a progress bar filled to a specific progress
     *
     * @param part A long representing the progress (EX: 33)
     * @param total A long representing the total amount of progress needed to complete the bar (EX: 100.0)
     * @return A progress bar filled to a specific point
     */
    public String createBar(long part, long total){
        return createBar(((double)part) / (double)total);
    }
    /**Creates a progress bar filled to a specific progress
     *
     * @param part A float representing the progress (EX: 25.0)
     * @param total A float representing the total amount of progress needed to complete the bar (EX: 100.0)
     * @return A progress bar filled to a specific point
     */
    public String createBar(float part, float total){
        return createBar(part/total);
    }
    /**Creates a progress bar filled to a specific progress
     *
     * @param part A double representing the progress (EX: 25.0)
     * @param total A double representing the total amount of progress needed to complete the bar (EX: 100.0)
     * @return A progress bar filled to a specific point
     */
    public String createBar(double part, double total){
        return createBar(part/total);
    }

    /**Creates a progress bar filled to a specified progress
     *
     * @param progress The progress of the bar represented as a double between 0 and 1
     * @return A String progress bar
     */
    protected String createBar(double progress){

        StringBuilder builder = new StringBuilder();
        progress = progress > 1 ? 1 : progress;
        progress = progress < 0 ? 0 : progress;
        int repeats = (int)(progress * length);
        builder.append(openChar)
                .append(String.valueOf(fillChar).repeat(repeats))
                .append(String.valueOf(emptyChar).repeat(100 - repeats))
                .append(closeChar);
        return builder.toString();
    }

}
