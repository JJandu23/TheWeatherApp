package edu.uw.tcss450.varpar.weatherapp.chat;

import java.util.Arrays;
import java.util.List;

public class ChatRoomMessageGenerator {

    private static final ChatRoomMessage[] CHATS;
    public static final int COUNT = 12;

    private static String[] messages = new String[4];

    static {


        messages[0] = "Lorem ipsum dolor sit amet.";
        messages[1] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam iaculis mollis lorem eu mollis. Sed ullamcorper malesuada lectus, eget viverra leo blandit in. Aliquam elementum risus in mauris efficitur rutrum. Donec sapien lacus, viverra ut ornare sit amet, tincidunt non nunc. Donec ac eros vel arcu maximus scelerisque. Proin ut luctus nibh, at tincidunt nisl. Aenean id erat malesuada, gravida nisi a, consectetur mauris. Aliquam semper, est non suscipit accumsan, purus urna tincidunt metus, vel eleifend metus odio ut nisl. Nulla nibh tellus, semper non mi eget, feugiat cursus lorem.";
        messages[2] = "lorem";
        messages[3] = "lol";
        messages[4] = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et.";
        CHATS = new ChatRoomMessage[COUNT];
        for (int i = 0; i < CHATS.length; i++) {
            CHATS[i] = new ChatRoomMessage
                    .Builder(messages[i])
                    .build();
        }
    }

    public static List<ChatRoomMessage> getChatRoomMessagesAsList() {
        return Arrays.asList(CHATS);
    }

    public static ChatRoomMessage[] getChatRoomMessages() {
        return Arrays.copyOf(CHATS, CHATS.length);
    }

    private ChatRoomMessageGenerator() { }



}