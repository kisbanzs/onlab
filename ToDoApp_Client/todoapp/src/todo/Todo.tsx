import React, { useState, useEffect } from "react";
import axios from "axios";
import "./todo.scss";
import User from "../models/User";

function OneList() {

  const [users, setUsers] = useState<User[]>([]);

  const getUsers = () => {
    axios.get("http://localhost:5003/api/users").then(function (response) {
      setUsers(response.data);
    });
  };

  useEffect(() => {
    getUsers();
  }, []);

  return (
    <div className="todo-style">
      <div className="container">
        <div className="row">
          <div className="col">
            <form className="form-inline">
              <select className="form-control form-group mb-2">
                {users && users.map(user => <option>{user.username}</option>)}
              </select>
              <div className="form-group mb-2">
                <input
                  type="password"
                  className="form-control"
                  id="who"
                  placeholder="who?"
                />
              </div>
              <div className="form-group mx-sm-3 mb-2">
                <label htmlFor="newtodo" className="sr-only">
                  add newtodo
                  </label>
                <input
                  type="password"
                  className="form-control"
                  id="newtodo"
                  placeholder="add newtodo"
                />
              </div>
              <select className="form-control form-group mb-2">
                <option>Monday</option>
                <option>Tuesday</option>
                <option>Wednesday</option>
                <option>Thursday</option>
                <option>Friday</option>
                <option>Saturday</option>
                <option>Sunday</option>
              </select>
              <button type="button" className="btn btn-primary mb-2">
                Add todo
                </button>
            </form>
          </div>

          <div className="row">
            <div className="col">
              <ul className="list-group list-style">
                <li className="list-group-item active">
                  Peter list elements:
                  </li>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
              </ul>

              <ul className="list-group list-style">
                <li className="list-group-item active">Eva list elements:</li>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
              </ul>

              <ul className="list-group list-style">
                <li className="list-group-item active">
                  Adam list elements:
                  </li>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
                <div
                  className="btn-group"
                  role="group"
                  aria-label="Basic example"
                >
                  <li className="list-group-item">element</li>
                  <button type="button" className="btn btn-secondary">
                    Delete
                    </button>
                </div>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  );

}

export default OneList;
