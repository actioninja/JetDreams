package com.github.actioninja.jetdreams.services

import com.github.actioninja.jetdreams.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
