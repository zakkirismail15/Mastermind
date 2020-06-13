/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import static java.util.stream.Collectors.toMap;

/**
 *
 * @author user
 */
public class Score {

    protected ArrayList<String> scoreboard;
    protected ArrayList<String> duplicate;
    protected static ArrayList<String> username;
    protected static ArrayList<String> score;
    protected HashMap<Integer, String> sorting;
    protected Set<String> hs;
    protected boolean flag;
    private int userscore = 0;
    private static double mode;
    private static double time;
    private static double chances;
    private static String name;

    public Score() {
        this.scoreboard = new ArrayList<>();
        this.duplicate = new ArrayList<>();
        this.sorting = new HashMap<>();
        this.username = new ArrayList<>();
        this.score = new ArrayList<>();
        this.hs = new HashSet<>();
        this.flag = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setChances(int chances) {
        this.chances = chances + 1;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void score() {
        userscore = (int) ((1 / (1 + (chances * time))) * 100000 * mode);
    }

    public void write() {
        try {
            FileWriter tulis = new FileWriter("Scoreboard.txt", true);
            BufferedWriter save = new BufferedWriter(tulis);

            save.write(userscore + "\t" + name);
            save.newLine();
            save.flush();
            save.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void read() {

        try {

            Scanner reading = new Scanner(new FileInputStream("Scoreboard.txt"));

            while (reading.hasNext()) {
                this.scoreboard.add(reading.next());
            }

            reading.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public void sorting() {
        read();
        for (int x = 0; x < this.scoreboard.size(); x++) {
            this.flag = true;

            for (int y = 0; y <= this.scoreboard.size() - 2; y += 2) {

                if (x % 2 != 0) {
                    break;
                }

                if (x == y) {
                    y += 2;
                    if (y <= this.scoreboard.size()) {
                        break;
                    }
                }

                if ((this.scoreboard.get(x + 1).equals(this.scoreboard.get(y + 1)))) {
                    break;
                }

                if (Integer.parseInt(this.scoreboard.get(x)) == Integer.parseInt(this.scoreboard.get(y)) && !(this.scoreboard.get(x + 1).equals(this.scoreboard.get(y + 1)))) {
                    this.duplicate.add(this.scoreboard.get(x + 1) + " " + this.scoreboard.get(x));
                    System.out.println(this.scoreboard.get(x + 1));
                    this.flag = false;
                    ++x;
                }
            }

            if (flag == true) {
                sorting.put(Integer.parseInt(scoreboard.get(x++)), scoreboard.get(x));
            }
            flag = true;
        }

        hs.addAll(duplicate);
        duplicate.clear();
        duplicate.addAll(hs);

        int y = 0;

        Map<Integer, String> sorted = sorting
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        for (Integer name : sorted.keySet()) {

            String key = sorted.get(name).toString();
            String value = name.toString();

            for (int a = 0; a < duplicate.size(); a++) {

                String swap = duplicate.get(a).substring(duplicate.get(a).lastIndexOf(" ") + 1);
                int same = Integer.parseInt(swap);
                String rephrase = duplicate.get(a).substring(0, duplicate.get(a).indexOf(" "));

                if (name == same) {
                    ++y;

                    this.username.add(rephrase);
                    this.score.add(swap);

                    if (y == 10) {
                        break;
                    }
                }
            }

            if (y == 10) {
                break;
            }
            ++y;

            this.username.add(key);

            this.score.add(value);
        }
    }

    public ArrayList<String> getUsername() {
        sorting();
        return username;
    }

    public ArrayList<String> getScore() {

        return score;
    }
}
