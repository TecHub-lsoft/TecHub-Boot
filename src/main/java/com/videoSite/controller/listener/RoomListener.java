package com.videoSite.controller.listener;

import com.videoSite.controller.listener.event.CreateRoomEvent;
import com.videoSite.utils.RedisTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.HashMap;

@Slf4j
@Component
public class RoomListener implements ServletContextAware {

    private static ServletContext servletContext;

    @Resource
    RedisTools<String> redisTools;
//
//    @EventListener
//    public void createRoomListener(CreateRoomEvent event) {
//        log.info("{}监听到事件源: {}", RoomListener.class.getName(), event.getSource());
//        HashMap<String, HallInfoDetail> rooms = (HashMap<String, HallInfoDetail>) servletContext.getAttribute("rooms");
//        if (rooms == null) {
//            rooms = new HashMap<>();
//            servletContext.setAttribute("rooms", rooms);
//        }
//        String roomNumber = (String) event.getSource();
//        //从redis中获取创建房间的用户
//        String username = redisTools.getFromRedis(RoomServiceImpl.ROOM_ID_USERNAME_TOKEN_KEY + roomNumber, "Redis中没有roomNumber对应的username");
//        UserDetail user = authMapper.findUserByUsername(username).orElseThrow(() -> new NotExistInMysqlException("数据库中没有该用户"));
//        HallInfoDetail miniRoom = HallInfoDetail.builder().roomNumber(roomNumber).username(username).image(user.getUserInfo().getIcon()).message(user.getUserInfo().getMessage()).build();
//        //将用户信息放入servletContext
//        rooms.put(roomNumber, miniRoom);
//        log.info("{}处理{}事件成功: {}", RoomListener.class.getName(), event.getSource());
//
//    }

//    @EventListener
//    public void addRoomListener(AddRoomEvent event) {
//        log.info("{}监听到事件源: {}", RoomListener.class.getName(), event.getSource());
//        HashMap<String, HallInfoDetail> rooms = (HashMap<String, HallInfoDetail>) servletContext.getAttribute("rooms");
//        String roomNumber = (String) event.getSource();
//        //将用户信息从servletContext删除
//        rooms.remove(roomNumber);
//        log.info("{}处理{}事件成功: 删除{}", RoomListener.class.getName(),event.getSource(),roomNumber);
//
//    }

    @Override
    public void setServletContext(final ServletContext servletContext) {
        RoomListener.servletContext = servletContext;
    }
}
