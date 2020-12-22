package top.bitqian.service.impl;

import org.springframework.stereotype.Service;
import top.bitqian.entity.RoomInfo;
import top.bitqian.mapper.RoomInfoMapper;
import top.bitqian.service.RoomInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author echo lovely
 * @date 2020/12/21 19:50
 */

@Service
public class RoomInfoServiceImpl implements RoomInfoService {

    @Resource
    private RoomInfoMapper roomInfoMapper;

    @Override
    public void addRoomInfo(RoomInfo roomInfo) {

        roomInfoMapper.addRoomInfo(roomInfo);

    }

    @Override
    public void updateRoomInfo(RoomInfo roomInfo) {

        RoomInfo oldRoomInfo = roomInfoMapper.getRoomInfoById(roomInfo.getRoomId());

        // upd sth
        oldRoomInfo.setPrice(roomInfo.getPrice());
        oldRoomInfo.setRoomStatus(roomInfo.getRoomStatus());
        oldRoomInfo.setRoomType(roomInfo.getRoomType());

        roomInfoMapper.updateRoomInfo(oldRoomInfo);
    }

    @Override
    public void deleteRoomInfoById(Integer roomId) {

        roomInfoMapper.deleteRoomInfoById(roomId);

    }

    @Override
    public RoomInfo getRoomInfoById(Integer roomId) {
        return roomInfoMapper.getRoomInfoById(roomId);
    }

    @Override
    public List<RoomInfo> getRoomInfoList() {
        return roomInfoMapper.getRoomInfoList();
    }

}
