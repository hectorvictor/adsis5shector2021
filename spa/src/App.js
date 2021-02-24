import logo from './logo.svg';
import './App.css';
import MyCorEdit from './components/myCor/mycor-edit';
// import HelloWorld from './components/hello-world';
// import ContadorBasico from './components/contador-basico';
// import ContadorNovo from './components/contador-novo';
// import ConsultaSql from './components/consulta-sql';
import PaisEdit from './components/pais/pais-edit';

function App() {
  var mensagens = "";
  for (let index = 0; index < 10; index++) {
    mensagens += "Ulha! ";
  }
  return (
    <div>
      <MyCorEdit />
    </div>
  );
}

export default App;
