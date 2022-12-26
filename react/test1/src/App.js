import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';

const comment = {
  user : {
    userName : '손흥민',
    imgUrl : 'https://images.app.goo.gl/LmmdtnHgXB3eQk839'
  },
  content : '대한민국 화이팅',
  replydate : '2022-12-25'
}

function App() {
  return (
    <Comment user={comment.user} content={comment.content} replydate={comment.replydate} />
  );
}

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

export default App;
