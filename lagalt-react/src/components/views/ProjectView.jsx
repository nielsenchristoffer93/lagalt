import { useEffect, useState } from 'react'
import ProjectComponent from './ProjectComponent'
import ProjectRecomended from './ProjectRecomended'
import ProjectFilterComponent from './ProjectFilterComponent'
import './ProjectViewStyle.css'

const ProjectView = () => {

    const projects = ["asd", "qwe", "lol", "kalle", "anka"];


  return (
    <div  className="projectList">

        <ProjectRecomended/>
        <br/>
        <div>Filter projects</div>
        <ProjectFilterComponent/>
        {projects.map((project, i) => <ProjectComponent project={project} key={i} />)}
        
    </div>
  )
}

export default ProjectView;