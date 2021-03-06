package com.geekbangg.chatroom;

import com.geekbangg.chatroom.server.ChatRoomServer;

import java.io.IOException;

import static com.geekbangg.chatroom.common.Constants.SERVER_PORT;

public class ChatRoomServerAppMain {
    public static void main(String[] args) throws IOException {
        ChatRoomServer server = new ChatRoomServer(SERVER_PORT);
        server.start();
    }
}
