package Parte1.Ex4;

import Parte1.Ex2.CircularArrayQueue;

public class CodifyCircularArray {
    private CircularArrayQueue KEY_QUEUE;

    public CodifyCircularArray() {
        KEY_QUEUE = new CircularArrayQueue();
    }
    public void addKey(int offset){
        KEY_QUEUE.enqueue(offset);
    }

    public void removeKey(){
        KEY_QUEUE.dequeue();
    }

    public String encode(String text) {
        StringBuilder encodedText = new StringBuilder();
        if (KEY_QUEUE.isEmpty()) {
            return "Error: No keys added";
        }

        String[] c = text.split("");

        for (int i = 0; i < c.length(); i++) {
            
            if (c == ' '){
                encodedText.append(" ");
                continue;
            }
            int offset = (int) KEY_QUEUE.dequeue();
            KEY_QUEUE.enqueue(offset);
            if (offset == 0) {
                // Handle case where the character is not found
                encodedText.append(c);
            } else {
                char encodedChar = (char) (c + offset);
                encodedText.append(encodedChar);
            }
        }
        return encodedText.toString();
    }

}
