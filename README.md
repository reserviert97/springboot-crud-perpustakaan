<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/reserviert97/springboot-crud-perpustakaan"></a>

  <h3 align="center">Simple CRUD REST API using Spring Boot</h3>

  <p align="center">
    <a href="https://springboot-perpustakaan.herokuapp.com/api/books">Check out Deployed App </a>
  </p>
</p>

<!-- ABOUT THE PROJECT -->
## About The Project

Features:
* Create
* Read
* Update
* Delete

### Built With
* [Spring Boot](https://spring.io/projects/spring-boot)


<!-- GETTING STARTED -->
## Getting Started

### Read All Book

* Url : /api/books
* Method : GET


### Read Book By Id

* Url : /api/books/{bookId}
* Method : GET

### Create Book

* Url : /api/books
* Method : POST
* Body :

```json
{
	"title": "Negri Di Ujung Tanduk",
	"publishedYear": 2014,
	"author": "Tere Liye",
	"isbn": "232-1232-2323"
}
```

### Update Book

* Url : /api/books/{bookId}
* Method : PUT
* Body :
```json
{
	"title": "Negri Di Ujung Tanduk",
	"publishedYear": 2014,
	"author": "Tere Liye",
	"isbn": "232-1232-2323"
}
```

### Delete Book

* Url : /api/books/{bookId}
* Method : DELETE


<!-- CONTACT -->
## Contributors

* Nurlatif Ardhi Pratama - [Github](https://github.com/reserviert97) - nurlatif97@outlook.com


