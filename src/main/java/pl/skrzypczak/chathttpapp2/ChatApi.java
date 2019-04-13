package pl.skrzypczak.chathttpapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatApi {

  public static List<ChatMessage> chatMessage=new ArrayList<>();

  @PostMapping("/handleChatMessage")
  @ResponseBody
  public void handleChatMessage(@RequestBody ChatMessage chatMessage){
    this.chatMessage.add(chatMessage);
    System.out.println(chatMessage);
  }
//
//  @GetMapping("/windows")
//  public String getWindows(Model model){
//    model.addAttribute("chatMessage", chatMessage);
//    return "chat";
//  }

}
