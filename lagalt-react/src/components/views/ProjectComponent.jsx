import { useEffect, useState } from 'react'

const ProjectComponent = ({project}) => {
    //useState 
    console.log(project)
    const user = "user";
    const category = "category";
    const time = "5 h "
    const skills = ["skill 1", "skill 2", "skill 3", "skill 4", "skill 5",]
  return (
    <div className="projectComponent">
        <p> category: {category} *posted by {user}, {time} ago</p>
        <h1>{project}</h1>
        <ul>
        {skills.map((item, i) => <li>{item}</li>)}
        </ul>
        <img src="https://source.unsplash.com/1600x900" alt="" />
    </div>
  )
}

export default ProjectComponent;