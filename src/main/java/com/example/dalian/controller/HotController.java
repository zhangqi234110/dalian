package com.example.dalian.controller;

import com.example.dalian.common.Common;
import com.example.dalian.pojo.Hot;
import com.example.dalian.service.HotService;
import com.example.dalian.tools.Seriaz;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张齐 on 2020/3/20 15:27
 */
@RestController
public class HotController {


    @RequestMapping("/hot")
    public Common hot(){
      List<Hot> list = new ArrayList<Hot>();
        Jedis jedis = new Jedis("localhost");

        System.out.println("水水水水或火狐吼吼");
        System.out.println("woaliel e e ");
            byte[] bytes1 = jedis.get(("热点数据1").getBytes());
            byte[] bytes2 = jedis.get(("热点数据2").getBytes());
            byte[] bytes3 = jedis.get(("热点数据3").getBytes());
            Hot unserizlize1 = (Hot)Seriaz.unserizlize(bytes1);
            Hot unserizlize2 = (Hot)Seriaz.unserizlize(bytes2);
            Hot unserizlize3 = (Hot)Seriaz.unserizlize(bytes3);
            list.add(unserizlize1);
            list.add(unserizlize2);
            list.add(unserizlize3);

       jedis.close();
        return new Common(200,"热点数据",list);


    }
}
