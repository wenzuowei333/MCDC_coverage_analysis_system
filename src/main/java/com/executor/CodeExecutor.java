package com.executor;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CodeExecutor {

    /**
     * 在控制台上编译并执行指定路径的Java代码，并返回执行结果。
     *
     * @param filePath Java源代码文件的路径。
     * @param args 传递给Java程序的命令行参数。
     * @return Java程序的执行输出。
     */
    // 执行 Java 代码，支持传递参数
    public static String executeJavaCode(String filePath, String[] args) {
        // 用于累积程序执行的输出
        StringBuilder output = new StringBuilder();
        try {
            // 打印测试输入供参考
            System.out.println("当前测试输入：" + Arrays.toString(args));
            // 构建编译Java源代码的命令
            String compileCommand = "javac " + filePath;
            // 执行编译命令
            Process compileProcess = Runtime.getRuntime().exec(compileCommand);
            // 等待编译过程完成
            compileProcess.waitFor();
            // 打印编译过程的输出
            printProcessOutput(compileProcess, "编译输出");

            // 构建运行Java类的命令，包括类路径和命令行参数
            String runCommand = "java -cp src\\main\\java com.example." + getClassName(filePath);
            if (args != null) {
                for (String arg : args) {
                    runCommand += " " + arg;
                }
            }

            // 执行运行命令
            Process runProcess = Runtime.getRuntime().exec(runCommand);
            // 读取运行过程的输出
            BufferedReader reader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                // 将输出追加到结果字符串中
                output.append(line).append("\n");
            }
            // 等待运行过程完成
            runProcess.waitFor();
            // 打印运行过程的输出
            printProcessOutput(runProcess, "运行输出");
        } catch (IOException | InterruptedException e) {
            // 打印异常信息
            e.printStackTrace();
        }
        // 返回程序执行的输出结果
        return output.toString();
    }


    // 执行 Python 代码，支持传递参数
    public static String executePythonCode(String filePath, String[] args) {
        StringBuilder output = new StringBuilder();
        try {
            System.out.println("当前测试输入：" + Arrays.toString(args));
            String runCommand = "python " + filePath;
            if (args != null) {
                for (String arg : args) {
                    runCommand += " " + arg;
                }
            }

            Process runProcess = Runtime.getRuntime().exec(runCommand);
            BufferedReader reader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            runProcess.waitFor();
            printProcessOutput(runProcess, "运行输出");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    // 执行 C 代码，支持传递参数
    public static String executeCCode(String filePath, String[] args) {
        StringBuilder output = new StringBuilder();
        try {
            System.out.println("当前测试输入：" + Arrays.toString(args));

            // 编译 C 文件
            String outputFilePath = filePath.replace(".c", "");
            String compileCommand = "gcc " + filePath + " -o " + outputFilePath;
            Process compileProcess = Runtime.getRuntime().exec(compileCommand);
            compileProcess.waitFor();
            printProcessOutput(compileProcess, "编译输出");

            // 运行 C 文件
            String runCommand = "./" + outputFilePath;
            if (args != null) {
                for (String arg : args) {
                    runCommand += " " + arg;
                }
            }

            Process runProcess = Runtime.getRuntime().exec(runCommand);
            BufferedReader reader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            runProcess.waitFor();
            printProcessOutput(runProcess, "运行输出");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    private static void printProcessOutput(Process process, String processType) throws IOException {
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s;
        System.out.println("标准" + processType + "输出:");
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println("标准" + processType + "错误:");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }

    // 获取 Java 类名
    private static String getClassName(String filePath) {
        String fileName = new File(filePath).getName();
        return fileName.substring(0, fileName.lastIndexOf('.'));
    }
}
