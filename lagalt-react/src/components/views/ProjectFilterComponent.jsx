import { useEffect, useState } from 'react'
import { Card, Form, Col, Row, Dropdown } from 'react-bootstrap';
import { faFilter,faSlidersH } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";


const ProjectFilterComponent = () => {

    const user = "user";
    const category = "category";
    const time = "5 h "
    const skills = ["skill 1", "skill 2", "skill 3", "skill 4", "skill 5",]
  return (
    <div className="searchContainer">
         <Form>
             <Row>
                <Col sm="3">
                    <Dropdown>
                    <Dropdown.Toggle id="dropdown-basic">
                        Categories
                    </Dropdown.Toggle>

                    <Dropdown.Menu>
                        <Dropdown.Item >Movie</Dropdown.Item>
                        <Dropdown.Item >Games action</Dropdown.Item>
                        <Dropdown.Item >Web development</Dropdown.Item>
                    </Dropdown.Menu>
                    </Dropdown>
                </Col>
                <Col sm="6">
                    <Form.Control type="text" placeholder="search" /> 
                </Col>
                <Col sm="2"></Col>
                <Col sm="1">
                <FontAwesomeIcon icon={faFilter} />
                <FontAwesomeIcon icon={faSlidersH} />
                </Col>
            </Row>
        </Form> 
    </div>
  )
}

export default ProjectFilterComponent;