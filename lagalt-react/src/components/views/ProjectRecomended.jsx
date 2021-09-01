import { useEffect, useState } from 'react'
import { Card, Col, Row } from 'react-bootstrap';
const ProjectRecomended = () => {

  const ProjectRecomended = ["asd", "qwe", "lol", "kalle"];


  return (
    <div>
        We recomend a bag Mac
        <Row>
        {ProjectRecomended.map((item, i) => 
        <Col>
        <Card>
        <Card.Body>
            <Card.Title>{item}</Card.Title>
        <Card.Text>
          Some quick example text to build on the card title and make up the bulk of
          the card's content.
        </Card.Text>
        </Card.Body>
        <Card.Img variant="bottom" src="https://source.unsplash.com//180x180" />
        </Card>
        </Col>
        )}
        </Row>

    </div>
  )
}

export default ProjectRecomended;