package com.sonarsource.cinema;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to SonarSource Cinema!");
    printMovies();
  }

  public static void printMovies() {
    CsvParser csvParser = new CsvParser();
    csvParser.parseCsv("https://github.com/laxmimerit/All-CSV-ML-Data-Files-Download/blob/master/Restaurant%20-%20Foods.csv");
  }
}
