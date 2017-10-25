package io;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by zwd on 2017/10/25.
 */
public class FileTest {

    @Test
    public void testPath() {
        assertThat(File.separator).isEqualTo("/");
        assertThat(File.pathSeparator).isEqualTo(":");
    }

    @Test
    public void testCreate() {
        // 文件操作相关
        File file = new File("a.txt");
        try {
            file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        assertThat(file.exists()).isTrue();
        assertThat(file.isFile()).isTrue();
    }

    @Test
    public void testDelete() {
        File file = new File("a.txt");
        file.delete();
        assertThat(file.exists()).isFalse();
    }

    @Test
    public void testDirectory() {
        File file = new File("/Users/zhang/develop");
        assertThat(file.isDirectory()).isTrue();
        assertThat(file.isAbsolute()).isTrue(); // 是不是绝对路径
    }

    @Test
    public void testFileOperation() {
        File file = new File("/Users/zhang/develop");
        assertThat(file.canExecute()).isTrue();
        assertThat(file.canRead()).isTrue();
        assertThat(file.canWrite()).isTrue();
    }

    @Test
    public void testFileInfo() {
        File file = new File("/Users/zhang/develop");
        assertThat(file.getName()).isEqualTo("develop");
        assertThat(file.getAbsolutePath()).isEqualTo("/Users/zhang/develop");
        try {
            assertThat(file.getCanonicalPath());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        assertThat(file.getPath());
        assertThat(file.getParent());
        assertThat(file.getParentFile());
//        file.renameTo(new File("c.txt")); // 重命名
//
//        // 获取常规文件信息
//        assertThat(file.length());
//        assertThat(file.lastModified());
    }
}
