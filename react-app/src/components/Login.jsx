import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';


const Login = () => {
    return (
        <div className='login template d-flex justify-content-center align-items-center 100-w vh-100 bg-primary'>
            <div className='40-w p-5 rounded bg-white'>
                <form>
                    <h3 className='text-center'>Sign In</h3>
                    <div className='mb-2 ms-2'>
                        <label htmlFor="email">Email &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <input type="email" placeholder="Enter Email" className='form control' />
                    </div>
                    <div className='mb-2 ms-2'>
                        <label htmlFor="password">Password &nbsp;</label>
                        <input type="password" placeholder="Enter Password" className='form control' />
                    </div>
                    <div className='d-grid'>
                        <button className='btn btn-primary'>Sign In</button>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default Login