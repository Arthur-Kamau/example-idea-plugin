package com.github.arthur-kamau.exampleideaplugin.services

import com.intellij.openapi.project.Project
import com.github.arthur-kamau.exampleideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
