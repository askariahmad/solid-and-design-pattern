package com.learning.solidanddesignpattern.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem file) {
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println(name);
        for (FileSystem file : files) {
            file.ls();
        }
    }
}