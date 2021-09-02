import { useEffect, useState } from 'react'
import ProjectComponent from './ProjectComponent'
import ProjectRecomended from './ProjectRecomended'
import ProjectFilterComponent from './ProjectFilterComponent'
import './ProjectViewStyle.css'
import axios from 'axios'
const ProjectView = () => {
  const [projects, setProjects] = useState(null)

/*   useEffect(() => {
    axios.get(`http://localhost:8080/api/v1/projects`)
  .then(res => {
      console.log(res)
    const projects = res.data;
    this.setProjects(projects);

  });
  }, []); */


  useEffect(() => {
    axios.get(`http://localhost:8080/api/v1/projects`).then((response) => {
      console.log(response)
      setProjects(response.data);
    })
    .catch((err) => {
      console.error(err);
    });
  }, []);

  

  //

    //const projects = ["asd", "qwe", "lol", "kalle", "anka"];


  return (
    <div  className="projectList">

        <ProjectRecomended/>
        <br/>
        <div>Filter projects</div>
        <ProjectFilterComponent/>
        
        {projects && projects.map((project, i) => <ProjectComponent
         title={project.title}
         description={project.description}
         projectTags={project.projectTags}
         skills={project.skills}
         key={i} />)}
        
    </div>
  )
}

export default ProjectView;