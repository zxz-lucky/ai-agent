package com.zxz.aiagent;

import com.zxz.aiagent.tools.ResourceDownloadTool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ResourceDownloadToolTest {

    @Test
    public void testDownloadResource() {
        ResourceDownloadTool tool = new ResourceDownloadTool();
        String url = "https://bkimg.cdn.bcebos.com/pic/8d5494eef01f3a292df50422007cab315c6035a8d69f?x-bce-process=image/format,f_auto/quality,Q_70/resize,m_lfit,limit_1,w_536";
        String fileName = "李明博.png";
        String result = tool.downloadResource(url, fileName);
        assertNotNull(result);
    }
}

