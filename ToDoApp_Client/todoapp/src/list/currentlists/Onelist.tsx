import React from "react";
import "./onelist.scss";

class OneList extends React.Component {
  render() {
    return (
      <div className="form-style row">
        <div className="flex-container">
          <div className="card card-style">
            <div className="card-body">
              <h5 className="card-title">Shopping card</h5>
              <p className="card-text">
                ide lesz írva hogy mivel kapcsolatos a vásárlás
              </p>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default OneList;
