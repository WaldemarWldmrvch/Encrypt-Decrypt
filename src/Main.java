import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String mode = "enc"; // базовый режим работы программы, если не указан иной режим
        String fileToRead = ""; // файл для чтения из него информации
        String fileToWrite = ""; // файл для записи зашифрованного (расшифрованного) сообщения
        String message = ""; // базовое значение сообщения для работы, если нет иных
        String algorithm = "shift"; // базовое значение алгоритма
        int key = 0; // базовое значение ключа, если не указан иной
        boolean needToReadFromFile = false; // флаг, есть ли файл для считывания данных
        boolean dataText = false; // флаг, есть ли данные в -data
        boolean needWriteInFile = false; // флаг, нужно ли записывать в файл результат
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                mode = args[i + 1];
            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-data")) {
                message = (args[i + 1]);
                dataText = true;
            } else if (args[i].equals("-in")) {
                fileToRead = args[i + 1];
                needToReadFromFile = true;
            } else if (args[i].equals("-out")) {
                fileToWrite = args[i + 1];
                needWriteInFile = true;
            } else if (args[i].equals("-alg")) {
                algorithm = args[i + 1];
            }
        }
        switch (mode) {
            case "enc":
              if (dataText == true && needToReadFromFile == true) {
                  if ("shift".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  } else if ("unicode".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  }

              } else if (dataText == true && needToReadFromFile == false) {
                  if ("shift".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  } else if ("unicode".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  }

              } else if (dataText == false && needToReadFromFile == true) {
                  if ("shift".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  } else if ("unicode".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  }

              } else if (dataText == false && needToReadFromFile == false) {
                  if ("shift".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  } else if ("unicode".equals(algorithm)) {
                      Encrypt encrypt = new Encrypt();
                      encrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                  }

              }
              break;
            case "dec":
                if (dataText == true && needToReadFromFile == true) {
                    if ("shift".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    } else if ("unicode".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    }

                } else if (dataText == true && needToReadFromFile == false) {
                    if ("shift".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    } else if ("unicode".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    }

                } else if (dataText == false && needToReadFromFile == true) {
                    if ("shift".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    } else if ("unicode".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    }

                } else if (dataText == false && needToReadFromFile == false) {
                    if ("shift".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoShift(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    } else if ("unicode".equals(algorithm)) {
                        Decrypt decrypt = new Decrypt();
                        decrypt.DoUnicode(message, key, needWriteInFile, fileToWrite, needToReadFromFile, fileToRead);
                    }
                }
                break;
        }
    }
}

