package top.bitqian.mapper;

import top.bitqian.entity.RoomInfo;

import java.util.List;

/**
 * @author echo lovely
 */


public interface RoomInfoMapper {

    void addRoomInfo(RoomInfo roomInfo);

    void updateRoomInfo(RoomInfo roomInfo);

    void deleteRoomInfoById(Integer roomId);

    RoomInfo getRoomInfoById(Integer roomId);

    List<RoomInfo> getRoomInfoList();

}
