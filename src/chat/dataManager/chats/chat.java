package chat.dataManager.chats;

import java.util.LinkedList;

public class chat extends message{
    private LinkedList<message> subChats;

    public chat(int id, String message, String user_id, String time) {
        super(id, message,user_id,time);
        subChats.add(new message(0, "Be the first to comment!" , "AAAAAAAAAAAAAAA",""));
    }


}
