import React from 'react';
import './App.css';

function App() {
  const books = [
  { id: 101, bname: 'Master React', price: 670 },
  { id: 102, bname: 'Deep Dive into Angular 11', price: 800 },
  { id: 103, bname: 'Mongo Essentials', price: 450 },
];

  const courses = [
  { id: 201, bname: 'Angular', date: '4/5/2021' },
  { id: 202, bname: 'React', date: '6/3/2021' }
];

  const blogs = [
  { title: 'React Learning', author: 'Stephen Biz', desc: 'Welcome to learning React!' },
  { title: 'Installation', author: 'Schewzdenier', desc: 'You can install React from npm.' },
];

  const coursedet = (
    <ul>
      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.bname}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </ul>
  );
  const bookdet = (
    <ul>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );
  const blogdet = (
    <ul>
      {blogs.map((blog, index) => (
        <div key={index}>
          <h3>{blog.title}</h3>
          <p>{blog.author}</p>
          <p>{blog.desc}</p>
        </div>
      ))}
    </ul>
  );

  return (
  <div className="container">
    <div className="section">
      <h1>Course Details</h1>
      {coursedet}
    </div>

    <div className="section">
      <h1>Book Details</h1>
      {bookdet}
    </div>

    <div className="section">
      <h1>Blog Details</h1>
      {blogdet}
    </div>
  </div>
  );

}

export default App;
