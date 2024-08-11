import React from 'react'
import '../App.css'

const Home = () => {
  return (
    <div align="center">
    
      <a href="/allbonds" class="btn btn-primary" align="center">View Bonds</a>
      <a href="/allbooks" class="btn btn-info "  align="center">View Books</a>
      <a href="/alltrades" class="btn btn-success" role="button" align="center">View Trades</a>
      {/* <a href="/adduser" class="btn btn-warning" role="button" align="center">Add User</a> */}

      </div>
  );
}

export default Home