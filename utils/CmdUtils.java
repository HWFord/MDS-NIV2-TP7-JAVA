package com.tactfactory.javaniveau2.tps.tp7.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CmdUtils {

  public static String runInCommandLine(File file, String command) throws IOException {
    StringBuilder result = new StringBuilder();

    if (file.isDirectory()) {
      Runtime rt = Runtime.getRuntime();
      Process pr = rt.exec(command, null, file);

      InputStream errorIn = pr.getErrorStream();
      BufferedReader readerError = new BufferedReader(new InputStreamReader(errorIn));
      String line = null;
      while ((line = readerError.readLine()) != null) {
        result.append(line + "\n");
      }

      InputStream in = pr.getInputStream();
      BufferedReader reader = new BufferedReader(new InputStreamReader(in));
      line = null;
      while ((line = reader.readLine()) != null) {
        result.append(line + "\n");
      }
    }else {
      result.append("Error not in a directory");
    }

    return result.toString();
  }
}
