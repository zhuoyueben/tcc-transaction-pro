package org.mengyun.tcctransaction.sample.http.capital.web.controller;

import org.mengyun.tcctransaction.sample.http.capital.api.CapitalTradeOrderService;
import org.mengyun.tcctransaction.sample.http.capital.api.dto.CapitalTradeOrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by changming.xie on 4/12/17.
 */

@Controller
@RequestMapping("/capital")
public class CapitalController {

    @Autowired
    CapitalTradeOrderService capitalTradeOrderService;

    @RequestMapping(value = "/record", method = RequestMethod.POST)
    public void record(@RequestParam String redPacketPayAmount,
                       @RequestParam long shopId,
                       @RequestParam long payerUserId,
                       @RequestParam long productId) {

        CapitalTradeOrderDto tradeOrderDto = null;
        capitalTradeOrderService.record(tradeOrderDto);
    }

}
