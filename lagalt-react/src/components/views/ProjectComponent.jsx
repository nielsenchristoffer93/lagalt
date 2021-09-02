import { useEffect, useState } from 'react'
import { Card } from 'react-bootstrap';

const ProjectComponent = ({title, description, projectTags,skills}) => {
    //useState 
    console.log(title)
    //console.log(project)
    const user = "user";
    const category = "category";
    const time = "5 h "
    //const skills = ["skill 1", "skill 2", "skill 3", "skill 4", "skill 5",]
  return (
    <Card className="projectComponent">
        <Card.Body>
            <Card.Text> category: {category} *posted by {user}, {time} ago</Card.Text>
        <Card.Title>{title}</Card.Title>
        <ul className="horizontal-list">
        {skills && skills.map((item, i) => <li>{item}  </li>)}
        </ul>
        </Card.Body>
        <img src="https://source.unsplash.com/1600x900" alt="" />
    </Card>
  )
}

export default ProjectComponent;