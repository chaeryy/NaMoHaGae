package kr.kro.namohagae.puchingtest.controller;



import kr.kro.namohagae.puchingtest.dto.ChatRoomDto;
import kr.kro.namohagae.puchingtest.dto.MessageDto;
import kr.kro.namohagae.puchingtest.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ChatRestController {
    @Autowired
    private ChatService service;

    @GetMapping("/findchatroom")
    public ResponseEntity<List<ChatRoomDto.Read>> findByChatRoom(Principal principal){
        String username = principal.getName();

        List<ChatRoomDto.Read> list =service.findByChatRoom(username);

        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/findchatlog")
    public ResponseEntity<List<MessageDto.MessageRead>> findByChatLog(Principal principal, Integer memberNo1, Integer memberNo2) {



        return null;
    }




}
