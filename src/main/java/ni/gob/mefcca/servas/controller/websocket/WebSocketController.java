package ni.gob.mefcca.servas.controller.websocket;

import ni.gob.mefcca.servas.model.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chatroom")
    @SendTo("/topic/chatroom")
    public Mensaje sendMessage(Mensaje mensaje, MessageHeaders messageHeaders, Principal usuario){
        System.out.println("Usuario:"+ usuario.getName());
        return mensaje;
    }

}
