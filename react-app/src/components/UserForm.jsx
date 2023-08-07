import React, {useState} from 'react'
import {useNavigate} from "react-router-dom"
import Form from 'react-bootstrap/Form'
import Row from 'react-bootstrap/Row';
import Button from 'react-bootstrap/Button';
 import { saveUser } from '../services/UserService';

const UserForm = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [role, setRole] = useState('');

  const navigate = useNavigate();


  const handleNameChange = (event) => {
    setName(event.target.value);
  }

  const handleEmail = (event) => {
    setEmail(event.target.value);
  }
  const handleRole = (event) => {
    setRole(event.target.value)
  }

 
  const handleSubmit = (event) => {
    event.preventDefault();
    let hero = {};
    hero.name = name;
    hero.email = email;
    hero.role = role;
    saveUser(hero) 
    .then(res => {
      setName('');
      setEmail('');
      setRole('');
      navigate("/")
    })
    .catch(err =>{
      console.log(err);
    })
  }
  return (
    <div class='col-sm-4 '> 
    <Row className='userForm' >
      <Form>
        <Form.Group className="mb-2" controlId="email">
          <Form.Label> Name: </Form.Label>
          <Form.Control type="text" placeholder="Name" value={name} onChange={handleNameChange} />
        </Form.Group>
        <Form.Group className="mb-3 " controlId="name">
          <Form.Label> Email: </Form.Label>
          <Form.Control type="text" placeholder="Email" value={email} onChange={handleEmail} />
        </Form.Group>
        <Form.Group className="mb-3" controlId="ability">
          <Form.Label> Role: </Form.Label>
          <Form.Control type="text" placeholder="Role" value={role} onChange={handleRole} />
        </Form.Group>

        <Button variant="primary" type="submit" onClick={handleSubmit}>
          Submit
        </Button>
      </Form>
    </Row>
    </div>
  )
}

export default UserForm