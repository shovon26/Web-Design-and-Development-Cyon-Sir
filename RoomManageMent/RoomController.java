package Controller;

import Model.Room;
import Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/rooms")
@Controller
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView ShowAllRoom()
    {
        ModelAndView allRooms=new ModelAndView();
        List<Room>list=roomService.getAllRooms();
        allRooms.addObject("rooms",list);
        allRooms.setViewName("Home");

        return allRooms;
    }

    @RequestMapping(value = "/addNew",method = RequestMethod.GET)
    public  ModelAndView addNewRoom(){
        ModelAndView allRooms=new ModelAndView();
        Room room=new Room();
        allRooms.addObject("room",room);
        allRooms.setViewName("roomForm");

        return allRooms;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ModelAndView saveRoom(@ModelAttribute("room") Room room){
        System.out.println(room.toString());

        roomService.saveorUpdate(room);
        return new ModelAndView("redirect:/rooms");
    }

    @RequestMapping(value = "/edit/{roomNo}",method = RequestMethod.GET)
    public ModelAndView updateRoom(@PathVariable("roomNo") String roomNo)
    {
        ModelAndView mv=new ModelAndView();
        Room room=roomService.getRoombyId(roomNo);
        mv.addObject(room);

        mv.setViewName("roomForm");
        return mv;
    }

    @RequestMapping(value = "/remove/{roomNo}",method = RequestMethod.GET)
    public ModelAndView removeRoom(@PathVariable("roomNo") String roomN)
    {
        roomService.removeRoom(roomN);
        return new ModelAndView("redirect:/rooms");
    }


}
