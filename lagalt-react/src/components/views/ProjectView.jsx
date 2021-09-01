import { useEffect, useState } from 'react'
import ProjectComponent from './ProjectComponent'
import './ProjectViewStyle.css'

const ProjectView = () => {

    const projects = ["asd", "qwe", "lol", "kalle", "anka"];


  return (
    <div  className="projectList">

        

        {projects.map((project, i) => <ProjectComponent project={project} key={i} />)}
        
    </div>
  )
}

export default ProjectView;