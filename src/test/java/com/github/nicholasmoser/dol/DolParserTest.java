package com.github.nicholasmoser.dol;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DolParserTest {
  @Test
  @Disabled("This test needs to be reformatted to use an actual dol")
  public void test() throws Exception {
    Path dolPath = Paths.get("D:\\GNT\\aaa\\uncompressed\\sys\\main_old.dol");
    DolParser parser = new DolParser(dolPath);
    Dol dol = parser.parse();
    System.out.println(dol);
    dol.writeToFile(Paths.get("D:\\GNT\\aaa\\uncompressed\\sys\\main.dol"));
  }
}
