package com.zxz.aiagent;


import com.zxz.aiagent.tools.WebScrapingTool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class WebScrapingToolTest {

    @Test
    public void testScrapeWebPage()
    {
        WebScrapingTool tool = new WebScrapingTool();
        String result = tool.scrapeWebPage("https://baidu.com");
        assertNotNull(result);
    }

}
