package com.qf;

import org.csource.fastdfs.*;

public class TestFastDFS {
    public static void main(String[] args) throws Exception{

        //声明 tracker storage
        TrackerClient trackerClient = null;
        TrackerServer trackerServer = null;

        StorageClient storageClient=null;
        StorageServer storageServer = null;
        //1.加载配置文件
        ClientGlobal.init("client.conf");

        System.out.println(ClientGlobal.configInfo());

        //2.创建客户端
        trackerClient = new TrackerClient();
        trackerServer=trackerClient.getConnection();
        storageClient = new StorageClient(trackerServer,storageServer);
        String[] strings = storageClient.upload_file("D:\\java学习\\第四阶段\\day06\\myproject001\\fastdfstest1\\src\\main\\resources\\image4.jpg",
                "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
