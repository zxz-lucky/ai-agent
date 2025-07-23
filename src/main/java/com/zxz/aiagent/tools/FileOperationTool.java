package com.zxz.aiagent.tools;

import cn.hutool.core.io.FileUtil;
import com.zxz.aiagent.constant.FileConstant;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

import java.io.File;
import java.io.IOException;

public class FileOperationTool {

    private final String FILE_DIR = FileConstant.FILE_SAVE_DIR + "/file";

    @Tool(description = "Read content from a file")
    public String readFile(@ToolParam(description = "Name of the file to read") String fileName) {
        String filePath = FILE_DIR + "/" + fileName;
        try {
            return FileUtil.readUtf8String(filePath);
        } catch (Exception e) {
            return "Error reading file: " + e.getMessage();
        }
    }


    @Tool(description = "write content to a file")
    public String writeFile(
           @ToolParam(description = "Name of the file to write") String fileName,
           @ToolParam(description = "Content to write to the file") String content) {

        String filePath = FILE_DIR + "/" + fileName;
        try{
            //创建目录
            FileUtil.mkdir(FILE_DIR);
            FileUtil.writeUtf8String(content, filePath);
            return "File written successfully to " + filePath;
        } catch (Exception o)
        {
            return "Error writing file: " + o.getMessage();
        }

    }









}
