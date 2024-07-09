/**
 * 读取指定代码文件
 */

package com.InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeReader {
    /**
     * 读取指定文件路径的文件内容，并返回文件内容的字符串形式。
     *
     * @param filePath 文件的路径，可以是相对路径或绝对路径。
     * @return 文件的全部内容，以字符串形式呈现。
     * @throws IOException 如果在读取文件过程中发生I/O错误。
     */
    public static String readFile(String filePath) throws IOException {
        // 使用StringBuilder拼接文件的每一行内容。
        StringBuilder code = new StringBuilder();

        // 使用try-with-resources语句确保文件读取后能自动关闭。
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // 逐行读取文件内容，直到文件末尾。
            while ((line = br.readLine()) != null) {
                // 将读取的每一行内容追加到StringBuilder中，并添加换行符以模拟文件中的行末换行。
                code.append(line).append("\n");
            }
        }
        // 打印读取到的文件内容
        System.out.println("----------------------------------------------------------");
        System.out.println("成功读取文件"+filePath);
        System.out.println("----------------------------------------------------------");
        // 返回StringBuilder中拼接好的文件全部内容。
        return code.toString();
    }

}

