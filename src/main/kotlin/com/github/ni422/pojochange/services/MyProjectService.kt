package com.github.ni422.pojochange.services

import com.intellij.openapi.project.Project
import com.github.ni422.pojochange.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
