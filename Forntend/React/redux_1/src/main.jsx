import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import Component1 from './components/Component1'
import Component2 from './components/Component2'
import App from './App.jsx'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';
import { Provider } from 'react-redux'
import { countStore } from './CountStore.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* <App /> */}
    <Provider  store={countStore}>
    <Component1/>
    <Component2/>
    </Provider>
  </StrictMode>,
)
