/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package nia.chapter2.clientDemo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author alex
 * @version $Id: HelloClientHandler.java, v 0.1 2018年06月10日 下午9:23 alex Exp $
 */
public class HelloClientHandler extends SimpleChannelInboundHandler<String> {

    //服务端发送信息时触发此方法
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
        System.out.println("Server say : " + s);
    }

    //连接成功时触发此方法
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client active ");
        super.channelActive(ctx);
    }

    //服务器关闭时触发此方法
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client close ");
        super.channelInactive(ctx);
    }
}