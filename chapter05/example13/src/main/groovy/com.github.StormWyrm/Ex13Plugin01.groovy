package com.github.StormWyrm

import org.gradle.api.Plugin
import org.gradle.api.Project

class Ex13Plugin01 implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.task("ex13Task01")<<{
            println '这是通过groovy项目中自定义的插件中自定以的任务'
        }
    }
}
