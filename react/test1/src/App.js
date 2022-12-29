import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';
import Notification from './components/Notification';
import Counter from './components/Counter';
import TextInputButton from './components/TextInputButton';
import Accommodate from './components/Accommodate';
import Toggle from './components/Toggle';
import MyButton from './components/MyButton';
import ConfirmButton from './components/ConfirmButton';
import Greeting from './components/Greeting';
import LoginControl from './components/LoginControl';
import MailBox from './components/MailBox';
import UserStatus from './components/UserStatus';
import WarningBanner from './components/WarningBanner';
import Mainpage from './components/Mainpage';
import NumberList from './components/NumberList';
import TeamPlayers from './components/TeamPlayers';
import NameForm from './components/NameForm';
import RequestForm from './components/RequestForm';
import FruitSelect from './components/FruitSelect';
import Reservation from './components/Reservation';
import WelcomeMessage from './components/WelcomeMessage';
import WelcomeDialog from './components/WelcomeDialog';
import SingUpDialog from './components/SignUpDialog';
import Card from './components/Card';
import ProfileCard from './components/ProfileCard';
import MainContent from './components/MainContent';
import DarkOrWhite from './components/DarkOrWhite';
import Container from './components/ex1/Container';
import WordContainer from './components/ex2/WordContainer';


function App() {
  return (
    <WordContainer />
  );
}

// function App() {
//   return (
//     <Comment user={comment.user} content={comment.content} replydate={comment.replydate} />
//   );
// }

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
