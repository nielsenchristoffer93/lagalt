import { useEffect, useState } from 'react'

const ProjectView = () => {

    const projects = ["asd", "qwe", "lol", "kalle", "anka"];


  return (
    <div  className="projectList">

        

        {projects.map((project, i) => <ProjectComponent project={project} key={i} />)}
        
    </div>
  )
}

export default ProjectView;