package week6;

class LinkedListChatHistory implements ErasableChatHistory {
    record ChatLL(String msg, ChatLL rest) {};
    private ChatLL list;

    public void addMessage(String msg) {
        this.list = new ChatLL(msg, this.list);
    }

    public void display() {
        ChatLL current = this.list;
        while (current != null) {
            IO.println(current.msg());
            current = current.rest();
        }
    }

    public void erase() {
        this.list = null;
    }
}