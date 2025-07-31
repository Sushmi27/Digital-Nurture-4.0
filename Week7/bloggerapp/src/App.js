import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [view, setView] = useState("book");

  // Using function return
  function getComponent() {
    if (view === "book") return <BookDetails />;
    else if (view === "blog") return <BlogDetails />;
    else if (view === "course") return <CourseDetails />;
    else return <p>No View Selected</p>;
  }

  return (
    <div className="App">
      <h1>📘 Blogger App</h1>

      <div style={{ marginBottom: "10px" }}>
        <button onClick={() => setView("book")}>Book</button>
        <button onClick={() => setView("blog")}>Blog</button>
        <button onClick={() => setView("course")}>Course</button>
      </div>

      {/* 1. Ternary operator */}
      {view === "book" ? <p>You selected Book</p> : null}

      {/* 2. Logical && */}
      {view === "blog" && <p>Blog view selected</p>}

      {/* 3. Function with if-else inside */}
      {getComponent()}
    </div>
  );
}

export default App;
