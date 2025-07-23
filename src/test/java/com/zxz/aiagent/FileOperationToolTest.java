package com.zxz.aiagent;

import com.zxz.aiagent.tools.FileOperationTool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FileOperationToolTest {

    @Test
    public void testReadFile()
    {
        FileOperationTool tool = new FileOperationTool();
        String fileName = "李明博自传.txt";
        String result = tool.readFile(fileName);
        assertNotNull(result);
    }

    @Test
    public void testWriteFile()
    {
        FileOperationTool tool = new FileOperationTool();
        String fileName = "李明博自传.txt";
        String content = "在失去的所有人中，我最怀念我自己";
        String result = tool.writeFile(fileName, content);
        assertNotNull(result);
    }











}
