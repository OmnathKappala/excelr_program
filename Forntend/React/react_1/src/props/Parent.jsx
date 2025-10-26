 import Child from "./child";
const Parent = () => {
    let data="hello";
    return (
        <>
        
        <div>Parent</div>
        <Child d1={data} />
        </>
            
    )
}

export default Parent