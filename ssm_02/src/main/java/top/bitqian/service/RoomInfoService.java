package top.bitqian.service;

import top.bitqian.entity.RoomInfo;

import java.util.List;

/**
 * @author echo lovely
 * @date 2020/12/21 19:49
 */

public interface RoomInfoService {

    void addRoomInfo(RoomInfo roomInfo);

    void updateRoomInfo(RoomInfo roomInfo);

    void deleteRoomInfoById(Integer roomId);

    RoomInfo getRoomInfoById(Integer roomId);

    List<RoomInfo> getRoomInfoList();

}
