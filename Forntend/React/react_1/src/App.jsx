 import './App.css'; // external CSS

function App() {
  const style = {
    color: 'red',
    backgroundColor: 'yellow'
  };

  return (
    <div>
      <h1 style={style}>Hello World</h1>
      <h1 style={style}>Hello js</h1>
      {/* You could use <React.Fragment> here if needed */}
    </div>
  );
}

export default App;
