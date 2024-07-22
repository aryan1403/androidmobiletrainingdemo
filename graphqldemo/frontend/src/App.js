import logo from './logo.svg';
import './App.css';
import { gql, useQuery } from "@apollo/client";

function App() {
  const query = gql`
  query GetProducts {
    getTodos {
      id
      title
      completed
    }
  }
`;
  const {data, loading} = useQuery(query);
  if (loading) return <h1>Loading...</h1>;

  return (
    <>
    <h1>okay</h1>
    {console.log(data.getTodos)}
    <table>
      <tbody>
        {data.getTodos.map((todo) => (
          <tr key={todo.id}>
          <td>{todo.id}</td>
            <td>{todo.completed + ''}</td>
            <td>{todo.title}</td>
            <td>{todo.__typename}</td>
          </tr>
        ))}
      </tbody>
      </table>
    </>
  );
}

export default App;
