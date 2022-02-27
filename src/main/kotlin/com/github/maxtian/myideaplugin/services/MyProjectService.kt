package com.github.maxtian.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.maxtian.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
