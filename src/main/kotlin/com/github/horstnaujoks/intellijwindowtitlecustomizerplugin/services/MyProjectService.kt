package com.github.horstnaujoks.intellijwindowtitlecustomizerplugin.services

import com.intellij.openapi.project.Project
import com.github.horstnaujoks.intellijwindowtitlecustomizerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
