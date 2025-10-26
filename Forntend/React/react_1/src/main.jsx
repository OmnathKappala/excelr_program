 import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.bundle.min.js'

import App from './App.jsx'
import FunctionalComponent from './components/Functional.jsx'
import ClassComponent from './components/ClassComponent.jsx'
import State from './hooks/State.jsx'
import Parent from './props/parent.jsx'
import Container from './components/Container.jsx'
//  import  GrandFather from './props/PropsDrilling.jsx'
 import GrandFather from './props/context/FamilyTree.jsx'
 import { FamilyContext } from './props/context/FamilyContext.jsx'
import LoginPage from './props/context/AuthApplication.jsx'
import Control from './components/Control.jsx'
import Uncontroled from './components/Uncontroled.jsx'
import PureComponentExample from './components/PureComponentExample.jsx'
import HigherorderExample from './components/HigherorderExample.jsx'
import User from './components/User.jsx'
import EventExample1 from './events/EventExample1.jsx'
import EventExample2 from './events/EventExample2.jsx'
import EventExample3 from './events/EventExample3.jsx'
const HigherorderComponent=HigherorderExample(User);


createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* <App /> */}
    {/* < FunctionalComponent/> */}
    {/* <ClassComponent/> */}
    {/* <State/> */}
    {/* <Parent/> */}
    {/* <Container/> */}
    {/* <GrandFather /> */}
    {/* <GrandFather/> */}
    {/* <LoginPage/> */}
    {/* <Control/> */}
    {/* <Uncontroled/> */}
    {/* <PureComponentExample/> */}
    {/* <HigherorderComponent/> */}
    
{/* <EventExample1 /> */}
{/* <EventExample2/> */}
<EventExample3/>
  </StrictMode>,
)