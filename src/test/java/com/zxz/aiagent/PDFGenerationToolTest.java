package com.zxz.aiagent;

import com.zxz.aiagent.tools.PDFGenerationTool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PDFGenerationToolTest {

    @Test
    public void testGeneratePDF() {
        PDFGenerationTool tool = new PDFGenerationTool();
        String fileName = "李明博.pdf";
        String content = "李明博 https://bkimg.cdn.bcebos.com/pic/8d5494eef01f3a292df50422007cab315c6035a8d69f?x-bce-process=image/format,f_auto/quality,Q_70/resize,m_lfit,limit_1,w_536";
        String result = tool.generatePDF(fileName, content);
        assertNotNull(result);
    }
}
