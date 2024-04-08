-- Steps to make a demo project for GraphQL.
1). create a maven project and add all the necessory dependencies including GraphQL dependency.
2). create a project performing basic CRUD operations.
3). Now create a controller class. the mappings are different in graphQL as compared to REST API.
4). Now create a graphQL package in resources package and add a file in which we will have to write the schema for graphQL. Its extension should be .graphqls
5). Now open postman and add the port url (http://localhost:/8009/graphql) this will be the port from which we will perform our operations.
6). Now select GraphQL and add a query like (  query {
                                                  getBook(bookId:2){
                                                    id
                                                    title
                                                    desc
                                                    pages
                                                    price
                                                    author
                                                  }
                                                })
