package top.bitqian.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.bitqian.entity.RoomInfo;
import top.bitqian.service.RoomInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author echo lovely
 * @date 2020/12/21 19:57
 */

@RestController
public class RoomInfoController {

    @Resource
    private RoomInfoService roomInfoService;

    @PostMapping("/room/add")
    public String addRoomInfo(RoomInfo roomInfo) {

        roomInfoService.addRoomInfo(roomInfo);

        return "ok";
    }

    @PostMapping("/room/upd")
    public String updateRoomInfo(RoomInfo roomInfo) {

        roomInfoService.updateRoomInfo(roomInfo);

        return "ok";
    }

    @RequestMapping("/room/del/{id}")
    public String deleteRoomInfoById(@PathVariable("id") Integer roomId) {

        roomInfoService.deleteRoomInfoById(roomId);

        return "ok";
    }

    @GetMapping("/room/one/{id}")
    public ModelAndView getRoomInfoById(@PathVariable("id") Integer roomId) {

        // return roomInfoService.getRoomInfoById(roomId);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("/upd.jsp");

        modelAndView.addObject("roomInfo", roomInfoService.getRoomInfoById(roomId));

        return modelAndView;
    }

    @GetMapping("/room/all")
    public List<RoomInfo> getRoomInfoList() {

        return roomInfoService.getRoomInfoList();
    }

}
