package com.InputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CodeWriter {
    /**
     * 将指定的内容写入到指定路径的文件中。
     *
     * 此方法会创建新文件或覆盖已存在的文件。如果目标文件所在的目录不存在，
     * 将抛出 IOException。
     *
     * @param filePath 文件的路径。路径可以是相对路径或绝对路径。
     *                 如果路径是相对路径，则相对于当前工作目录。
     * @param content 要写入文件的内容。该内容将被转换为字节序列并写入文件。
     * @throws IOException 如果发生I/O错误，例如无法访问、创建或写入文件。
     */
    public static void writeFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }

    /**
     * 使用指定后缀和内容写入文件。
     * 此方法根据原文件路径及指定后缀创建新文件，并将指定内容写入该新文件中。
     * 文件路径预期为.java文件，后缀将添加在原.java后，与之拼接形成新文件名。
     *
     * @param filePath 原始文件路径，期望为.java文件。
     * @param suffix 要添加的后缀，该后缀将在原.java后追加。
     * @param content 要写入新文件的内容。
     * @throws IOException 写入文件时发生I/O错误。
     */
    public static void writeFileWithSuffix(String filePath, String suffix, String content) throws IOException {
        // 替换原.java后缀为新后缀并加上.java，生成新文件路径
        String newFilePath = filePath.replace(".java", suffix + ".java");
        // 将内容写入根据新文件路径指定的新文件
        Files.write(Paths.get(newFilePath), content.getBytes());
        // 输出新创建的文件保存路径
        System.out.println("文件已保存为: " + newFilePath);
    }
}
